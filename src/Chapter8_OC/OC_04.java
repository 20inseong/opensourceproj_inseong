package Chapter8_OC;
import java.io.*;
import java.util.Scanner;
public class OC_04 {
    public static void main(String[] args) {
        System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
        try{
            Scanner fsc = new Scanner(new FileReader("c:\\windows\\system.ini"));
            int linenum = 1;
            while(fsc.hasNext()){
                String line = fsc.nextLine();
                System.out.printf("%4d", linenum);
                System.out.println(": "+line);
                linenum++;
            }
            fsc.close();;
        }
        catch (IOException e){
            System.out.println("입ㅊ루력 오류가 발생했습니다.");
        }
    }
}
