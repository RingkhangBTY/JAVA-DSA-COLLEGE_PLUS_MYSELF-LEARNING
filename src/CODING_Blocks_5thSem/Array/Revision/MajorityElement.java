package CODING_Blocks_5thSem.Array.Revision;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,1,2,1,2,4,2,4,4,4,4};

        System.out.println(findMajorityElement(nums));
    }

    private static int findMajorityElement(int[] nums) {

        HashMap<Integer,Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int num: nums){
            hash.put(num, 1+hash.getOrDefault(num,0));

            if (hash.get(num) > majority){
                res = num;
                majority = hash.get(num);
            }
        }

        return  res;
    }
}
