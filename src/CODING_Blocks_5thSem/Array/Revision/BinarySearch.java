package CODING_Blocks_5thSem.Array.Revision;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {12,16,17,20,23,26,30};

        System.out.println(binarySearch(arr,32));
    }

    private static int binarySearch(int[]arr,int target) {

        int start = 0,end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
