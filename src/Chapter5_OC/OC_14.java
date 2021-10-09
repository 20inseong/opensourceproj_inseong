package Chapter5_OC;

interface Shape2{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("---다시 그립니다.");
        draw();
    }
}

class Circle2 implements Shape2{
    private int r;
    Circle2(int r){
        this.r = r;
    }
    @Override
    public void draw(){
        System.out.println("반지름이 "+r+"인 원입니다.");
    }
    @Override
    public double getArea(){
        return PI*r*r;
    }
}

class Oval implements Shape2{
    private int width, height;
    Oval(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
    }
    @Override
    public double getArea(){
        return width*height*PI;
    }
}

class Rect2 implements Shape2{
    private int height;
    private int width;
    Rect2(int width, int height){
        this.width=width; this.height=height;
    }
    @Override
    public void draw(){
        System.out.println(width+"x"+height+"크기의 사각형입니다.");
    }
    @Override
    public double getArea(){
        return height*width;
    }
}

public class OC_14 {
    public static void main(String[] args) {
        Shape2 [] list = new Shape2[3];
        list[0] = new Circle2(10);
        list[1] = new Oval(20,30);
        list[2] = new Rect2(10,40);

        for(int i=0; i< list.length;i++)
            list[i].redraw();
        for(int i=0; i< list.length; i++)
            System.out.println("면적은 "+list[i].getArea());
    }
}
