import java.util.HashMap;

public class Appeared_More_Than_Quarter {
    public static int findSpecialInteger(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int qtr = n / 4;
        for (int key : map.keySet()) {
            if (map.get(key) > qtr) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        System.out.println(findSpecialInteger(arr));
    }
}
