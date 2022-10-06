package set.randomNum;

import java.util.HashSet;
import java.util.Set;

public class RealRndNum {

    private Set<Integer> noDuplicate;

    private NumberGenerator rndNumGenerator;

    public RealRndNum() {
        this.noDuplicate = new HashSet<>();
        this.rndNumGenerator = new RandomNumberGenerator();
    }

    public void getRealRandom(int count, int bound) {
        for (int i = 0; i < count; i++) {
            noDuplicate.add(rndNumGenerator.generate(bound));
        }
        System.out.println(noDuplicate);
    }
}
