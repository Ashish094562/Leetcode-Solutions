class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <=2) return n;
        int count =2;
        for(int i=2;i<n;i++){
            if(nums[count -2] != nums[i]){
                nums[count] =nums[i];
                count++;
            }
        }
        return count;
    }
}