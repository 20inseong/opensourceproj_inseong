package Chapter7_OC;
import java.util.*;
class Location{
    private String city;
    private int longitude, latitude;
    Location(String city, int longitude, int latitude){
        this.city = city; this.longitude = longitude; this.latitude = latitude;
    }
    public void printLocation(){
        System.out.println(city+"\t"+longitude+"\t"+latitude);
    }
}

public class OC_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Location> h = new HashMap<String, Location>();
        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i=0;i<4;i++){
            System.out.print(">> ");
            String tmp = sc.nextLine();
            String[] temp = tmp.split(", ");
            String city = temp[0];
            int longitude = Integer.parseInt(temp[1]);
            int latitude = Integer.parseInt(temp[2]);
            h.put(city,new Location(city, longitude, latitude));
                    }
        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        System.out.println("-----------------------");
        while(it.hasNext()){
            String n = it.next();
            Location l = h.get(n);
            l.printLocation();
        }
        System.out.println("-----------------------");

        while(true){
            System.out.print("도시 이름 >> ");
            String st = sc.next();
            if(st.equals("그만")){
                break;
            }
            if(h.get(st) !=null){
                h.get(st).printLocation();
            }
            else{
                System.out.println(st+"는 없습니다.");
            }
        }
        sc.close();
    }
}
