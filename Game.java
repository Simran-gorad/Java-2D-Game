import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame implements KeyListener{

    JFrame frame;
    JLabel label;
    JLabel label2;

    ImageIcon icon;

    Game(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        label = new JLabel();
        label.setBounds(0, 0, 50, 50);
        label2 = new JLabel();
        label2.setBounds(260, 260, 50, 50);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setOpaque(true);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.add(label2);
        this.setVisible(true);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }



    @Override
    public void keyPressed(KeyEvent e) {


    }

    @Override
    public void keyReleased(KeyEvent e) {        int code = e.getKeyCode(); //this will return the "code number" of key that was pressed e.g. 10 - Enter, 8 - Backspace

        if (code == KeyEvent.VK_W)
        {
            label2.setLocation(label2.getX(), label2.getY() - 10);
        }
        if (code == KeyEvent.VK_S)
        {
            label2.setLocation(label2.getX(), label2.getY() + 10);
        }
        if (code == KeyEvent.VK_A)
        {
            label2.setLocation(label2.getX()-10, label2.getY() );
        }
        if (code == KeyEvent.VK_D)
        {
            label2.setLocation(label2.getX() + 10, label2.getY());

        }
        if(code == 37)
        {
            label.setLocation(label.getX() - 10, label.getY());
        }
        if(code == 38)
        {
            label.setLocation(label.getX(), label.getY() - 10);
        }
        if(code == 39)
        {
            label.setLocation(label.getX() + 10, label.getY());
        }
        if(code == 40)
        {
            label.setLocation(label.getX(), label.getY() + 10);
        }
        //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
    }
//        //keyReleased = called whenever a button is released
//        System.out.println("You released key char: " + e.getKeyChar());
//        System.out.println("You released key code: " + e.getKeyCode());
    }
