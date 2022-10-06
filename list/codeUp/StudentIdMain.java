package list.codeUp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentIdMain {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("./students_list.txt"), 32 * 1024);
        List<StudentId> list = new ArrayList<>();


        String count = reader.readLine();
        for (int i = 0; i < Integer.parseInt(count); i++) {
            String info = reader.readLine();
            String[] infos = info.split(" ");
            StudentId studentInfo = new StudentId(Integer.parseInt(infos[1]), infos[2]);
            studentInfo.inputProcess(infos[0], list);
        }
        String orderInfo = reader.readLine();

        SelectionSort sorting = new SelectionSort(list);

        List<StudentId> sortedList = sorting.sort();

        String[] orders = orderInfo.split(" ");


        for (String info : orders) {
            System.out.println("ID: " + sortedList.get(Integer.parseInt(info)-1).getId() + " Name: " + sortedList.get(Integer.parseInt(info)-1).getName());
        }
    }
}
