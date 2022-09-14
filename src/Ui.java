import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ui {
    JFrame frame = new JFrame("Zaludovina ++ ");
    JButton jb1 = new JButton();

    void init() {
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(3);
        jb1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jb1.setBounds(randInt(0, 750), randInt(0, 750), 50, 50);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    void draw() {
        jb1.setBounds(0, 0, 50, 50);
        frame.add(jb1);
        frame.setVisible(true);
        frame.repaint();
    }

    public int randInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
