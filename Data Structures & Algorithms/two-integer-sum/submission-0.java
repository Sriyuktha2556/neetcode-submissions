class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p=-1,s=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    p=i;
                    s=j;
                }
            }
        }
        return new int[]{p,s};
    }
}
