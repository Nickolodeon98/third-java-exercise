package fileIO.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileEX {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("./arbitrary_file.txt");

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

        /*
        .\.git
        .\.gitignore
        .\.idea
        .\arbitrary_file.txt
        .\fileIO
        .\list
        .\map
        .\out
        .\README.md
        .\set
        .\students_list.txt
        */
    }
}
