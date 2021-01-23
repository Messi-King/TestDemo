import java.util.*;
public class Main{
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   String s = input.next();
   char[] tmp = s.toCharArray();
   int[] array = new int[10];
   for(int i=0;i<tmp.length;i++) {
      int k = tmp[i] - '0';
       array[k]++;
   }
       for(int i=0;i<10;i++) {
           if(array[i] != 0){
               System.out.println(i+":"+array[i]);
           }
       }
   }
}