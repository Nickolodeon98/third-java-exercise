package set;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int bound) {
        return (int) (Math.random() * bound);
    }
}
