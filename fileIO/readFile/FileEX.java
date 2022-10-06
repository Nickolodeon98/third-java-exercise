package fileIO.readFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileEX {
    private String filename;
    public FileEX(String filename) {
        this.filename = filename;
    }

    public void printFiles() throws FileNotFoundException {
        FileReader fr = new FileReader("./arbitrary_file.txt");

        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readChar() throws IOException {
        FileReader fr = new FileReader(filename);
        return (char) fr.read();
    }

    public String read2Chars() throws IOException {
        FileReader fr = new FileReader(filename);
        String str = "";
        str += (char) fr.read();
        str += (char) fr.read();

        return str;
    }

    public String readNChars(int n) throws IOException {
        FileReader fr = new FileReader(filename);
        String str = "";
        for (int i = 0; i < n; i++) {
            int asciiCd = fr.read();
            if (asciiCd == -1) {
                return str;
            }
            str += (char) fr.read();
        }

        return str;
    }

    public String readALine() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename), 16 * 1024);
        String str = reader.readLine();
        return str;
    }

    public List<String> readAll() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename), 16 * 1024);
        String nextLine = "";
        while ((nextLine = reader.readLine()) != null){
            lines.add(nextLine);
        }

        return lines;
    }
    public static void main(String[] args) throws IOException {
        FileEX test = new FileEX("./arbitrary_file.txt");

        char c = test.readChar();
        System.out.println(c);

        String s = test.read2Chars();
        System.out.println(s);

        String sN = test.readNChars(5);
        System.out.println(sN);

        String line = test.readALine();
        System.out.println(line);

        List<String> allLines = test.readAll();
        System.out.println(allLines);
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
