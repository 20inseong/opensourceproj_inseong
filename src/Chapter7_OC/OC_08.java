package Chapter7_OC;
import java.util.*;

public class OC_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        System.out.println("** 포인트 관리 프로그램입니다.");

        while(true){
            System.out.print("이름과 포인트 입력>> ");
            String st = sc.nextLine();
            if(st.equals("그만")){
                break;
            }
            String[] t = st.split(" ");
            String name = t[0];
            int point = Integer.parseInt(t[1]);
            if(h.get(name) != null){
                int tmp = h.get(name);
                h.put(name,tmp+point);
            }
            else{
                h.put(name,point);
            }
            Set<String> keys = h.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                String n = it.next();
                int p = h.get(n);
                System.out.print("("+n+","+p+")");
            }
            System.out.println();
        }
    }
}
