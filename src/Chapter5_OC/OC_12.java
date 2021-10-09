package Chapter5_OC;

import java.util.Scanner;

abstract class Shape{
    private Shape next;
    public Shape() {next = null;}
    public void setNext(Shape obj){next=obj;}
    public Shape getNext(){return next;}
    public abstract void draw();
}

class Line extends Shape {
    @Override
    public void draw(){
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw(){
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

class run{
    Shape start=null, last=null;

    public void insert(Shape beauty, int num) {
        switch(num){
            case 1:
                beauty = new Line();
                break;
            case 2:
                beauty = new Rect();
                break;
            case 3:
                beauty = new Circle();
                break;
        }
        if(start==null){
            start=beauty;
            last=beauty;
        }
        else{
            last.setNext(beauty);
            last=last.getNext();
        }
    }

    public void delete(int num){
        Shape tmp = start;
        Shape x = null;

        for(int i=0; i<num-1; i++){
            if(i==num-2)
                x=tmp;
            tmp=tmp.getNext();
        }

        if(num==1){
            if(start == last)
                start=last=null;
            else
                start = start.getNext();
        }
        else if(tmp==null){
            System.out.println("삭제할 수 없습니다.");
        }
        else if(tmp==last){
            last=x;
            x.setNext(null);
        }
        else
            x.setNext(null);
    }

    public void view(){
        Shape tmp = start;
        if(tmp==null)
            System.out.println("출력할 도형이 없습니다.");
        else{
            while(tmp != null){
                tmp.draw();
                tmp = tmp.getNext();
            }
        }
    }

}

public class OC_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape beauty = null;
        run test = new run();
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        boolean TF=true;

        while(TF){
            System.out.print("십입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int user = sc.nextInt();

            switch(user){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>> ");
                    int input = sc.nextInt();
                    test.insert(beauty, input);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>> ");
                    int x = sc.nextInt();
                    test.delete(x);
                    break;
                case 3:
                    test.view();
                    break;
                case 4:
                    System.out.println("beauty를 종료합니다.");
                    TF=false;
                    break;
            }
            System.out.println();
        }
    }
}
