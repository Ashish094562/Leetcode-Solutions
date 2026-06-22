class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left =0;
        int maxfreq =0;
        int maxLen =0;
        int n = s.length();
        for(int right =0;right<n;right++){
            maxfreq = Math.max(maxfreq,++freq[s.charAt(right)-'A']);
            while((right - left+1)- maxfreq >k){
                freq[s.charAt(left) -'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}