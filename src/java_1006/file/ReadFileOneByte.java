package java_1006.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileOneByte {
    private String filename;

    public ReadFileOneByte(String filename) {
        this.filename = filename;
    }

    public char readAChar() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        return (char)br.read();
    }

//    public String readTwoChar() throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(filename));
//        String reslut = "";
////        for (int )
//    }

    char readByte() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename), 16 * 1024);

        return (char)br.read();
    }
}
