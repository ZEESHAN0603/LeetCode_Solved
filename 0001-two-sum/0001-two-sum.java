import java.util.HashMap;

class Solution{
    public int[] twoSum(int[] num, int t){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<num.length; i++){
            int need = t - num[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need), i};
            }
            map.put(num[i], i);
        }
    return new int[] {};
    }
}