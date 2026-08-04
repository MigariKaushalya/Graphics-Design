import javax.swing.*;
import java.awt.*;

public class SimpleHouse extends JFrame
{
	public SimpleHouse()
	{
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void paint (Graphics g)
	{
		super.paint(g);
		g.setColor(Color.black);
		int x1=150,x2=300,x3=300,x4=150,x5=225,x6=215;
		int y1=150,y2=150,y3=250,y4=250,y5=75;
		int x7=245,x8=215,x9=245,x10=260,x11=290,x12=260,x13=290;
		int y6=200,y7=200,y8=250,y9=250,y10=160,y11=160,y12=190,y13=190;
		
		drawDDA(g,x1,x2,y1,y2);
		drawDDA(g,x2,x3,y2,y3);
		drawDDA(g,x3,x4,y3,y4);
		drawDDA(g,x4,x1,y4,y1);
		
		drawDDA(g,x1,x5,y1,y5);
		drawDDA(g,x2,x5,y2,y5);
		
		drawDDA(g,x6,x7,y6,y7);
		drawDDA(g,x6,x8,y6,y8);
		drawDDA(g,x7,x9,y7,y9);
		
		drawDDA(g,x10,x11,y10,y11);
		drawDDA(g,x10,x12,y10,y12);
		drawDDA(g,x11,x13,y11,y13);
		drawDDA(g,x12,x13,y12,y13);
	}
	public void drawDDA(Graphics g,int x1,int x2,int y1,int y2)
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
		new SimpleHouse();
	}
}