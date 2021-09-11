package Chapter2_Open_Challenge;
import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int integer = scanner.nextInt();
		
		if((integer/10)%3 == 0 && (integer%10)%3 == 0)
			System.out.println("박수짝짝");
		else if((integer/10)%3 == 0 || (integer%10)%3 == 0)
			System.out.println("박수짝");
		
		scanner.close();
	}

}
