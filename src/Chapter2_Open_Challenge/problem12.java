package Chapter2_Open_Challenge;
import java.util.Scanner;
public class problem12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		double dble1 = scanner.nextDouble();
		String s = scanner.next();
		double dble2 = scanner.nextDouble();
		
		if(s.equals("+"))
			System.out.println(dble1+"+"+dble2+"의 계산 결과는 "+(dble1+dble2));
		else if(s.equals("-"))
			System.out.println(dble1+"-"+dble2+"의 계산 결과는 "+(dble1-dble2));
		else if(s.equals("*"))
			System.out.println(dble1+"*"+dble2+"의 계산 결과는 "+(dble1*dble2));
		else if(s.equals("/")) {
			if(dble2 == 0)
				System.out.println("0으로는 나눌 수 없습니다.");
			else
				System.out.println(dble1+"/"+dble2+"의 계산 결과는 "+(dble1/dble2));
		}
		
		scanner.close();
	}
}
