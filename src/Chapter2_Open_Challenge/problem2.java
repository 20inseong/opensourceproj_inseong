package Chapter2_Open_Challenge;
import java.util.Scanner;
public class problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int integer = scanner.nextInt();
		
		if(integer/10 == integer%10)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		
		scanner.close();
	}
}
