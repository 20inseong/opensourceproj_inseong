package Chapter4;
import java.util.Scanner;

public class Rectangle_4_2 {
    int width;
    int height;

    public int getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle_4_2 rect = new Rectangle_4_2();
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");

        rect.width = sc.nextInt();
        rect.height = sc.nextInt();

        System.out.println("사각형의 면적은 " + rect.getArea());

        sc.close();
    }
}
