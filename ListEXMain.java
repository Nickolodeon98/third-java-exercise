import java.util.ArrayList;
import java.util.List;

public class ListEXMain {
    public static void main(String[] args) {
        ListEX listEx = new ListEX();

        List<String> listStudents = listEx.getStudents();

        for (String listStudent : listStudents) {
            System.out.println(listStudent);
        }
    }
}