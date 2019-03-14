import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener
{
		public  Main()
		{
			JFrame frame = new JFrame("Texas Ranger Walker");
			frame.setLayout(null);
			frame.setBounds(100,100,700,700);	
			
		    components Chuck = new components(350,350);
			
			
			
			
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		public void actionPerformed(ActionEvent e) {
		
			
		}

}
