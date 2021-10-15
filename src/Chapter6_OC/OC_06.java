package Chapter6_OC;
import java.util.Scanner;
import java.util.Calendar;

class Person{
    private String name, etr;
    private int sec1, sec2;
    Calendar now = Calendar.getInstance();
    Scanner sc = new Scanner(System.in);
    public Person(String name){
        this.name = name;
    }

    public int game(){
        System.out.print(name+" 시작 <Enter>키>>");
        sec1 = enter();
        System.out.print("10초 예상 후 <Enter>키>>");
        sec2 = enter();
        if(sec1<sec2)
            return Math.abs(sec2-sec1);
        else
            return Math.abs((60-sec1)+sec2);
    }

    public int enter(){
        etr = sc.nextLine();
        now = Calendar.getInstance();
        System.out.println("\t현재 초시간 = "+now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }
}
public class OC_06 {
    public static void main(String[] args) {
        Person p1 = new Person("황기태");
        Person p2 = new Person("이재문");
        int rec1, rec2;
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        rec1 = p1.game();
        rec2 = p2.game();
        System.out.print("황기태의 결과 " + rec1 +", 이재문의 결과 " + rec2 + ",");
        if(rec1>rec2)
            System.out.println("승자는 황기태");
        else
            System.out.println("승자는 이재문");
    }
}
