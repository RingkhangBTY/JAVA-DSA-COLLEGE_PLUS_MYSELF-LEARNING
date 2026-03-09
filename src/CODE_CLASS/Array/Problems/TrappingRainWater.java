package CODE_CLASS.Array.Problems;

public class TrappingRainWater {
    public static void main(String[] args) {
        int [] height = {4,2,0,3,2,5};

        System.out.println(findMaxTrappingRainWater(height));
    }

    private static int findMaxTrappingRainWater(int[] height) {
        int [] leftMax = new int[height.length];
        int [] rightMax = new int[height.length];

        int lMax = 0, rMax = 0;

        for (int i = 0; i < height.length; i++) {
            lMax = Math.max(lMax,height[i]);
            leftMax[i] = lMax;
        }

        for (int i = height.length-1; i>=0; i--) {
            rMax = Math.max(rMax,height[i]);
            rightMax[i] = rMax;
        }

        int ans = 0 ;
        for (int i = 0; i < height.length; i++) {
            if (leftMax[i]<rightMax[i]){
                ans += leftMax[i] - height[i];
            }else {
                ans += rightMax[i] - height[i];
            }
        }

        return ans;
    }
}
