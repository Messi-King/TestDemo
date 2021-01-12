import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] tmp = s.split(" ");
        int[] array = new int[tmp.length-1];
        int k = 0;
        for(int i=0;i<tmp.length;i++) {
            if(i < tmp.length-1) {
                array[i] = Integer.parseInt(tmp[i]);
            }else {
                k = Integer.parseInt(tmp[i]);
            }
        }
        Arrays.sort(array);
        for(int i=0;i<k;i++) {
            if(i < k-1) {
                System.out.print(array[i]+" ");
            }else {
                System.out.print(array[i]);
            }
        }
    }
}