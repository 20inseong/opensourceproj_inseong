package Chapter5;

class Point_3{
    private int x, y;
    public Point_3(){
        this.x=this.y=0;
    }
    public Point_3(int x, int y){
        this.x=x; this.y=y;
    }
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint_3 extends Point_3{
    private String color;
    public ColorPoint_3(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}

public class SuperEx_5_3 {
    public static void main(String[] args) {
        ColorPoint_3 cp = new ColorPoint_3(5, 6, "blue");
        cp.showColorPoint();
    }
}
