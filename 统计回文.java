//统计回文
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //键盘录入数据
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        //统计变量
        int count = 0;
        for (int i = 0; i <= str1.length(); i++) {
            //这里要进行插入操作，也就是说要改变字符串，而String类是不可变类，所以改为StringBuilder类来操作
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i, str2);
            if (isHuiwen(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isHuiwen(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }