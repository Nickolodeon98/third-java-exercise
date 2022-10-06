package set.alphabet;

import java.util.Set;

public class RndAlphabetGeneratorMain {
    public static void main(String[] args) {
        Generator<Character> rndAlphabetGenerator = new RndAlphabetGenerator();

        Set<Character> set = rndAlphabetGenerator.getGenerator();

        for (int i = 0; i < 50; i++) {
            set.add(rndAlphabetGenerator.generate());
        }

        System.out.println(set);
    }
}
