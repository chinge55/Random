import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;
import java.io.*;

class PaintExampleFrame extends JFrame
{
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
			//int a = Math.abs(Random.t1ran-x);
			//int b = Math.abs(Random.t2ran-y);
			x = Random.t1ran;
			y = Random.t2ran;
			fw.write(x+","+y+"\n");
			System.out.println("x="+x+"y="+y);
			g.drawLine(x,y,x,y);
			try{
				
				TimeUnit.MILLISECONDS.sleep(10);
			}
			catch(Exception e)
			{
			
			}
			if(i==1000)
				break;
		}
	fw.close();
	}catch(IOException e)
	{
		System.out.println("Error in file");
		
	}
	}
}
