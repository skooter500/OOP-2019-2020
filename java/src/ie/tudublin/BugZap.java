package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{   
    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        reset();
    }

    float playerX,playerY;
    float playerSpeed = 5;
    float playerWidth = 40;
    float halfPlayerWidth = playerWidth / 2;

    float bugX, bugY, bugWidth = 30;
    float halfBugWidth = bugWidth / 2;

    void reset()
    {
        resetBug();
        playerX = width / 2;
        playerY = height - 50;
    }

    void resetBug()
    {
        bugX = random(halfBugWidth, width - halfBugWidth);
        bugY = 50;
    }

    void drawPlayer(float x, float y, float w)
    {   
        stroke(255);
        float playerHeight = w / 2;
        line(x - halfPlayerWidth, y + playerHeight, x + halfPlayerWidth, y + playerHeight);
        line(x - halfPlayerWidth, y + playerHeight, x - halfPlayerWidth, y + playerHeight * 0.5f);
        line(x + halfPlayerWidth, y + playerHeight, x + halfPlayerWidth, y + playerHeight * 0.5f);

        line(x - halfPlayerWidth, y + playerHeight * 0.5f, x - (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f);
        line(x + halfPlayerWidth, y + playerHeight * 0.5f, x + (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f);

        line(x - (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f, x + (halfPlayerWidth * 0.8f), y + playerHeight * 0.3f);

        line(x, y, x, y + playerHeight * 0.3f);
    }

    void drawBug(float x, float y)
    {
        stroke(255);
        float saucerHeight = bugWidth * 0.7f;
        line(x, y - saucerHeight, x - halfBugWidth, y);
        line(x, y - saucerHeight, x + halfBugWidth, y);
        line(x - halfBugWidth, y, x - halfBugWidth, y);
        line(x - halfBugWidth, y, x + halfBugWidth, y);
        float feet = bugWidth * 0.1f;
        line(x - feet, y, x - halfBugWidth, y + halfBugWidth);
        line(x + feet, y, x + halfBugWidth, y + halfBugWidth);

        float foot = bugWidth * 0.3f;
        line(x - foot, y, x - halfBugWidth, y + halfBugWidth);
        line(x + foot, y, x + halfBugWidth, y + halfBugWidth);

        float eyes = bugWidth * 0.1f;
        line(x - eyes, y - eyes, x - eyes, y - eyes * 2f);
        line(x + eyes, y - eyes, x + eyes, y - eyes * 2f);

    }


    public void keyPressed()
    {
        if(keyCode == LEFT)
        {
            //System.out.println("Left arrow pressed");
            if (playerX > halfPlayerWidth)
            {
                playerX -= playerSpeed;
            }
        }
        if(keyCode == RIGHT)
        {
            //System.out.println("Right arrow pressed");
            if (playerX < width - halfPlayerWidth)
            {
                playerX += playerSpeed;
            }
        }
        if(key == ' ')
        {
            //System.out.println("SPACE key pressed");
            line(playerX, playerY, playerX, bugY);
        }
    }

    void moveBug()
    {
        if((frameCount % 60) == 0) //every seconds do this code 
        {
            bugX += random(-5, +5); //frameCount variable start 0
            if (bugX < halfBugWidth)
            {
                bugX = 0;
                //bugX = halfBugWidth;
            }

            if (bugX + halfBugWidth > width) 
            {
                bugX = width - halfBugWidth;
            }

            bugY ++;
        }
    }


    public void draw()
    {   
        background(0);
        fill(255);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug(bugX, bugY);
		moveBug();	
    }

}