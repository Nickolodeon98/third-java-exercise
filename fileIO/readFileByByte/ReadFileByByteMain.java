package fileIO.readFileByByte;

import java.io.IOException;

public class ReadFileByByteMain {
    public static void main(String[] args) {
        ReadFileByByte fileByByte = new ReadFileByByte("./arbitrary_file.txt");

        try {
            System.out.println(fileByByte.readOneByte());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
