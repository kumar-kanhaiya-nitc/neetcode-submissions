class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int rightMax = Integer.MIN_VALUE;
            for(int j = i+1; j < arr.length; j++) {
                if(rightMax < arr[j]) rightMax = arr[j];
            }
            //if(arr[i] < rightMax) 
            arr[i]=rightMax;
        }
        arr[arr.length-1] =-1;
        return arr;   
    }
}