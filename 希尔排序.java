/*希尔排序
    * 稳定性：不稳定排序
    * 时间复杂度：O(n^1.3) ~ O(n^1.5)
    * 空间复杂度：O(1)
    * */
    public static void shell(int[] array,int gap) {
        for (int i = gap; i <array.length ; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j >= 0 ; j=j-gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length ; i++) {
            shell(array,drr[i]);
        }
    }
