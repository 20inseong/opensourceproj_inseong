package Chapter2_Open_Challenge;
import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է�>> ");
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		int int3 = scanner.nextInt();
		
		
		
		if(int1 > int2)
			System.out.println("�߰����� " + ((int2 > int3)?int2:int3));
		else if(int2 > int3)
			System.out.println("�߰����� " + ((int1 > int3)?int1:int3));
		else if(int3 > int1)
			System.out.println("�߰����� " + ((int1 > int2)?int1:int2));
		
		scanner.close();
	}
}
