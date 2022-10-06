package fileIO.readFileByByte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileByByte {
    private String filename;
    private BufferedReader reader;
    public ReadFileByByte(String filename) throws IOException{
        this.filename = filename;
        this.reader = new BufferedReader(new FileReader(filename), 32 *1024);
    }

    public char readOneByte() throws IOException {
        return (char) reader.read();
    }
}
