import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()) {
            String s = sca.nextLine();
            String[] tmp = s.split(" ");
            int[] array = new int[tmp.length-1];
            int k = 0;
            for(int i = 0;i < tmp.length;i++) {
                if(i < tmp.length-1) {
                    array[i] = Integer.parseInt(tmp[i]);
                }else {
                    k = Integer.parseInt(tmp[i]);
                }
            }
            Arrays.sort(array);
            for(int i = 0;i < k;i++) {
                if(i < k + 1) {
                    System.out.print(array[i]+" ");
                }else {
                    System.out.print(array[i]);
                }
            }
        }
    }
}