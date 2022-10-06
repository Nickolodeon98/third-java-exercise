package fileIO.readFileByByte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileByByte {
    private String filename;

    public ReadFileByByte(String filename) {
        this.filename = filename;
    }

    public char readOneByte() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename), 32 *1024);

        return (char) reader.read();
    }
}
