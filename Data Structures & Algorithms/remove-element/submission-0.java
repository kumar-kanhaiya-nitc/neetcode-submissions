class Solution {
    public int removeElement(int[] nums, int val) {
        int res = nums.length;
        int j = nums.length-1;
        int i =0;
        while(i <= j){
            if(nums[j] == val){
                j--;
                res--;
            }
              
            if(nums[i] == val){
                nums[i] = nums[j];
                nums[j] = val;
                j--;
                res--;
            }
            i++;
        }
        return res;
    }
}