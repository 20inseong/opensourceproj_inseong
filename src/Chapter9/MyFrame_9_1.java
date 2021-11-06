package Chapter9;
import javax.swing.*;
public class MyFrame_9_1 extends JFrame {
    public MyFrame_9_1() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 300x300
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        MyFrame_9_1 frame = new MyFrame_9_1();
    }

}
