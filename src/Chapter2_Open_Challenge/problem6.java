package Chapter2_Open_Challenge;
import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int integer = scanner.nextInt();
		
		if((integer/10)%3 == 0 && (integer%10)%3 == 0)
			System.out.println("�ڼ�¦¦");
		else if((integer/10)%3 == 0 || (integer%10)%3 == 0)
			System.out.println("�ڼ�¦");
		
		scanner.close();
	}

}
