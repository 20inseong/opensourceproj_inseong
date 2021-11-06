package Chapter9_OC;
import javax.swing.*;
import java.awt.*;
public class OC_04 extends JFrame{
    public OC_04(){
        setTitle("Ten Color Buttons Frame");
        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(1,10);
        Container c = getContentPane();
        c.setLayout(grid);
        Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};

        for(int i=0;i<10;i++) {
            JButton b = new JButton(i+"");
            b.setBackground(col[i]);
            c.add(b);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new OC_04();
    }
}
