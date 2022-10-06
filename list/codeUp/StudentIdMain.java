package list.codeUp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentIdMain {
    public static void main(String[] args) throws FileNotFoundException {
        int id = 1111;
        String name = "Nick";
        String code = "I";

        FileReader reader = new FileReader("./students_list.txt");

        StudentId studentInfo = new StudentId(id, name);
        List<StudentId> list = new ArrayList<>();

        studentInfo.inputProcess(code, list);

        System.out.println(list.get(0).getId());
    }
}
