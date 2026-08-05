import javax.swing.*;
import java.awt.*;

public class Pentagom_DDA_using_ARRAY extends JFrame
{
	public Pentagom_DDA_using_ARRAY()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	                                              // int xpoint[] = {200, 300, 400, 400, 200};
                                                   //int ypoint[] = {200, 100, 200, 300, 300};
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.black);
		
		int xpoint[]={200,300,400,400,200};
		int ypoint[]={200,100,200,300,300};
		
		for(int i=0; i<xpoint.length; i++)
		{
			 int nextx = (i + 1) % xpoint.length;
             int nexty =(i+1) %ypoint.length;
			 
			 drawDDA(g,xpoint[i], ypoint[i],xpoint[nextx], ypoint[nexty]);
           
		}
	}
	 public void drawDDA(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx=x2-x1;
		int dy=y2-y1;
		
		int steps;
		
		if(Math.abs(dx)>Math.abs(dy))
		{
			steps=Math.abs(dx);
		}
		else
		{
			steps=Math.abs(dy);
		}
		
		float xinc = dx/(float)steps;
		float yinc = dy/(float)steps;
		
		float x=x1;
		float y=y1;
		
		for(int i=0;i<steps;i++)
		{
			g.drawRect(Math.round(x),Math.round(y),1,1);
			x=x+xinc;
			y=y+yinc;
		}
	}
	
	public static void main(String args[])
	{
		new Pentagom_DDA_using_ARRAY();
	}
}