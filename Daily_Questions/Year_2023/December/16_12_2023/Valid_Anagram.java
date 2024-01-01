import java.util.*;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> frequency_S = new HashMap<>();
        Map<Character, Integer> frequency_T = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequency_S.put(ch, frequency_S.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            frequency_T.put(ch, frequency_T.getOrDefault(ch, 0) + 1);
        }
        return frequency_S.equals(frequency_T);
    }
}
