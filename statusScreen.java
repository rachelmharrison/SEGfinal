import javax.swing.*;
import java.awt.*;


public class StatusScreen
{
	public static void main(String[] args)
	{
		new StatusScreen();
	}

	StatusScreen()
	{
		JFrame frame=new JFrame("Airport Manager");
		JPanel top=new JPanel();
		JPanel main=new JPanel();
		JPanel bottom=new JPanel();
		JPanel borderLayoutPanel=new JPanel();

		GridBagConstraints gbc=new GridBagConstraints();
		JLabel employeeLabel=new JLabel("Arrivals");
		JButton logOutButton=new JButton("Log Out");
		JButton backButton=new JButton("Back");
		JButton helpButton=new JButton("Help");

		employeeLabel.setFont(new Font("Courier", Font.PLAIN, 40));
		employeeLabel.setForeground(Color.GRAY);

		logOutButton.setFont(new Font("Arial", Font.PLAIN, 20));
		logOutButton.setBackground(Color.WHITE);
		logOutButton.setForeground(Color.GRAY);
		logOutButton.setBorderPainted(false);

		backButton.setFont(new Font("Arial", Font.PLAIN, 20));
		backButton.setBackground(Color.WHITE);
		backButton.setForeground(Color.GRAY);
		backButton.setBorderPainted(false);

		helpButton.setFont(new Font("Arial", Font.PLAIN, 20));
		helpButton.setBackground(Color.WHITE);
		helpButton.setForeground(Color.GRAY);
		helpButton.setBorderPainted(false);

		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		top.add(employeeLabel, BorderLayout.WEST);
	//	top.add(logOutButton, BorderLayout.	EAST);

		bottom.setBackground(Color.WHITE);
		bottom.setLayout(new BorderLayout());
		//bottom.add(backButton, BorderLayout.WEST);
		//bottom.add(helpButton, BorderLayout.	EAST);

		//start of different code
		
		JLabel a=new JLabel("AC200 Air Canada      Toronto      15:05");
		JLabel b=new JLabel("UA457 United Airlines New York     15:10");
		JLabel c=new JLabel("WJ523 West Jet        Montreal     15:12");
		JLabel d=new JLabel("AC123 Air Canada      Quebec City  15:15");
		JLabel e=new JLabel("P0234 Porter Airlines Toronto CIty 15:18");

		JLabel a2=new JLabel("Delayed  ");
		JLabel b2=new JLabel("On Time  ");
		JLabel c2=new JLabel("On Time  ");
		JLabel d2=new JLabel("Cancelled");
		JLabel e2=new JLabel("On Time  ");

		a2.setForeground(Color.RED);
		d2.setForeground(Color.RED);

		b2.setForeground(Color.GREEN);
		c2.setForeground(Color.GREEN);
		e2.setForeground(Color.GREEN);

		a.setFont(new Font("Courier",Font.PLAIN, 25));
		b.setFont(new Font("Courier",Font.PLAIN, 25));
		c.setFont(new Font("Courier",Font.PLAIN, 25));
		d.setFont(new Font("Courier",Font.PLAIN, 25));
		e.setFont(new Font("Courier",Font.PLAIN, 25));
		a2.setFont(new Font("Courier",Font.PLAIN, 25));
		b2.setFont(new Font("Courier",Font.PLAIN, 25));
		c2.setFont(new Font("Courier",Font.PLAIN, 25));
		d2.setFont(new Font("Courier",Font.PLAIN, 25));
		e2.setFont(new Font("Courier",Font.PLAIN, 25));

		JPanel a3=new JPanel();
		a3.add(a);
		a3.add(a2);

		JPanel b3=new JPanel();
		b3.add(b);
		b3.add(b2);

		JPanel c3=new JPanel();
		c3.add(c);
		c3.add(c2);

		JPanel e3=new JPanel();
		e3.add(e);
		e3.add(e2);

		JPanel d3=new JPanel();
		d3.add(d);
		d3.add(d2);

		a3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		b3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		c3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		d3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		e3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

		a3.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		c3.setBackground(Color.WHITE);
		d3.setBackground(Color.WHITE);
		e3.setBackground(Color.WHITE);

		main.add(a3);
		main.add(b3);
		main.add(c3);
		main.add(d3);
		main.add(e3);


		//end of different code

		borderLayoutPanel.setLayout(new BorderLayout());
		borderLayoutPanel.add(top, BorderLayout.NORTH);
		borderLayoutPanel.add(main, BorderLayout.CENTER);
		borderLayoutPanel.add(bottom, BorderLayout.SOUTH);
		borderLayoutPanel.setBackground(Color.WHITE);
		main.setBackground(Color.WHITE);

		frame.setContentPane(borderLayoutPanel);
		frame.setVisible(true);
		frame.setSize(800,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}