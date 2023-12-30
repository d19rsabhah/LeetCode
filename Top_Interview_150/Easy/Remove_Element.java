package Top_Interview_150.Easy;

public class Remove_Element {

    public int removeElement(int[] nums, int val) {
        int count = 0;
        if (nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[count++] = nums[i];
                }
            }
        }
        return count;
    }

}
