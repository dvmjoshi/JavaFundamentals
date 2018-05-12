
public class inter implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is message #" + i);

            if (Thread.interrupted()) {
                System.out.println("I'm about to stop");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new inter());
        t1.start();

        try {
            Thread.sleep(500);
            t1.interrupt();

        } catch (InterruptedException ex) {
            // do nothing
        }

    }
}