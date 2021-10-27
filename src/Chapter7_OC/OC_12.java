package Chapter7_OC;
import java.util.*;
class quiz{
    private HashMap<String, String> h = new HashMap<String, String>();
    Scanner sc = new Scanner(System.in);
    public quiz(){
        h.put("eye","눈");
        h.put("friend","친구");
        h.put("bird","새");
        h.put("fire","불");
        h.put("water","물");
        h.put("sleep","자다");
        h.put("fault","오류");
        h.put("human","인간");
        h.put("love","사랑");
        h.put("emotion","감정");
        h.put("painting","그림");
        h.put("animal","동물");
        h.put("transaction","거래");
        h.put("lover","애인");
        h.put("society","사회");
        h.put("statue","조각상");
        h.put("scissors","가위");
    }

    public void run(){
        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        while(true){
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            int num = sc.nextInt();
            if(num==1){
                quizgame();
                System.out.println();
            }
            else if(num==2){
                input();
                System.out.println();
            }
            else if(num==3){
                System.out.println("\"명품영어\"를 종료합니다.");
                break;
            }
            else
                System.out.println("잘못된 명령입니다.");
        }
    }

    public void input() {
        System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
        while(true){
            System.out.print("영어 한글 입력 >> ");
            String eng = sc.next();
            if(eng.equals("그만")){
                break;
            }
            String kor = sc.next();
            h.put(eng,kor);
        }
    }

    public void quizgame(){
        System.out.println("현재 "+h.size()+"개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
        while(true){
            int index = (int)(Math.random()*h.size());
            Set<String> keys = h.keySet();
            Object[] arr = keys.toArray();

            String question = (String)arr[index];
            String answer = h.get(question);
            int answer_i = (int)(Math.random()*4)+1;
            System.out.println(question+"?");
            for(int i=1;i<=4;i++){
                if(i==answer_i){
                    System.out.print("("+i+")"+h.get((String)arr[index])+" ");
                    continue;
                }
                int random_i = (int)(Math.random()*h.size());
                if(random_i==index){
                    i--;
                    continue;
                }
                else{
                    System.out.print("("+i+")"+h.get((String)arr[random_i])+" ");
                }
            }
            System.out.print(" :>");

            int re=0;
            while(true){
                try {
                    int reply=sc.nextInt();
                    if (reply == -1) {
                        re = -1;
                        break;
                    }

                    if (reply == answer_i) {
                        System.out.println("Excellent !!");
                        break;
                    }
                    else {
                        System.out.println("No. !!");
                        break;
                    }
                }
                catch (InputMismatchException e){
                    sc.next();
                    System.out.println("숫자를 입력하세요 !!");
                }
            }
            if(re==-1)
                break;
        }
    }
}
public class OC_12 {
    public static void main(String[] args) {
        quiz q = new quiz();
        q.run();
    }
}
