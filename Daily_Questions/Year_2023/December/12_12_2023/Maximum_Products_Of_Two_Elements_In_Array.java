import java.util.*;

public class Maximum_Products_Of_Two_Elements_In_Array {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }

    public static void main(String[] args) {
        Maximum_Products_Of_Two_Elements_In_Array obj = new Maximum_Products_Of_Two_Elements_In_Array();
        int arr[] = { 2, 8, 1, 7, 5, 6, 11, 3 };
        System.err.println(obj.maxProduct(arr));
    }
}
