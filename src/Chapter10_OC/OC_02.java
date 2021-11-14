package Chapter10_OC;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class OC_02 extends JFrame{
    OC_02(){
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);

        c.addMouseListener(new mouseListener());
        c.addMouseMotionListener(new motionListener());
        setSize(300,300);
        setVisible(true);
    }
    public class motionListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.yellow);
        }
    }

    public class mouseListener extends MouseAdapter{
        public void mouseReleased(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new OC_02();
    }
}
