package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable
    // Game Screen
{
    int OrgtileSize = 15; //game character size, 15x15 size
    int scale = 3; // multiplying this with OrgtileSize, the character size will look bigger
    int tileSize = OrgtileSize * scale; // size of One single tile in pixels
    int totalScreenCol = 16; // total of 16 Columns of tile on the screen
    int totalScreenRow = 12; // total of 12 Row of tile on the screen
    // 16 tiles Horizontally and 12 tiles vertically (4:3 ratio)
    int screenWidth = tileSize * totalScreenCol; // 720 pixels
    int screenHeight = tileSize * totalScreenRow; // 540 pixels

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    //Setting player's default position and speed
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4; // 4 pixels

    public GamePanel()
    {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); //size of the panel
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true); //good for game's reloading performance
        this.addKeyListener(keyH); // adding keyHandler to this Gamepanel() so that the GamePanel will recognize the keys
        this.setFocusable(true); // so that the GamePanel can stay focused when receiving key input from the users
    }
    public void StartGameThread() // method
    {
         gameThread = new Thread(this); //we'll pass GamePanel class to this constructor
         gameThread.start(); // this will automatically call the run() method
    }
    public void run()
    {

        while(gameThread != null)
        {
            /*- with help of this loop we gonna update the position of character.
                for eg. if the player presses down arrow key the position
                of the character will update. */
            update(); // calls the update() method
           /*- and based on this updation, we gonna draw the updated screen */

            repaint(); // calls the paintComponent() method
        }
    }

    public void update() // method
    {
        if (keyH.upPressed) // if player presses W key
        {
            playerY -= playerSpeed; // character will go up by 4 pixels
            System.out.println("Pressed");
        }// IN JAVA, X goes right as the value increases and Y goes down as its value increases
        else if (keyH.downPressed) // if player presses S key
        {
            playerY += playerSpeed; // character will go down 4 pixels
        }
        else if (keyH.leftPressed) // if player presses A key
        {
            playerX -= playerSpeed; // character goes left 4 pixels
        }
        else if (keyH.rightPressed) // if player presses D key
        {
            playerX += playerSpeed; // character goes right 4 pixels
        }
    }

    public void paintComponent(Graphics g) // to paint objects on the screen
    {
        super.paintComponent(g); // format. we have to call this whenever we use paintComponent method

        Graphics2D g2 = (Graphics2D)g; // here we converted the Graphics g to Graphics2D
        // Graphics2D provides more clear control over coordinate transformation, color management, etc.
        // Graphics2D class provides more functions than Graphics class

        g2.setColor(Color.white);
        g2.fillRect(playerX, playerY, tileSize, tileSize); //width and height of tileSize
        // g2.dispose(); // not compulsory to use but will save some memory if used
    }
}
