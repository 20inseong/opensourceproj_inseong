package Chapter2_Open_Challenge;
import java.util.Scanner;
public class problem12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>>");
		double dble1 = scanner.nextDouble();
		String s = scanner.next();
		double dble2 = scanner.nextDouble();
		
		switch(s) {
		case "+":
			System.out.println(dble1+"+"+dble2+"�� ��� ����� "+(dble1+dble2));
			break;
		case "-":
			System.out.println(dble1+"-"+dble2+"�� ��� ����� "+(dble1-dble2));
			break;
		case "*":
			System.out.println(dble1+"*"+dble2+"�� ��� ����� "+(dble1*dble2));
			break;
		case "/":
			if(dble2 == 0)
				System.out.println("0���δ� ���� �� �����ϴ�.");
			else
				System.out.println(dble1+"/"+dble2+"�� ��� ����� "+(dble1/dble2));
			
			break;
		}
		
		scanner.close();
	}
}
