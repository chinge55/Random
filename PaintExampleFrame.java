import javax.swing.*;
import java.awt.*;

class PaintExampleFrame extends JFrame
{
	PaintExampleFrame()
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ATTEMPT");
		setSize(1000,500);
		setLocation(new Point(0,0));
		setVisible(true);
		setBackground(Color.black);
		System.out.println(Random.t1ran+"kfjhasd"+Random.t2ran);		
	}	
	public void paint(Graphics g)
	{
		int i = 0;
		while(true)
		{
			g.setColor(Color.red);
			int x = Random.t1ran;
			int y = Random.t2ran;
			g.drawLine(x,y,x,y);
			i++;
			if(i==5000)

				break;
		}
	}
}
