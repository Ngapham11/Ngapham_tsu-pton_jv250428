import java.util.Scanner;
import java.util.regex.Pattern;

public class SS5_bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String regex="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,6}";
        String email=scanner.nextLine().trim();
        if (Pattern.matches(regex,email)){
            System.out.println("Email hop le");
        }else System.out.println("Email khong hop le");

    }
}
