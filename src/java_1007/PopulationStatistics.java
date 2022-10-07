package java_1007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PopulationStatistics {

    public PopulationMove parse(String data) {
        // 파일에서 읽어온다.
        List<String> dataList = Arrays.asList(data.split(","));

        // 시와 도를 변수에 담는다.
        int fromSido = Integer.valueOf(dataList.get(0));
        int toSido = Integer.valueOf(dataList.get(6));

        // 담은 변수를 PopulationMove Constructor에 담는다
        return new PopulationMove(fromSido, toSido);
    }

    public void readByCharacter(String filename) throws IOException {
        // 한 바이트 씩 읽어오기
        FileReader fileReader = new FileReader(filename);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char)fileReader.read();
            fileContents += c;

        }
    }

    public void readFileByLine(String filename) throws IOException {
        // BufferReader 는 삽으로 모래를 뜨는 느낌
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();

    }

    public void readFileByLine2(String filename) throws IOException {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) throws IOException {
        String address = "//C:\\Users\\Chris\\Downloads\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        // read 메소드 실행까지 파일을 읽어오지 않음






//        char c1 = (char)fileReader.read();
//        char c2 = (char)fileReader.read();
//        System.out.println(c1);
//        System.out.println(c2);
    }
}
