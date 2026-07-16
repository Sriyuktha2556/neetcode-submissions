class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=-1,p=-1;
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    s=i;
                    p=j;
                }
            }
        }
        return new int[]{s+1,p+1};
    }
}
