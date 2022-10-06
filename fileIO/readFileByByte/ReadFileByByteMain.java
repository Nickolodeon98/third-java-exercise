package fileIO.readFileByByte;

import java.io.IOException;

public class ReadFileByByteMain {
    public static void main(String[] args) {
        try {
            ReadFileByByte fileByByte = new ReadFileByByte("./arbitrary_file.txt");

            System.out.println(fileByByte.readOneByte());
            System.out.println(fileByByte.readOneByte());
            System.out.println(fileByByte.readOneByte());
            System.out.println(fileByByte.readOneByte());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
