package map.countAlphabet;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    private String str;

    Map<Character, Integer> alphabetMap;

    public CountLetters(String str) {
        this.str = str;
        this.alphabetMap = new HashMap<>();
    }

    public void count() {
        for (int i = 0; i < str.length(); i++) {
            if (alphabetMap.get(str.charAt(i)) != null)
                alphabetMap.put(str.charAt(i), alphabetMap.get(str.charAt(i)) + 1);
            else alphabetMap.put(str.charAt(i), 1);
        }
    }

    public Map<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }
}
