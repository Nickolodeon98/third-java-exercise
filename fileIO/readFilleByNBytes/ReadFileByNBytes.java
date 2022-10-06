package fileIO.readFilleByNBytes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileByNBytes {
    private String filename;

    private BufferedReader fileReader;

    public ReadFileByNBytes(String filename) throws IOException {
        this.filename = filename;
        this.fileReader = new BufferedReader(new FileReader(filename), 32 * 1024);
    }

    public List<Character> readFile(int n) throws IOException{
        List<Character> bytes = new ArrayList<>();
        for (int i = 0; i < n; i++)
            bytes.add((char) fileReader.read());

        return bytes;
    }
}
