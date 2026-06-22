class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left =-1,right=-1;
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];
        for(int i=1;i<n;i++){
            if(nums[i] < max) right =i;
            else max = nums[i];
            int j = n-1-i;
            if(nums[j] > min) left = j; 
            else min = nums[j];
        }
        return (left ==-1)?0:right - left +1;
    }
}