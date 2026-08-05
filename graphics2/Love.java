import javax.swing.*;
import java.awt.*;

class Love extends JFrame
{
	public Love()
	{
		setTitle("Star Drawing");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		
		//L
		g.drawLine(50,50,50,200);
		g.drawLine(50,200,100,200);
		
		//o
		g.drawOval(150,50,80,150);
		
		//v
		g.drawLine(310,50,350,200);
		g.drawLine(350,200,390,50);
		
		//E
		g.drawLine(440,50,500,50);
		g.drawLine(440,50,440,200);
		g.drawLine(440,200,500,200);
		g.drawLine(440,125,490,125);
	}
	
	public static void main(String args[])
	{
		Love frame = new Love();
	}
}