//33. Search in Rotated Sorted Array{MEDIUM}:

/*

There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, 
nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
such that the resulting array is 
[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] 
(0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 
and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1
 
Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 
 */

public class RotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,9,2,2,2};
        int target = 2;
        // int answer = getAnswer(arr,target); 
        // System.out.println(answer);
        int answer = getAnswerForDuplicates(arr,target); 
        System.out.println(answer);
    }

    static int getAnswer(int[] arr, int target){
        int result = -1;
        int peakIndex = getPeakNumber(arr);
         if(peakIndex == -1){
            result = binarySearch(arr, target, 0, arr.length-1);
        } else {
           
            if(target == arr[peakIndex]){
                result = peakIndex;
            } else if(target >= arr[0]){ 
                result = binarySearch(arr, target, 0, peakIndex-1);
            } else { 
                result = binarySearch(arr, target, peakIndex+1, arr.length-1);
            }
        }
        return result;

    }

    static int getAnswerForDuplicates(int[] arr, int target){
        int result = -1;
        int peakIndex = getPeakNumberWithDuplicates(arr);
         if(peakIndex == -1){
            result = binarySearch(arr, target, 0, arr.length-1);
        } else {
           
            if(target == arr[peakIndex]){
                result = peakIndex;
            } else if(target >= arr[0]){ 
                result = binarySearch(arr, target, 0, peakIndex-1);
            } else { 
                result = binarySearch(arr, target, peakIndex+1, arr.length-1);
            }
        }
        return result;

    }

    static int getPeakNumber(int[] arr){
        int startPointer = 0;
        int endPointer = arr.length-1;
        while(startPointer<= endPointer){
            int midPointer = startPointer+(endPointer-startPointer)/2;
            if(midPointer<endPointer && arr[midPointer]>arr[midPointer+1]){
                return midPointer;
            }
            if(midPointer>startPointer && arr[midPointer]<arr[midPointer-1]){
                return midPointer-1;
            }
            if(arr[startPointer]>=arr[midPointer]){
                endPointer = midPointer-1;
            }
            if(arr[startPointer]<=arr[midPointer]){
                startPointer = midPointer+1;
            }
        }
        return -1;
    }

    static int getPeakNumberWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int midPointer = start+(end-start)/2;
            if(arr[midPointer]<end && arr[midPointer]>arr[midPointer+1]){
                return midPointer;
            }
            if(arr[midPointer]>start && arr[midPointer]<arr[midPointer+1]){
                return midPointer+1;
            }
            if(arr[midPointer]<=arr[start]){
                end = midPointer-1;
            }
            if(arr[midPointer]>=arr[start]){
                start = midPointer +1;
            }

            if(arr[start]==arr[midPointer] && arr[midPointer] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end;
                }
                end--;
            }
            else if(arr[start]<arr[midPointer] || arr[start] == arr[midPointer] && arr[midPointer]>arr[end]){
                start = midPointer+1;
                
            }else{
                end = midPointer-1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
