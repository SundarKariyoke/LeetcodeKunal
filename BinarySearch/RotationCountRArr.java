//GEEKS FOR GEEKS:
//Find the Rotation Count in Rotated Sorted array

/*
Given an array arr[] of size N having distinct numbers sorted in increasing order 
and the array has been right rotated (i.e, the last element will be cyclically 
shifted to the starting position of the array) k number of times, the task is to 
find the value of k.

Examples:  
Input: arr[] = {15, 18, 2, 3, 6, 12}
Output: 2

Explanation: Initial array must be {2, 3, 6, 12, 15, 18}. 
We get the given array after rotating the initial array twice.

Input: arr[] = {7, 9, 11, 12, 5}
Output: 4
*/

public class RotationCountRArr {

    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        int answer = getCount(arr);
        System.out.println(answer);
    }
    static int getCount(int[] arr){
        int peekIndex = getPeakIndex(arr);
        if(peekIndex !=-1){
            return peekIndex+1;
        }
        return peekIndex;
    }
    static int getPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                end = mid-1;
            }
            if(arr[start]<arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
}