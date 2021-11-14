package Chapter10_OC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OC_04 extends JFrame{
    public OC_04(){
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel j = new JLabel("Love Java");
        c.add(j);
        c.setFocusable(true);
        c.requestFocus();
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                    String text = j.getText();
                    j.setText(text.substring(1)+text.substring(0,1));
                }
            }
        });

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OC_04();
    }
}
