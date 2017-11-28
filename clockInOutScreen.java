import javax.swing.*;
import java.awt.*;


public class clockInOutScreen
{
	public static void main(String[] args)
	{
		new clockInOutScreen();
	}

	clockInOutScreen()
	{
		JFrame frame=new JFrame("Airport Manager");
		JPanel top=new JPanel();
		JPanel main=new JPanel();
		JPanel bottom=new JPanel();
		JPanel borderLayoutPanel=new JPanel();

		GridBagConstraints gbc=new GridBagConstraints();
		JLabel employeeLabel=new JLabel("Employee Name: (name of logged in employee)  Employee Number: (########)");
		JButton logOutButton=new JButton("Log Out");
		JButton backButton=new JButton("Back");
		JButton helpButton=new JButton("Help");

		employeeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
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
		top.add(logOutButton, BorderLayout.	EAST);

		bottom.setBackground(Color.WHITE);
		bottom.setLayout(new BorderLayout());
		bottom.add(backButton, BorderLayout.WEST);
		bottom.add(helpButton, BorderLayout.	EAST);

		//start of different code
		
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

		main.setLayout(new BorderLayout());
		main.add(c, BorderLayout.CENTER);


		//end of different code

		borderLayoutPanel.setLayout(new BorderLayout());
		borderLayoutPanel.add(top, BorderLayout.NORTH);
		borderLayoutPanel.add(main, BorderLayout.CENTER);
		borderLayoutPanel.add(bottom, BorderLayout.SOUTH);
		borderLayoutPanel.setBackground(Color.WHITE);
		main.setBackground(Color.WHITE);

		frame.setContentPane(borderLayoutPanel);
		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}