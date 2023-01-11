import java.time.YearMonth;

public class Task3 {
    public static void main(String[] args) {
        int yearNow = YearMonth.now().getYear();
        int yearBirth = 1991;
        int age = yearNow - yearBirth;
        System.out.println("Возраст = " + age);
    }
}
