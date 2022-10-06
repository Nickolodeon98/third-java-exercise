package map.alphabetMap;

import java.util.HashMap;

public class Alphabets {
    private HashMap<Character, Integer> alphabetMap;
    private String str;

    public Alphabets(String str) {
        this.str = str;
        this.alphabetMap = new HashMap<>();
    }

    public boolean isAlphabet(char letter) {
        return (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z');
    }

    public void createAlphabetMap() {
        for (char c = 'A'; c <= 'Z'; c++) {
            alphabetMap.put(c, 0);
        }
    }

    public void count() {
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (isAlphabet(ch)) alphabetMap.put(ch, alphabetMap.get(ch) + 1);
        }
    }

    public HashMap<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }
}
