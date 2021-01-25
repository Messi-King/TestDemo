public static void quickSort(int[] array) {
        quickNor(array,0,array.length-1);
    }
    //非递归实现快排
    public static void quickNor(int[] array,int low,int high) {
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = array.length - 1;
        int par = partion(array, start, end);
        if (par > low + 1) {
            stack.push(start);//0
            stack.push(par - 1);//4
        }
        if (par < high - 1) {
            stack.push(par + 1);//6
            stack.push(end);//9
        }
        while (!stack.empty()) {
            end = stack.pop();
            start = stack.pop();
            par = partion(array,start,end);//新的基准
            if (par > start + 1) {
                stack.push(start);
                stack.push(par - 1);
            }
            if (par < end - 1) {
                stack.push(par + 1);
                stack.push(end);
            }
        }
    }
