public class Flooring {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,11,14,16,18};
        int target = 12;
        int answer = binarySearch(arr,target);
        System.out.println(answer);
       
    }

    static int binarySearch(int[] arr, int target) {
        int p1 = 0;
        int p2 = arr.length-1;
        boolean isAscendingOrder = arr[p2]>arr[p1] ? true:false;
        while (p1 <= p2) {
            int elementIndex = (p1 + p2) / 2;
            int element = arr[elementIndex];
            if(element == target) return element;
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
        return arr[p2];
    }

}