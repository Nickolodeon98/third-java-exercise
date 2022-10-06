package list.codeUp;

import java.util.ArrayList;
import java.util.List;

public class StudentIdMain {
    public static void main(String[] args) {
        int id = 1111;
        String name = "Nick";
        String code = "I";

        StudentId studentInfo = new StudentId(id, name);
        List<StudentId> list = new ArrayList<>();

        studentInfo.inputProcess(code, list);

        System.out.println(list.get(0).getId());
    }
}
