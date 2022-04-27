import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Stroka3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку ");
        String n = in.nextLine();
        Pattern p = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher m = p.matcher(n);
        int q = 0;
        while (m.find()) {
            System.out.println(m.group() + " ");
            q++;
        }
        System.out.print("Количество слов написаных латиницей: " + q);
    }
}
