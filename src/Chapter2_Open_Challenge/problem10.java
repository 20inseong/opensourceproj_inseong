package Chapter2_Open_Challenge;
import java.util.Scanner;
public class problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름의 입력>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int rad1 = scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름의 입력>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int rad2 = scanner.nextInt();
		
		double l = Math.sqrt((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1));
		
		if((rad2 + rad1)>l)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		scanner.close();
	}

}
