package set.alphabet;

import java.util.Set;

public interface Generator<T> {
    T generate();
    Set<T> getContainer();
}
