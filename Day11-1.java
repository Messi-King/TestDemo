//删除公共字符
import java.util.*;
public class Main{
   public static void main(String args[]) {
         Scanner sca = new Scanner(System.in);
          while(sca.hasNext()) {
         String s1 = sca.nextLine();
         char[] ch = s1.toCharArray();
         String s2 = sca.nextLine();
         for(int i=0;i<ch.length;i++) {
         if(!s2.contains(String valueOf(ch[i]))) {
	System.out.print(ch[i])
           }
       }
    }
  }
}