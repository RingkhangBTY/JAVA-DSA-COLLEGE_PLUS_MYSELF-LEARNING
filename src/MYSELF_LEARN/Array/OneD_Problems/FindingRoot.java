package MYSELF_LEARN.Array.OneD_Problems;

public class FindingRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(6));

        System.out.println(Math.sqrt(32));
    }

    public static int mySqrt(int x) {

        if (x<2) return x;

        int start = 1, end = x/2;

        while (start<=end){

            int mid = start + (end-start)/2;

            if ((mid*mid) == x ){
                return mid;
            }

            if ((mid*mid) < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return end ;
    }
}
