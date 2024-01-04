import java.util.*;

public class Minimum_Operations_To_Make_Array_Empty {

    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                return -1;
            }
            ans += map.get(x) / 3;
            if (map.get(x) % 3 != 0) {
                ans++;
            }
        }
        return ans;
    }
}