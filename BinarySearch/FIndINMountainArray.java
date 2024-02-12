import java.util.Arrays;


//1095. Find in Mountain Array{Hard}
/*

You may recall that an array arr is a mountain array if and only if:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, 
return the minimum index such that mountainArr.get(index) == target. 
If such an index does not exist, return -1.
You cannot access the mountain array directly. 
You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. 
Also, any solutions that attempt to circumvent the judge will result in disqualification.

Example 1:
Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 
Constraints:

3 <= mountain_arr.length() <= 104
0 <= target <= 109
0 <= mountain_arr.get(index) <= 109

*/
public class FIndINMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int result = findInMountainArray(arr,target);
        System.out.println(result);
    }
    static public int findInMountainArray( int[] arr,int target) {
        int peakIndex = getPeakIndex(arr);
        int[] ascArray = Arrays.copyOfRange(arr, 0, peakIndex);
        int ascIndexResult = binarySearch(ascArray, target);
        if(ascIndexResult == -1){
            int[] descArray = Arrays.copyOfRange(arr, peakIndex, arr.length-1);
            int descArrayIndex = binarySearch(descArray, target);
            return descArrayIndex;
        }
        return ascIndexResult;
        
    }
    private static int getPeakIndex(int[] arr) {
        int startPointer = 0;
       int endPointer = arr.length-1;
       while(startPointer < endPointer){
        int midPointer = startPointer+(endPointer-startPointer)/2;
        
        if(arr[midPointer]>arr[midPointer+1]){
            endPointer = midPointer;
        }
        else{
            startPointer = midPointer+1;
        }
       }
       return startPointer;
    }
    static int binarySearch(int[] arr, int target) {
        int p1 = 0;
        int p2 = arr.length-1;
        boolean isAscendingOrder = arr[p2]>arr[p1] ? true:false;
        while (p1 <= p2) {
            int elementIndex = (p1 + p2) / 2;
            int element = arr[elementIndex];
            if(element == target) return elementIndex;
            if(isAscendingOrder){
                if (element < target) {
                    p1 = elementIndex + 1;
                } else if (element > target) {
                    p2 = elementIndex - 1;
                }
            }else{
                if (element > target) {
                    p1 = elementIndex + 1;
                } else if (element < target) {
                    p2 = elementIndex - 1;
                }
            }

        }
        return -1;
    }
}
