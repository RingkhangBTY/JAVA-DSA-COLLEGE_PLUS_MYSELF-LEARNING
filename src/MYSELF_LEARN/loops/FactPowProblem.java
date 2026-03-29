package MYSELF_LEARN.loops;

public class FactPowProblem {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

        int n = 120;
        int k = 2;

        int i = 0 ;
        boolean next = true;

        while (next){
            if (n % Math.pow(k,i) == 0 ){
                i ++;
            }else {
                next = false;
            }
        }

        System.out.println(i-1);
    }

//    public static int pow(int value, int pow){
//
//        if (pow == 0 ) return 1;
//
//        for (int i = 0; i < pow; i++) {
//            value *=value;
//        }
//
//        return value;
//    }
}