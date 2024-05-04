import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();

        // 출력 형식 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 날짜를 문자열로 변환하여 출력하기
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
    }
}