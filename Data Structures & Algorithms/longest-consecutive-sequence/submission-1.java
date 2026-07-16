class Solution {
    public int longestConsecutive(int[] nums) {
        int max=Integer.MIN_VALUE;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i:h){
            if(!h.contains(i-1)){
                int p=i;
                int c=1;
                while(h.contains(p+1)){
                    c++;
                    p++;
                }
                max=Math.max(max,c);
            }
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}
