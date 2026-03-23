package CODE_CLASS.Array.Problems;

public class FindingRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int start = 1, end = x/2;

        while (start<end){

            int mid = start + (end-start)/2;

            if ((mid*mid) == x ){
                return (int)mid;
            }

            if ((mid*mid) < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return (int) end ;
    }
}
