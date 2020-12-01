import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()) {
            int a = sca.nextInt();
            int count = 0;
            for(int i=a;i>0;i--) {
                int tmp = i;
                while(tmp%5==0) {
                    count++;
                    tmp = tmp/5;
                }
            }
            System.out.println(count);
        }
    }
}