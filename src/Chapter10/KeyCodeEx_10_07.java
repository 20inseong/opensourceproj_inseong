package Chapter10;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class KeyCodeEx_10_07 extends JFrame {
    private JLabel la = new JLabel();
    private JPanel contentPane = new JPanel();
    public KeyCodeEx_10_07() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener());
        c.add(contentPane);
        c.add(la);
        contentPane.setOpaque(true);
        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            la.setText(e.getKeyText(e.getKeyCode()) + "가 입력되었음");
            Container cc = getContentPane();
            if(e.getKeyChar() == '%'){
                contentPane.setBackground(Color.YELLOW);
                cc.add(contentPane);

            }
            else if(e.getKeyCode() == KeyEvent.VK_F1){
                contentPane.setBackground(Color.GREEN);
                cc.add(contentPane);

            }

        }
    }


    public static void main(String[] args) {
        new KeyCodeEx_10_07();
    }
}
