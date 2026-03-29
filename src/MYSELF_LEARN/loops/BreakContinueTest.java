package MYSELF_LEARN.loops;

public class BreakContinueTest {
    public static void main(String[] args) {

        int i=1;
        while (i<=10){
            int j =0;
            while (j<=10){
                j++;
                if (j==5) continue;
                System.out.println(j);
            }
            System.out.println();
            i++;
        }
    }
}
