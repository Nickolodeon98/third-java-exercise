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
            char c = str.charAt(i);
            if (isAlphabet(c)) {
                if ((int)c >= 97)
                    c = Character.toUpperCase(c);
                if (alphabetMap.get(c) != null)
                    alphabetMap.put(c, alphabetMap.get(c) + 1);
                else alphabetMap.put(c, 1);
            }
        }
    }
    public Map<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }
}
