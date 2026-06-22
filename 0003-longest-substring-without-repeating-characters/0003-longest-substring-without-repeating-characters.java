class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left =0,maxLen =0;
        Map<Character, Integer> map = new HashMap<>();
                for(int right =0;right <n ;right++){
                    if(map.containsKey(s.charAt(right))){
                        left = Math.max(left,map.get(s.charAt(right))+1);

                    }
                    map.put(s.charAt(right),right);
                    maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
    }
}