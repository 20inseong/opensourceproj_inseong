package Chapter2_Open_Challenge;
import java.util.Scanner;
public class problem8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점(x1,y1),(x2,y2)를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if((x1 >= 100 && x1 <= 200) && (y1 >= 100 && y1 <= 200) || (x2 >= 100 && x2 <= 200) && (y2 >= 100 && y2 <= 200))
			System.out.println("충돌!");
		else
			System.out.println("충돌하지 않음!");
		
		scanner.close();
	}
}
