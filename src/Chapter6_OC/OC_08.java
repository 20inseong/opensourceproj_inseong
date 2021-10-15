package Chapter6_OC;
import java.util.Scanner;
public class OC_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen;
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        sen = sc.nextLine();
        for(int i=0;i<sen.length();i++){
            char c = sen.charAt(0);
            sen = sen.substring(1);
            sen = sen + c;
            System.out.println(sen);
        }
        sc.close();
    }
}
