package Chapter6;

class Point_3{
    int x,y;
    public Point_3(int x,int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object obj){
        Point_3 p = (Point_3)obj;
        if(x == p.x && y == p.y) return true;
        else return false;
    }
}

public class EqualsEx_6_3 {
    public static void main(String[] args) {
        Point_3 a = new Point_3(2,3);
        Point_3 b = new Point_3(2,3);
        Point_3 c = new Point_3(3,4);

        if(a == b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if (a.equals(c))
            System.out.println("a is equal to c");
    }
}
