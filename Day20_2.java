import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//密码字母
            String str2 = "VWXYZABCDEFGHIJKLMNOPQRSTU";//原文字母
            char[] arr = new char[300];
            for(int i = 0;i<str1.length();i++){
                arr[str1.charAt(i)] = str2.charAt(i);
            }
            String input = sc.nextLine();
            String result = "";
            for(int j = 0;j<input.length();j++){
                if(input.charAt(j) == ' '){
                    result = result + " ";
                }else{
                    result = result + arr[input.charAt(j)];
                }
            }
            System.out.println(result);
        }
    }
}