package Chapter2_Open_Challenge;
import java.util.Scanner;
public class problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �߽ɰ� �������� �Է�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int rad1 = scanner.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� �������� �Է�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int rad2 = scanner.nextInt();
		
		double l = Math.sqrt((x2-x1)*(x2-x1) - (y2-y1)*(y2-y1));
		
		if((rad2 + rad1)>l)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		scanner.close();
	}

}
