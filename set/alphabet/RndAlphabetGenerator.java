package set.alphabet;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetGenerator implements Generator<Character> {
    private Set<Character> alphabetSet;

    public RndAlphabetGenerator() {
        this.alphabetSet = new HashSet<>();
    }

    @Override
    public Character generate() {
        int rndNum = (int) (Math.random() * 26);
        char retAlphabet = (char) (rndNum + 65);
        return retAlphabet;
    }

    @Override
    public Set<Character> getGenerator() {
        return alphabetSet;
    }
}
