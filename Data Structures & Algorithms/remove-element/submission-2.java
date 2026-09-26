class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int i = 0;
        int res = 0;
        while(i <= j) {
           if(nums[i] == val && nums[j] != val){
                nums[i]=nums[j];
                nums[j]=val;
                i++;j--;
           } else if((nums[i] == val && nums[j] == val) || (nums[i] != val && nums[j] == val)) {
                j--;
           } else {
                i++;
           }
        }
        return i;
    }
}