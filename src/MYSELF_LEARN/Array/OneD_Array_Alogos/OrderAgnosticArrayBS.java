package MYSELF_LEARN.Array.OneD_Array_Alogos;

public class OrderAgnosticArrayBS {
    public static void main(String[] args) {
//        int []arr = {1,3,4,6,8,10,99};
        int []arr = {88,76,54,26,10,8};
        int target = 8 ;

        System.out.println(orderAgnosticBS(arr,target));
    }

    static int orderAgnosticBS(int []arr , int target ){

        int start = 0 ;
        int end = arr.length - 1 ;

        boolean isAss = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return mid;

            if (isAss){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
