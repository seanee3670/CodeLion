import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.ArrayList;

public class MiniForum {

    ArrayList<HashMap<String, Object>> forumTable = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /*
         * 미니 게시판을 만들려고 한다.
         * 1) HashMap 와 ArrayList 를 이용해 게시판 생성
         *
         * 2) 메뉴 보여주기
           1.전체리스트  2.등록  0.종료>

         * 3) 전체리스트
           == 게시물 리스트 ==
             no                title                 date
              1               안녕하세요.           2022-08-23
              2               건강하세요.           2022-08-23

         * 4) 등록
           제목:건강하세요.
           작성자:홍길자
           글이 추가 되었습니다.

         * 5) 종료
           프로그램이 종료되었습니다.
         */

        MiniForum miniforum = new MiniForum();

        int choice;

        do {
            System.out.print("1.전체리스트  2.등록  0.종료>");
            choice = Integer.valueOf(br.readLine());

            switch (choice) {
                case 1: miniforum.viewTotalList();
                break;

                case 2: miniforum.register();
                break;
            }
        } while (choice != 0);

        System.out.println("프로그램이 종료되었습니다.");
    }

    private void viewTotalList() {
        System.out.println("== 게시물 리스트 ==");
        System.out.printf("  %s                %s                 %s %n", "no", "title", "date");


        HashMap<String, Object> forum = null;
        for (int i = 0; i < forumTable.size(); i++) {
            forum = forumTable.get(i);

            System.out.printf("%4d               %-15s  %s %n",
                    forum.get("no"), forum.get("title"), forum.get("date"));
        }
    }

    private void register() throws IOException{
        HashMap<String, Object> forum = new HashMap<>();

        int idx = forumTable.isEmpty() ? 1 : forumTable.size() + 1;

        forum.put("no", idx);
        System.out.print("제목:");
        forum.put("title", br.readLine());
        System.out.print("작성자:");
        forum.put("author", br.readLine());
        forum.put("date", dateFormat.format(new Date()));

        forumTable.add(forum);

        System.out.println("글이 추가 되었습니다.");
    }
}
