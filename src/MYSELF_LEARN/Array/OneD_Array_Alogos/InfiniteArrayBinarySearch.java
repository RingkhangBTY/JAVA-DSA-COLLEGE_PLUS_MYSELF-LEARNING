package MYSELF_LEARN.Array.OneD_Array_Alogos;


public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {

        int []arr = {1,2,3,12,34,54,77,89,90};
        int target = 89;

        System.out.println(getAns(arr,target));
    }

    static int getAns(int[]arr, int target){
        int start = 0 ;
        int end = 1 ;

        while (target > arr[end]){
            int nextStart = end + 1;

            end = end + (end-start + 1) * 2;
//            if (end >= arr.length) end = arr.length-1;
            start = nextStart;
        }

        return binarySearch(arr,target,start,end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid] > target){
                end = mid - 1;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
