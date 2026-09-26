class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1]=-1;
        int n = arr.length - 2;
        

        while(n >= 0){
            int x = arr[n];
            arr[n] = max;
            if(max < x) max = x;
            n--;
        }

       return arr;
    }
}