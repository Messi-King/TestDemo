//排序法
class Solution {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1])
                return nums[i];
        }
        return -1;
    }
}

//哈希表
    public static int findRepeatNumber(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for(int a:array) {
            if(set.contains(a)) {
                return a;
            }
            set.add(a);
        }
        return -1;
    }

//数组重排
    public static int deduplicate(int a[]) {
        if (a.length < 2 || a == null) {
            return -1;
        }
        // 判断不合格的数
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] > a.length - 1) {
                return -1;
            }
        }
        // 找重复的数
        for (int i = 0; i < a.length; i++) {
            while (a[i] != i) {
                if (a[i]==a[a[i]]) {
                    return a[i];
                }
                int tmp = a[i];
                a[i] = a[tmp];
                a[tmp] = tmp;
            }
        }
        return -1;
    }
