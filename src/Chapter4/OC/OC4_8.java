package Chapter4;
import java.util.Scanner;

class Phone{
    private String name;
    private String tel;
    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String get_name(){
        return name;
    }
    public String get_tel(){
        return tel;
    }
}

public class OC4_8 {
    Scanner sc = new Scanner(System.in);
    int num = 0;
    Phone phone[];
    String name;
    String tel;

    public void get_num(){
        System.out.print("인원수>>");
        num = sc.nextInt();
        phone = new Phone[num];
    }
    public void get_info(){
        for(int i=0;i<num;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
            name = sc.next();
            tel = sc.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
    }
    public void search(){
        while(true){
            boolean end = false;
            System.out.print("검색할 이름>>");
            name = sc.next();
            if(name.equals("그만"))
                break;
            for(int i=0;i<num;i++){
                if(name.equals(phone[i].get_name())) {
                    System.out.println(phone[i].get_name()+"의 번호는 "+phone[i].get_tel()+" 입니다.");
                    end = true;
                }
            }
            if(end == false)
                System.out.println(name+" 이 없습니다.");
        }
    }
    public static void main(String[] args) {
        OC4_8 phonebook = new OC4_8();
        phonebook.get_num();
        phonebook.get_info();
        phonebook.search();
    }
}
