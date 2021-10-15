package Chapter6;
class Rect{
    int width;
    int height;
    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public boolean eqauls(Object obj){
        Rect p = (Rect)obj;
        if(width*height == p.width*p.height)
            return true;
        else
            return false;
    }
}

public class EqualsEx_6_4 {
    public static void main(String[] args) {
        Rect a = new Rect(2,3);
        Rect b = new Rect(3,2);
        Rect c = new Rect(3,4);
        if(a.eqauls(b))
            System.out.println("a is equal to b");
        if(a.eqauls(c))
            System.out.println("a is equal to c");
        if(b.eqauls(c))
            System.out.println("b is equal to c");
    }
}
