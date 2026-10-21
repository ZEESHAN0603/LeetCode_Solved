class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(int i =0; i<sentences.length; i++){
            int words = sentences[i].split(" ").length;
            maxWords = Math.max(maxWords, words);
        }
        return maxWords;
    }
}