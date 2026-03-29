package MYSELF_LEARN.Array.OneD_Array_Alogos;

public class BinarySearch {
    public static void main(String[] args) {

        int []arr = {1,3,4,6,8,10,99};
        int target = 1 ;

        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int []arr, int target){
        int start = 0 ;
        int end = arr.length - 1 ;

        while (start<=end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (target < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
