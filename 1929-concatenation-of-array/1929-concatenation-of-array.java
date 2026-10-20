class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] out = new int[2*n];

        for(int i = 0; i<n; i++){
            out[i] = nums[i];
            out[i+n] = nums[i];
        }
        return out;
    }
}