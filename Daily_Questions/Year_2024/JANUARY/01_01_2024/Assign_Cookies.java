import java.util.*;

public class Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        /*
         * int count = 0;
         * for(int i = 0; i < g.length; i++){
         * for(int j = 0; j < s.length; j++){
         * if(g[i] <= s[j]){
         * count++;
         * break;
         * }
         * }
         * }
         * if(count > 0 && s.length < count){
         * return s.length;
         * }
         * return count; {test cases failed because sometimes size of cookies are larger
         * than child but numbers of cokkies are not sufficient for number of childs }
         * 
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * int x = s.length;
         * for(int i = 0; i < g.length; i++){
         * for(int j = 0; j < s.length; j++){
         * if(g[i] <= s[j] && list.size() < x){
         * list.add(g[i]);
         * break;
         * }
         * }
         * }
         * HashSet<Integer>set= new HashSet<>();
         * for(int i = 0; i < s.length; i++){
         * set.add(s[i]);
         * }
         * 
         * return list.size() < set.size() ? list.size() : set.size();
         */

        int cookies = s.length;
        if (cookies == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = cookies - 1;
        int j = g.length - 1;
        while (i >= 0 && j >= 0) {
            if (s[i] >= g[j]) {
                count++;
                i--;
                j--;
            } else {
                j--;
            }
        }
        return count;
    }
}
