
public class HomeWork {
     public static int findOnceNumber(int[] arr) {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            a = a ^ arr[i];
        }
        return a;
    }

    public static int fib(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n ; i++) {
            f3 = f1+f2;
            //确定f1 f2的新的值
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main(String[] args) {
        System.out.println(fib(40));/*
        System.out.println(fib(5));
        System.out.println(fib(40));*/

        /*int[] array = {2,5,1,2,1};
        int ret = findOnceNumber(array);
        System.out.println(ret);*/
    }
}
