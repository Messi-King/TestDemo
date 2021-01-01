存在线程安全问题
public class Test {
    private static final int COUNT = 100_0000;
    private static int n = 0;

    static class Adder extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < COUNT; i++) {
                    n++;
                }
          }
    }

    static class Suber extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < COUNT; i++) {
                    n--;
                }
          }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Adder();
        Thread t2 = new Suber();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(n);
    }
}