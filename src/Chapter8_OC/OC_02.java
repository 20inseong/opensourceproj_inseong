package Chapter8_OC;
import java.io.*;
public class OC_02 {
    public static void main(String[] args) {
        BufferedReader fr = null;
        File f = new File("c:\\temp\\phone.txt");
        try{
            fr = new BufferedReader(new FileReader(f));
            System.out.println(f.getPath() + "를 출력합니다.");
            while(true){
                String line = fr.readLine();
                if(line == null)
                    break;
                System.out.print(line+"\n");
            }
            fr.close();
        }
        catch (IOException e){
            System.out.println("파일 읽기 오류");
        }
    }
}
