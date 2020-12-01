import java.util.*;
public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int ret = gifts[n/2];
        int count = 0;
        for(int i = 0;i < gifts.length;i++) {
            if(ret == gifts[i]) {
                count++;
            }
        }
        return count > n/2 ? ret : 0;
    }
}


import java.util.*;
public class Gift {
        public int getValue(int[] gifts, int n) {
            Map<Integer, Integer> m = new HashMap<>();
            for(int i = 0; i < gifts.length; ++i){
                if(m.containsKey(gifts[i])){
                    m.put(gifts[i], m.get(gifts[i]) + 1);
                }else{
                    m.put(gifts[i], 1);
                }
                if(m.get(gifts[i]) > gifts.length/2){   
                    return gifts[i];
                }
            }
            return 0;
        }
}