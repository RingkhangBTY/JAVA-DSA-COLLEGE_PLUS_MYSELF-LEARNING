package MY_PRACTICE.Array;

public class MinMaxValue {
    public static void main(String[] args) {
        int[] arr = {
                1,3,3,4,2,12,0,34,-10,50
        };

//        System.out.println();

        System.out.println("Max element: "+findMaxEle(arr));
        System.out.println("Min element: "+findMinEle(arr));
    }

    private static int findMaxEle(int[] arr) {
        int max = arr[0];
        for (int i:arr){
            if (i>max){
                max = i;
            }
        }
        return max;
    }

    private static int findMinEle(int[] arr) {
        int min = arr[0];
        for (int i:arr){
            if (i< min){
                min = i;
            }
        }
        return min;
    }
}
