package Chapter4;
import java.util.Scanner;

class Seat{
    private String seat[];

    public Seat(){
        seat = new String[10];
        for(int i=0;i< seat.length;i++){
            seat[i] = "---";
        }
    }

    public void Show(){
        for(int i=0;i<seat.length;i++){
            System.out.print(seat[i]+" ");
        }
        System.out.println();
    }

    public void Set(String name, int num){
        seat[num-1] = name;
    }

    public void reSet(String name){
        boolean result = false;
        for(int i=0;i<seat.length;i++){
            if(name.equals(seat[i])) {
                seat[i] = "---";
                result = true;
                break;
            }
        }
        if(result == false)
            System.out.println("예약되지 않은 사람입니다.");
    }
}

class Reservation{
    Scanner sc = new Scanner(System.in);
    private Seat s[];
    private String Seatgrade[] = {"S","A","B"};

    public Reservation(){
        s = new Seat[3];
        for(int i=0;i<s.length;i++){
            s[i] = new Seat();
        }
    }

    public void reserve(){
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int GradeNum = sc.nextInt();
        System.out.print(Seatgrade[GradeNum-1]+">>");
        s[GradeNum-1].Show();
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int num = sc.nextInt();
        s[GradeNum-1].Set(name,num);
    }

    public void Check(){
        for(int i=0;i<s.length;i++){
            System.out.print(Seatgrade[i]+">>");
            s[i].Show();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    public void Cancel(){
        System.out.print("좌석 S:1, A:2, B:3>>");
        int grade = sc.nextInt();
        System.out.print(Seatgrade[grade-1]+">>");
        s[grade-1].Show();
        System.out.print("이름>>");
        String name = sc.next();
        s[grade-1].reSet(name);
    }

    public void run(){
        int op;
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            op = sc.nextInt();
            switch (op){
                case 1:
                    reserve();
                    break;
                case 2:
                    Check();
                    break;
                case 3:
                    Cancel();
                    break;
                case 4:
                    return;
            }
        }
    }
}

public class OC4_12 {
    public static void main(String[] args) {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        Reservation r = new Reservation();
        r.run();
    }
}
