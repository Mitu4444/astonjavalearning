package module.four;

public class OneTwo {
    private static final Object lock = new Object();
    private static boolean turnIsOne = true;

    public static Thread startThread(boolean threadTurn, String toOut) {
        return new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (turnIsOne != threadTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.println(toOut);
                    turnIsOne = !threadTurn;
                    lock.notifyAll();
                }
            }
        });

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = startThread(true, "1");
        Thread t2 = startThread(false, "2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
