import javax.swing.*;
import java.awt.*;


public class TicketScreen
{
	public static void main(String[] args)
	{
		new TicketScreen();
	}

	TicketScreen()
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
		
		JTextArea passengerLabel=new JTextArea("\n\nPassenger Name: (name)\nLuggage Allowance: (luggage allowance)\nFinal Destination: (airport code)");
		passengerLabel.setEditable(false);
		passengerLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JLabel numberLabel=new JLabel("AC200");
		numberLabel.setFont(new Font("Arial",Font.PLAIN,100));

		JLabel timeLabel=new JLabel("22/11/2017 15:05");
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JPanel flightPanel=new JPanel();
		flightPanel.add(numberLabel);
		flightPanel.add(timeLabel);
		flightPanel.setBackground(Color.WHITE);

		main.add(flightPanel);
		main.add(passengerLabel);

		ImageIcon check=new ImageIcon("images/check.jpg");
		JLabel checkLabel=new JLabel(check);
		main.add(checkLabel);


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