//LEETCODE {medium}:
//34. Find First and Last Position of Element in Sorted Array
/*
Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 */

import java.util.Arrays;

public class FirstandLastPositions {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 1;
        int[] answer = searchRange(nums,target);
        System.out.println(Arrays.toString(answer));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] occurencces = {-1,-1};
        occurencces[0] = findIndexes(nums,target,true);
        if(occurencces[0]!=-1){
            occurencces[1] = findIndexes(nums, target, false);
        }
        return occurencces;
        
    }

    static int findIndexes(int[] nums, int target, boolean isToFindStartIndex){
        int ans = -1;
        int startPointer = 0;
        int endPointer = nums.length-1;
        while(startPointer<=endPointer){
            int midPointer = startPointer + ((endPointer-startPointer)/2);
            if(target < nums[midPointer]){
                endPointer= midPointer-1;
            }else if(target > nums[midPointer]){
                startPointer = midPointer+1;
            }else{
                ans=midPointer;
                if(isToFindStartIndex){
                    endPointer = midPointer-1;
                }else{
                    startPointer = midPointer+1;
                }
            }
        }
        return ans;
    }
}
