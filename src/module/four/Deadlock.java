package module.four;

import module.three.strategy.HealingEffect;
import module.three.strategy.Potion;
import module.three.strategy.StrengthEffect;

public class Deadlock {
    private static final Potion heal = new Potion(new HealingEffect());
    private static final Potion strength = new Potion(new StrengthEffect());

    public static Thread startThread(Potion one, Potion two) {
        return new Thread(() -> {
            synchronized (one) {
                one.drink();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Trying to get other potion...");
                synchronized (two) {
                    two.drink();
                    System.out.println("I HAVE THE POWER!!!");
                }
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = startThread(heal, strength);
        Thread t2 = startThread(strength, heal);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
