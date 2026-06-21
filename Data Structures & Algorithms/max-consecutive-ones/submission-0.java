class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currCount = 0;
       for(int i =0; i < nums.length; i++) {
            if(1 == nums[i]){
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            }else{
                currCount =0;
            }
       } 
       return maxCount;
    }
}