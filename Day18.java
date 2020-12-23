import java.util.Scanner;

public class Main {
    public static int fib(int n) {
        if(n < 2) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static class MyThread extends Thread {
        public int n;
        public MyThread(int n) {
            this.n = n;
        }

        @Override
        public void run() {
            System.out.println(fib(n));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
           Thread thread = new MyThread(n);
           thread.start();
        }
    }
}
