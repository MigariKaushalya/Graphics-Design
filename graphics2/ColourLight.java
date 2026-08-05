import javax.swing.*;
import java.awt.*;

public class ColourLight extends JFrame{
	ColourLight()
	{
		setTitle("Design colour light");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRoundRect(200,100,60,150,20,20);
		g.fillRect(220,250,20,100);
		
		g.setColor(Color.RED);
		g.fillArc(215,120,30,30,0,360);
		g.setColor(Color.YELLOW);
		g.fillArc(215,165,30,30,0,360);
		g.setColor(Color.GREEN);
		g.fillArc(215,210,30,30,0,360);
		
	}
	
	public static void main(String args[])
	{
		new ColourLight();
	}
}