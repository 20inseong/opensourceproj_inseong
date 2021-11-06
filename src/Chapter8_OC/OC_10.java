package Chapter8_OC;
import java.util.*;
import java.io.*;
public class OC_10 {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<String, String>();
        Scanner sc;
        try{
            sc = new Scanner(new FileReader("c:\\temp\\phone.txt"));
            while(sc.hasNext()){
                String[] arr = sc.nextLine().split(" ");
                hash.put(arr[0],arr[1]);
            }
            sc = new Scanner(System.in);
            System.out.printf("총 %d개의 전화번호를 읽었습니다.\n", hash.size());
            while(true){
                System.out.print("이름>>");
                String str = sc.next();
                if(str.equals("그만"))
                    break;
                String phoneNumber = hash.get(str);
                if(phoneNumber == null)
                    System.out.println("찾는 이름이 없습니다.");
                else
                    System.out.println(phoneNumber);
            }
            sc.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
