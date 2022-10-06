package list.codeUp;

import java.util.ArrayList;
import java.util.List;

public class StudentId {
    private int id;
    private String name;

    public StudentId(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void inputProcess(String code, List<StudentId> idLists) {

        for (StudentId idList : idLists) {
            if (idList.getId() == id) {
                if (code.equals("D"))
                    idLists.remove(idList);
                return;
            }
        }
        if (code.equals("I")) {
            idLists.add(new StudentId(id, name));
        }
    }

    public int getId() {
        return id;
    }

}
