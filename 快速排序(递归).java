/*快速排序 不稳定
    *时间复杂度: O(n*(logn))
    * 最坏情况：有序，逆序  O(n^2)
    *空间复杂度：O(logn)
     * */
     * 
     //寻找基准
    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while(start < end) {
            while(start < end && array[end] >= tmp) {
                end--;
            }
            if(start >= end) {
                array[start] = tmp;
                break;
            }else {
                array[start] = array[end];
            }
            while(start < end && array[start] <= tmp) {
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
    //递归方法
    public static void quick(int[] array,int low,int high) {
        if(low < high) {
            int par = partion(array, low, high);
            quick(array, low, par - 1);
            quick(array, par + 1, high);
        }
    }
    //实现排序
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
        
