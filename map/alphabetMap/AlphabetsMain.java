package map.alphabetMap;

import java.util.Scanner;

public class AlphabetsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        String str = sc.nextLine();

        Alphabets test = new Alphabets(str);

        test.createAlphabetMap();
        test.count();

        System.out.println(test.getAlphabetMap());
    }
}
