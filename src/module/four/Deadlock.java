package module.four;

import module.three.strategy.HealingEffect;
import module.three.strategy.Potion;
import module.three.strategy.StrengthEffect;

public class Deadlock {
    private static final Potion heal = new Potion(new HealingEffect());
    private static final Potion strength = new Potion(new StrengthEffect());

    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            synchronized (heal){
                heal.drink();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Trying to get strength...");
                synchronized (strength){
                    strength.drink();
                    System.out.println("I HAVE THE POWER!!!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (strength){
                strength.drink();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Trying to get heal...");
                synchronized (heal){
                    heal.drink();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
