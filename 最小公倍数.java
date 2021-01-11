import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ret = a*b;
        while(a%b != 0) {
            int c = a%b;
            a = b;
            b = c;
        }
        System.out.println(ret/b);
    }
}