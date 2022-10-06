package list;

import java.util.ArrayList;
import java.util.List;

public class ListEX {
    private List<String> students;

    public ListEX() {
        this.students = new ArrayList<>();
        this.students.add("전승환");
        this.students.add("김철수");
        this.students.add("김민아");
    }

    public List<String> getStudents() {
        return students;
    }
}
