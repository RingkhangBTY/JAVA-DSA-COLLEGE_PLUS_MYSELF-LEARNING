package MYSELF_LEARN.Array.OneD_Problems;

public class RemoveDuplicateElement {

    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        int low = 0;
        int high = 1;
        int unique = 1;

        while (high < nums.length) {
            if (nums[high] == nums[low]) {
                high++;
            } else {
                nums[++low] = nums[high++];

                unique++;
            }
        }

        return unique;
    }
}
