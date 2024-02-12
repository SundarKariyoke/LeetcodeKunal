//Geeks for Geeks:
//Find position of an element in a sorted array of infinite numbers

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,41,43,45,47,49,51,53,55,57,59};
        int target = 21;
        int result = getResult(arr, target);
        if(result != -1){
            System.out.println("The given number is present in the array at the index of " + result);
        }else{
          System.out.println("The given number is not present in the given array");
        }

    }
    static int getResult(int[] arr, int target){
        int start = 0;
        int end = 1;
        int value = arr[start];

        while (target > value) {
            start = end;
            end = end * 2;
            value = arr[end];
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int startPointer, int endPointer ) {
       while(startPointer <= endPointer){
        int midPointer = startPointer + (endPointer - startPointer)/2;
        if(target == arr[midPointer]) {
            return midPointer;
        }
        else if(target<arr[midPointer]){
            endPointer = midPointer-1;
        }else{
            startPointer = midPointer+1;
        }
       }
       return -1;
    }
}
