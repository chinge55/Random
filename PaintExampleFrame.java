import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
class PaintExampleFrame extends JFrame
{

	static int points_arr[][] = new int[501][501];
	PaintExampleFrame()
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ATTEMPT");
		setSize(500,500);
		setLocation(new Point(110,110));
		setVisible(true);
		setBackground(Color.black);
		System.out.println("Starting point"+Random.t1ran+","+Random.t2ran);		
	}	
	public void paint(Graphics g) 
	{
	try
	{
		FileWriter fw = new FileWriter("output.txt");
		int i = 0,x=0, y=0;
		while(true)
		{
			i++;

			g.setColor(Color.red);
			x = Random.t1ran;
			y = Random.t2ran;
			
			points_arr[x][y]= points_arr[x][y]+1;

			switch(points_arr[x][y])
			{
				case 2:
					g.setColor(Color.blue);
					break;
				case 3:
					g.setColor(Color.green);
					break;
				case 4:
					g.setColor(Color.yellow);
					break;
			
			}
			//int a = Math.abs(Random.t1ran-x);
			//int b = Math.abs(Random.t2ran-y);
			fw.write(x+","+y+"\n");
			
			System.out.println("x="+x+", y="+y+" Occurences:"+points_arr[x][y]);
			g.drawLine(x,y,x,y);
			try{
			
				TimeUnit.MILLISECONDS.sleep(10);
			}
			catch(Exception e)
			{
			
			}
			if(i==1000)
			{	
				try
				{
					BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
					ImageIO.write(image, "png", new File("./screenshot.png"));
					break;
				}
				catch(Exception e)
				{
					e.printStackTrace();
					break;
				}
			}
		}
	fw.close();
	}catch(IOException e)
	{
		System.out.println("Error in file");
		
	}
	}
}
