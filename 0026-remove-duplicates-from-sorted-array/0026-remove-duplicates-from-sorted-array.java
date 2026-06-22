class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n ==0) return 0;
        int count =1;
        for(int i=1 ;i<n;i++){
            if(nums[i] !=nums[count-1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}