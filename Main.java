package main;
import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Game");
        window.setVisible(true);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel); // adding the GamePanel.java file to this window

        window.pack(); // this will fit this window's size same as its subcomponents i.e same as the added class's window size(GamePanel.java)

        window.setLocationRelativeTo(null); //will always display the window in the center
        gamePanel.StartGameThread();
    }
}