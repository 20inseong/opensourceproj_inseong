import java.util.Scanner;
public class Chapter3_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int units[];
        units = new int[8];
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();
        for(int i=0; i<unit.length; i++){
            units[i] = money/unit[i];
            money -= units[i] * unit[i];
            if(units[i] != 0) {
                System.out.println(unit[i] + "원짜리 : " + units[i] + "개");
            }
        }
        scanner.close();
    }
}
