class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int maxOnes = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
                ones++;
            else{
                maxOnes = Math.max(ones,maxOnes);
                ones = 0;
            }
        }
        return Math.max(ones,maxOnes);
        
    }
}