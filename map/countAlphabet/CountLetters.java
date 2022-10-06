package map.countAlphabet;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    private String str;

    private Map<Character, Integer> alphabetMap;

    public CountLetters(String str) {
        this.str = str;
        this.alphabetMap = new HashMap<>();
    }

    public boolean isAlphabet(char letter) {
        return (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z');
    }

    public void count() {
        for (int i = 0; i < str.length(); i++) {
            if (isAlphabet(str.charAt(i))) {
                if (alphabetMap.get(str.charAt(i)) != null)
                    alphabetMap.put(str.charAt(i), alphabetMap.get(str.charAt(i)) + 1);
                else alphabetMap.put(str.charAt(i), 1);
            }
        }
    }
    public Map<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }
}
