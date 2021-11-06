package Chapter8_OC;
import java.io.*;
import java.util.*;
public class OC_12 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        try{
            System.out.print("대상 파일 입력>> ");
            String file = sc.next();
            sc = new Scanner(new FileReader(file));
            while(sc.hasNext()){
                v.add(sc.nextLine());
            }
            sc = new Scanner(System.in);
            while(true){
                System.out.print("검색할 단어나 문장>> ");
                String str = sc.next();
                if(str.equals("그만")){
                    break;
                }
                for(int i=0;i<v.size();i++){
                    if(v.get(i).contains(str) == true){
                        System.out.println(v.get(i));
                    }
                }
            }
            sc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
