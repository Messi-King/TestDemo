import java.util.*;
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.next();
    int a = 0;
    int b = 1;
    int c = 1;
    while(c < n) {
    	a = b;
    	b = c;
    	c = a+b;
    }
    int n1 = n-b;
    int n2 = c-n;
   }
   System.out.println(n1 > n2 ? n2: n1);
}