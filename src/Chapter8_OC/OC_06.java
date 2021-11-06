package Chapter8_OC;
import java.io.*;
import java.util.Scanner;
public class OC_06 {
    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileInputStream f2 = null;
        FileOutputStream f3;
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        s1=sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        s2=sc.nextLine();
        try{
            f1 = new FileInputStream(s1);
            f2 = new FileInputStream(s2);
            f3 = new FileOutputStream("C:\\Users\\RC\\IdeaProjects\\javafirst\\src\\Chapter8_OC\\append.txt");
            int c;

            while((c = f1.read()) != -1)
                f3.write((char)c);
            while((c = f2.read()) != -1)
                f3.write(c);
            System.out.println("프로젝트 폴더 밑에 append.txt 파일에 저장했습니다.");
            f1.close();
            f2.close();
            f3.close();
            sc.close();
        }
        catch (IOException e){
            System.out.println("파일 입출력 오류");
        }
    }
}
