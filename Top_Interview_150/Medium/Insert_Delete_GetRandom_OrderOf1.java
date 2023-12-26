package Top_Interview_150.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Insert_Delete_GetRandom_OrderOf1 {

    class RandomizedSet {
        Set<Integer> s;

        public RandomizedSet() {
            s = new HashSet<>();
        }

        public boolean insert(int val) {
            if (s.contains(val)) {
                return false;
            } else {
                s.add(val);
                return true;
            }
        }

        public boolean remove(int val) {
            if (s.contains(val)) {
                s.remove(val);
                return true;
            } else {
                return false;
            }
        }

        public int getRandom() {
            List<Integer> list = new ArrayList<Integer>(s);
            int r = (int) (Math.random() * s.size());

            return list.get(r);
        }
    }

}
