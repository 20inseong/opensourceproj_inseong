package Chapter9_OC;
import javax.swing.*;
import java.awt.*;
class North extends JPanel{
    public North(){
        setBackground(Color.LIGHT_GRAY);
        add(new JButton("Open"));
        add(new JButton("Close"));
        add(new JButton("Exit"));
    }
}

class Center extends JPanel{
    public Center(){
        setLayout(null);
        for(int i=0;i<10;i++){
            int x = (int)(Math.random()*250);
            int y = (int)(Math.random()*250);
            JLabel label = new JLabel("*");
            label.setForeground(Color.ORANGE);
            label.setLocation(x,y);
            label.setSize(10,10);
            label.setOpaque(true);
            add(label);
        }
    }
}

class South extends JPanel{
    public South(){
        setBackground(Color.YELLOW);
        add(new JButton("Word Input"));
        add(new TextField(15));
    }
}

public class OC_08 extends JFrame{
    public OC_08(){
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        North N = new North();
        Center C = new Center();
        South S = new South();
        add(N, BorderLayout.NORTH);
        add(C, BorderLayout.CENTER);
        add(S, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OC_08();
    }
}
