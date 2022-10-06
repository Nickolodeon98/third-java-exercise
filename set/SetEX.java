package set;

import java.util.HashSet;
import java.util.Set;

public class SetEX {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("전승환");
        set1.add("전승환");
        set1.add("김철수");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);

        System.out.println(set1);
        System.out.println(setInteger);
    }
}
