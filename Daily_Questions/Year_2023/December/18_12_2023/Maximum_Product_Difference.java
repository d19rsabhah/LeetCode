import java.util.Arrays;

public class Maximum_Product_Difference {

    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int prod_1 = nums[0] * nums[1];
        int prod_2 = nums[nums.length - 1] * nums[nums.length - 2];
        return prod_2 - prod_1;
    }

}
