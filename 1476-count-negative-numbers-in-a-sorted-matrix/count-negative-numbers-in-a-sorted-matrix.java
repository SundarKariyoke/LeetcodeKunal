class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        for(int i = 0; i < grid.length; i++){
            int[] arr = grid[i];
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start +(end-start)/2;
                if(arr[mid]<0){
                    count += end-mid+1;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                } 
            }
        }
        return count;
    }
}