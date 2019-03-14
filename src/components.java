import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class components extends JComponent implements ActionListener
{	
	private Ellipse2D.Double head;
	private Rectangle arms, body, leftLeg, rightLeg;
 	
	public components(int x, int y)
	{
		this.setLocation(x,y);
		this.setSize(30,40);
		
		head = new Ellipse2D.Double(10,0,10,10);
		
		arms = new Rectangle(10,15,7,20);
		rightLeg = new Rectangle(15,35,20,7);
		leftLeg = new Rectangle(5,35,20,7);
		body = new Rectangle(10,15,20,7);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D graphics = (Graphics2D)(g);
		graphics.setColor(Color.BLUE);
		graphics.fill(head);
		graphics.fill(arms);
		graphics.fill(rightLeg);
		graphics.fill(leftLeg);
		graphics.fill(body);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
}
	
	
	

