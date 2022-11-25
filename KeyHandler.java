package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener
{
    public boolean upPressed, downPressed, leftPressed, rightPressed;
    public void keyPressed(KeyEvent e) // method
    {
        int code = e.getKeyCode(); //this will return the "code number" of key that was pressed e.g. 10 - Enter, 8 - Backspace

        if (code == KeyEvent.VK_W)
        {
            upPressed = true;
        }
        if (code == KeyEvent.VK_S)
        {
            downPressed = true;
            System.out.println("PRESSED");
        }
        if (code == KeyEvent.VK_A)
        {
            System.out.println("PRESSED");
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D)
        {
            System.out.println("PRESSED");
           rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W)
        {
            upPressed = false;
        }
        if (code == KeyEvent.VK_S)
        {
            downPressed = false;
        }
        if (code == KeyEvent.VK_A)
        {
            leftPressed = false;
        }
        if (code == KeyEvent.VK_D)
        {
            rightPressed = false;
        }
    }
    public void keyTyped(KeyEvent e)
    {}
}
