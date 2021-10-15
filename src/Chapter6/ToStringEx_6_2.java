package Chapter6;
class Point_2{
    int x,y;
    public Point_2(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Point("+x+","+y+")";
    }
}

public class ToStringEx_6_2 {
    public static void main(String[] args) {
        Point_2 p = new Point_2(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p+"입니다.");
    }
}
