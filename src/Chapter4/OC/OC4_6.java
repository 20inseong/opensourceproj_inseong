package Chapter4;
import java.util.Scanner;

class circle_1{
    private double x, y;
    private int radius;
    public circle_1(double x, double y, int radius){
        this.x = x; this.y = y; this.radius = radius;
    }
    public void show(){
        System.out.println("("+x+","+y+")"+radius);
    }
    public int RD(){
        return radius;
    }
}

public class OC4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle_1 c [] = new circle_1[3];
        int num=0;
        for(int i=0; i<c.length; i++){
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new circle_1(x,y,radius);
        }
        for(int i=0;i<c.length;i++){
            if(c[num].RD()<c[i].RD())
                num=i;
        }
        System.out.println("가장 면적이 큰 원은 ");
        c[num].show();
        sc.close();
    }
}
