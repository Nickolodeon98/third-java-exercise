package map.countAlphabet;

import java.util.Map;
import java.util.Scanner;

public class CountLettersMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        String toCount = sc.nextLine();
        CountLetters test = new CountLetters(toCount);

        test.count();

        Map<Character, Integer> testMap = test.getAlphabetMap();

        for (Map.Entry<Character, Integer> characterIntegerEntry : testMap.entrySet()) {
            System.out.println("문자 " + characterIntegerEntry.getKey() + "은(는) " + characterIntegerEntry.getValue() + "개 있습니다.");
        }
    }
}
