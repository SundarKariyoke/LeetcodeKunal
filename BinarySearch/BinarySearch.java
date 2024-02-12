public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
        int[] arr2 = {90,85,80,75,70,65,60,30};
        int target = 28;
        boolean answer = binarySearch(arr,target);
        boolean answer2 = binarySearch(arr2,target);
        System.out.println(answer);
        System.out.println(answer2);
    }

    static boolean binarySearch(int[] arr, int target) {
        int p1 = 0;
        int p2 = arr.length-1;
        boolean isAscendingOrder = arr[p2]>arr[p1] ? true:false;
        while (p1 <= p2) {
            int elementIndex = (p1 + p2) / 2;
            int element = arr[elementIndex];
            if(element == target) return true;
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
        return false;
    }

}