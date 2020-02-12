package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		/*
		background(0);		
		stroke(255);
		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);
		line(10, 40, 100, 40);

		for(int y = 10 ; y <= 40 ; y += 10)
		{
			line(200, y, 300, y);
		}

		int yy = 10;
		while(yy <= 40)
		{
			line(300, yy, 400, yy);
			yy += 10;
		}
		*/

		draw7();
	
	}

	public void draw1()
	{
		background(255);
		stroke(0);
		for (int i = 0; i <= 500; i += 20)
		{
			line(i, 0, 500 - i, 500);
			line(0, i , 500, 500 - i);
		}
	}

	public void draw2()
	{
		stroke(0);
		fill(255);
		for (int i = 25; i <= 475; i += 50)
		{
			ellipse(i, 250, 50, 50);
		}
	}

	public void draw3()
	{
		noStroke();
		colorMode(HSB);
		int color = 0;
		float colorGap = 255 / 10.0f;
		for (int i = 0; i <= 450; i += 50)
		{
			fill(color, 255, 255);
			rect(i, 0, 50, 500);
			color += colorGap;
		}
	}

	public void draw4()
	{
		background(255);
		noStroke();
		colorMode(HSB);
		int color = 0;
		float colorGap = 255 / 10.0f;
		for (int i = 25; i <= 475; i += 50)
		{
			fill(color, 255, 255);
			ellipse(i, 250, 50, 50);
			color += colorGap;
		}
	}

	public void draw5()
	{
		background(0);
		stroke(0, 255, 0);
		for (int i = 0; i <= 10; i ++)
		{
			line(50 + i * 40, 50, 50 + i * 40, 450);
			line(50, 50 + i * 40, 450, 50 + i * 40);
		}
	}

	public void draw6()
	{
		for (int i = 1; i <= 5; i ++)
		{
			rect(250 - i * 25, 400 - i * 60, i * 50, 60);
		}
	}

	public void draw7()
	{
		background(255);
		noStroke();
		colorMode(HSB);
		float color = 0.0f;
		float colorGap = 255.0f / 19.0f;
		for (int i = 0; i < 10  ; i ++)
		{
			color = colorGap * i;
			for (int j = 0; j < 10; j ++)
			{
				fill(color, 255, 255);
				ellipse(25 + 50 * i, 25 + 50 * j, 50, 50);
				color += colorGap;
			}
		}
	}

	public void draw8()
	{
		noStroke();
		for (int i = 0; i < 500  ; i += 25)
		{
			for (int j = 0; j < 500; j += 25)
			{
				if ( (i%50 == 0 && j%50 == 0) || (i%50 != 0 && j%50 != 0) )
				{
					fill (0, 0, 255);
				}
				else
				{
					fill (25, 25, 112);
				}
				rect(i, j, 25, 25);
			}
		}
	}
}
