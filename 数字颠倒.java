import java.util.*;
public class Main{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      String res="";
        while(num!=0){
          int t1=num%10;
          int t2=num/10;
          res=res+String.valueOf(t1);
          num=t2;
       }
      System.out.println(res);
   }
}