package map;

import java.util.HashMap;
import java.util.Map;

/*Map 은 비선형 구조의 자료 구조이다*/
public class MapEX {
    public static void main(String[] args) {
        NameInfo names = new NameInfo();
        names.addName();

        for (Map.Entry name : names.getNameMap().entrySet()) {
            System.out.println(name.getValue());
        }
    }
}
