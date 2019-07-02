import java.util.concurrent.TimeUnit;
import javax.swing.*;
import java.awt.*;

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
		System.out.println(Random.t1ran+"kfjhasd"+Random.t2ran);		
	}	
	public void paint(Graphics g) 
	{
		int i = 0;
		while(true)
		{
			i++;
			g.setColor(Color.red);
			int x = Random.t1ran;
			int y = Random.t2ran;
			System.out.println("x="+x+"y="+y);
			g.drawLine(x,y,x,y);
			try{
				
				TimeUnit.MILLISECONDS.sleep(10);
			}
			catch(Exception e)
			{
			
			}
			if(i==5000)
				break;
		}
	}
}
