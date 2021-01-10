import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] s = str.split(" ");
        for(int i=0;i < s.length;i++) {
            int count = 0;
            for(int j=0;j < s.length;j++) {
                if(s[i].equals(s[j])) {
                    count++;
                }
            }
            int n = s.length/2;
            if(count >= n) {
                System.out.print(s[i]);
                break;
            }
        }
    }
}