package fileIO.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileEX {
    public void printFiles() throws FileNotFoundException {
        FileReader fr = new FileReader("./arbitrary_file.txt");

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readChar(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        return (char) fr.read();
    }

    public String read2Chars(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        String str = "";
        str += (char) fr.read();
        str += (char) fr.read();

        return str;
    }

    public static void main(String[] args) throws IOException {
        FileEX test = new FileEX();

        char c = test.readChar("arbitrary_file.txt");
        System.out.println(c);

        String s = test.read2Chars("arbitrary_file.txt");
        System.out.println(s);
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
