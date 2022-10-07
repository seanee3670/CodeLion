package java_1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopulationStatistics {

    public void createFile(String filename) throws IOException {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        // 파일에서 읽어온다.
        List<String> dataList = Arrays.asList(data.split(","));

        // 시와 도를 변수에 담는다.
        int fromSido = Integer.valueOf(dataList.get(6));
        int toSido = Integer.valueOf(dataList.get(0));

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

    public List<PopulationMove> readFileByLine(String filename) throws IOException {

        List<PopulationMove> result = new ArrayList<>();
                // BufferReader 는 삽으로 모래를 뜨는 느낌
                BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
//            PopulationMove pm = parse(str);
        }
        reader.close();

        return result;
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
//        List<PopulationMove> pml = populationStatistics.readFileByLine(address);
//
//        System.out.println(pml.size());
//        // read 메소드 실행까지 파일을 읽어오지 않음
//
//        for (PopulationMove pm : pml) {
//            System.out.printf("전입: %s, 전출: %s\n", pm.getFromSido(), pm.getToSido());
//        }

        populationStatistics.createFile("./from_to.txt");





//        char c1 = (char)fileReader.read();
//        char c2 = (char)fileReader.read();
//        System.out.println(c1);
//        System.out.println(c2);
    }
}
