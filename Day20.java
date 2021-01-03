//判断子串
public class Main {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] booArr = new boolean[n];
        for (int i = 0; i <n ; i++) {
            if(s.contains(p[i])) {
                booArr[i] = true;
            }else {
                booArr[i] = false;
            }
        }
        return booArr;
    }
}