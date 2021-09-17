import java.util.Scanner;
public class Chapter3_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String s = scanner.next();
        char c = s.charAt(0);
        for(int i=c-96;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.printf("%c",j+97);
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
