package java_1006.file;

import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
        File dir = new File("./");

        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file);
        }
    }
    // 디렉토리
    /*
    .\.git
    .\.gitignore
    .\.idea
    .\LikeLion.iml
    .\out
    .\src
     */
}
