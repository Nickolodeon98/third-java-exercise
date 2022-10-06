package list.codeUp;

import java.util.ArrayList;
import java.util.List;

public class StudentId {
    private String codeNum;
    private String name;
    private List<Integer> id;

    public StudentId(String codeNum, String name) {
        this.codeNum = codeNum;
        this.name = name;
        this.id = new ArrayList<>();
    }


}
