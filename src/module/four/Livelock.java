package module.four;

import module.three.strategy.HealingEffect;
import module.three.strategy.Potion;

import java.util.concurrent.atomic.AtomicBoolean;

public class Livelock {
    private static final Potion heal = new Potion(new HealingEffect());

    private static final AtomicBoolean t1Active = new AtomicBoolean(true);
    private static final AtomicBoolean t2Active = new AtomicBoolean(true);

    private static volatile Object healOwner = "t1";

    public static void sleep() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Thread startThread(AtomicBoolean activeSubOne, AtomicBoolean activeSubTwo, String owner, String other) {
        return new Thread(() -> {
            while (activeSubOne.get()) {
                if (!owner.equals(healOwner)) {
                    sleep();
                    continue;
                }

                if (activeSubTwo.get()) {
                    System.out.println("Heal potion is your, " + other + "!");
                    healOwner = other;
                    sleep();
                    continue;
                }

                heal.drink();
                activeSubOne.set(false);
            }
        });
    }

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = startThread(t1Active, t2Active, "t1", "t2");

        Thread t2 = startThread(t2Active, t1Active, "t2", "t1");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
