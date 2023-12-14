public class Remove_Duplicates_From_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for(int x : nums){
        // set.add(x);
        // }
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int a : set){
        // list.add(a);
        // }
        // Arrays.fill(nums, 0);
        // int i = 0;
        // Collections.sort(list);
        // for(int z : list){
        // nums[i] = z;
        // i++;
        // }
        // return set.size();

        int indx = 1;
        if (nums.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    nums[indx] = nums[i + 1];
                    indx++;
                }
            }
        }
        return indx;
    }
}
