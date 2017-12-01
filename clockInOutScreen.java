import javax.swing.*;
import java.awt.*;


public class clockInOutScreen extends JPanel
{
	View view;

	clockInOutScreen(View view)
	{
		this.view=view;

		GridBagConstraints gbc=new GridBagConstraints();
		
		
		JPanel s1=new JPanel();

		JLabel label1=new JLabel("Shift: 22/11/2017 05:30-13:00");
		JLabel label2=new JLabel("Shift: 23/11/2017 06:30-14:00");
		JLabel label3=new JLabel("Shift: 24/11/2017 05:30-13:00");
		JLabel label4=new JLabel("Shift: 25/11/2017 06:30-14:00");
		JLabel label5=new JLabel("Shift: 26/11/2017 05:30-13:00");

		JButton b1=new JButton("Clock Out");

		label1.setFont(new Font("Arial", Font.BOLD, 40));
		label2.setFont(new Font("Arial", Font.PLAIN, 40));
		label3.setFont(new Font("Arial", Font.PLAIN, 40));
		label4.setFont(new Font("Arial", Font.PLAIN, 40));
		label5.setFont(new Font("Arial", Font.PLAIN, 40));
		b1.setFont(new Font("Arial", Font.PLAIN, 40));
		b1.setBackground(Color.WHITE);
		b1.setBorderPainted(false);
		s1.setBackground(Color.WHITE);
		
		s1.add(label1);
		s1.add(b1);

		JPanel c=new JPanel();
		c.setBackground(Color.WHITE);
		c.add(s1);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		c.add(label5);

		this.setLayout(new BorderLayout());
		this.add(c, BorderLayout.CENTER);


	
	}
}