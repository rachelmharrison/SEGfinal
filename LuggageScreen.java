import javax.swing.*;
import java.awt.*;


public class LuggageScreen
{
	public static void main(String[] args)
	{
		new LuggageScreen();
	}

	LuggageScreen()
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
		
		JLabel weightLabel=new JLabel("16.56 kg");
		weightLabel.setForeground(Color.GREEN);
		weightLabel.setFont(new Font("Arial", Font.PLAIN, 200));

		JTextArea passengerLabel=new JTextArea("Passenger Name: (name)\nLuggage Allowance: (luggage allowance)\nFlight: (flight number and time)\nDestination: (airport code)");
		passengerLabel.setEditable(false);
		passengerLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JLabel destinationLabel=new JLabel("YYZ");
		destinationLabel.setFont(new Font("Arial", Font.BOLD, 80));

		JButton printButton=new JButton("Print Luggage Tag");
		printButton.setFont(new Font("Arial", Font.BOLD, 80));
		printButton.setBackground(Color.WHITE);
		printButton.setBorderPainted(false);

		main.setLayout(new BorderLayout());
		gbc.insets=new Insets(2,2,2,2);

		gbc.gridx=0;
		gbc.gridy=0;
		main.add(weightLabel, BorderLayout.NORTH);
		gbc.gridy=10;
		main.add(passengerLabel, BorderLayout.CENTER);
		gbc.gridx=10;
	//	main.add(destinationLabel,BorderLayout.CENTER);
		gbc.gridy=20;
		gbc.gridx=0;
		main.add(printButton,BorderLayout.SOUTH);

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