package java_1006.file;

import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        ReadFileOneByte readFileOneByte = new ReadFileOneByte("a_file.txt");

        System.out.println(readFileOneByte.readByte());
    }
}
