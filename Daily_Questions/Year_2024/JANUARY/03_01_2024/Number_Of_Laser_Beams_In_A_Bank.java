import java.util.*;

public class Number_Of_Laser_Beams_In_A_Bank {

    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = bank.length;
        for (String str : bank) {
            int count = Count_Ones(str);
            if (count > 0) {
                list.add(count);
            }
        }
        if (list.size() < 2) {
            return 0;
        }
        int leasers = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            leasers += (list.get(i) * list.get(i + 1));
        }
        return leasers;
    }

    public static int Count_Ones(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }
}