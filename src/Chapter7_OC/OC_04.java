package Chapter7_OC;
import java.util.*;
public class OC_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> rain = new Vector<Integer>();
        while(true){
            System.out.print("강수량 입력(0 입력시 종료)>> ");
            int num = sc.nextInt();
            if(num == 0)
                break;
            rain.add(num);
            int avr = 0;
            for(int i=0;i< rain.size();i++){
                System.out.print(rain.get(i)+" ");
                avr += rain.get(i);
            }
            System.out.println();
            avr /= rain.size();
            System.out.println("현재 평균 "+avr);
        }
        sc.close();
    }
}
