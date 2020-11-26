//寻找第K大
public class TestDemo {
    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while(start < end) {
            while(start < end && array[end] <= tmp) {
                end--;
            }
            if(start >= end) {
                array[start] = tmp;
                break;
            }else {
                array[start] = array[end];
            }
            while(start < end && array[start] >= tmp) {
                start++;
            }
            if(start >= end) {
                array[start] = tmp;
                break;
            }else {
                array[end] = array[start];
            }
        }
        return start;
    }
    public static int quick(int[] array, int low, int high,int K) {
            int par = partion(array, low, high);
            if(K == par - low + 1) {
                return array[par];
            }else if(K > par - low + 1) {
                return quick(array, par + 1, high, K - par + low -1);
            }else {
                return quick(array, low, par -1, K);
            }
    }
    public static int Findth(int[] array,int n,int K) {
        return quick(array,0,n-1,K);
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,2,2};
        int ret = Findth(array,5,3);
        System.out.println(ret);
    }
}