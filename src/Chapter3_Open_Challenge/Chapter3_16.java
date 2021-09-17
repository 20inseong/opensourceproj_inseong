import java.util.Scanner;
public class Chapter3_16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        int n = (int)(Math.random()*3);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true){
            System.out.println("가위 바위 보!>>");
            String game = sc.next();
            if(game.equals("가위")){
                if(n==0)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 서로 비겼습니다.");
                else if(n==1)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
                else if(n==2)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
            }
            else if(game.equals("바위")){
                if(n==0)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                else if(n==1)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 서로 비겼습니다.");
                else if(n==2)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
            }
            else if(game.equals("보")){
                if(n==0)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
                else if(n==1)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                else if(n==2)
                    System.out.println("사용자 = " + game + ", 컴퓨터 = " + str[n] + ", 서로 비겼습니다.");
            }
            if(game.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
        }
    }
}
