import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String REGEX = "^[CAP]+\\d{4}+[GHIKLM]$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten lop");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Ten lop hop le");
        }else{
            System.out.println("Ten lop khong hop le");
        }
    }
}