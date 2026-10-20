class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int num = arr[i];
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        List<Integer> val = new ArrayList<>(map.values());
        for(int i = 0; i<val.size(); i++){
            int freq = val.get(i);
            if(set.contains(freq)){
                return false;
            }
            set.add(freq);
        }
    return true;
    }
}