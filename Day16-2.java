//反转单词序列
public static String reverse(String str) {
        if(str == null) {
            return str;
        }
        String[] strArr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strArr.length-1; i>=0; i--) {
            sb.append(strArr[i]);
            if(i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }