package Chapter6_OC;

class Circle{
    int x,y,r; //x점,y점,반지름

    public Circle(int x, int y, int r){ //입력받기
        this.x=x; this.y=y; this.r=r;
    }

    public String toString(){
        return "Circle("+x+","+y+")"+"반지름"+r;
    }

    public boolean equals(Object obj){
        Circle a = (Circle)obj;
        if(a.x == x && a.y == y )
            return true;
        else
            return false;
    }
}

public class OC_02 {
    public static void main(String[] args) {
        Circle a = new Circle(2,3,5);
        Circle b = new Circle(2,3,30);
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
