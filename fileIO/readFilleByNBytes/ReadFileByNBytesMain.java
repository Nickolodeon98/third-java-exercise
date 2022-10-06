package fileIO.readFilleByNBytes;

import java.io.IOException;

public class ReadFileByNBytesMain {
    public static void main(String[] args) throws IOException {
        String fileName = "./arbitrary_file.txt";

        ReadFileByNBytes test = new ReadFileByNBytes(fileName);

        for (Character c : test.readFile(2)) {
            System.out.println(c);
        }
    }
}
