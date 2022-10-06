package list.codeUp;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    private List<StudentId> list;
    private List<StudentId> newList;
    public SelectionSort(List<StudentId> list) {
        this.list = list;
        this.newList = new ArrayList<>();
    }

    public void swap(int a) {
        StudentId tmp = list.get(a);
        newList.add(tmp);
        list.remove(a);
    }

    public void findMin() {
        int min = list.get(0).getId();
        int idx = 0;

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).getId()) {
                min = list.get(i).getId();
                idx = i;
            }
        }
        swap(idx);
    }

    public List<StudentId> sort() {
        while (list.size() > 0) {
            findMin();
        }
        return newList;
    }

    public void printList(List<StudentId> list) {
        for (StudentId studentId : list) System.out.println(studentId.getId() + " " + studentId.getName());
    }

}
