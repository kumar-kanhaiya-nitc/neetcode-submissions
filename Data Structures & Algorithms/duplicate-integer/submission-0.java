class Solution {
    public boolean hasDuplicate(int[] nums) {
       int[] hash = new int[1000000];
       for(int i =0; i < nums.length; i++){
            if(hash[nums[i]] != 0) return true;
            hash[nums[i]]++;
       }
       return false;
    }
}