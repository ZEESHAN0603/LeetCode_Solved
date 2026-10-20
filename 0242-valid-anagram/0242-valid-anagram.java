class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i<s.length(); i++){
            char S1 = s.charAt(i);
            char S2 = t.charAt(i);

            map.put(S1, map.getOrDefault(S1, 0)+1);
            map.put(S2, map.getOrDefault(S2, 0)-1);
        }

        for(int count: map.values()){
            if(count!= 0){
                return false;
            }
            
        }
        return true;
        
    }
}