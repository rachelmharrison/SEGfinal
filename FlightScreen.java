import javax.swing.*;
import java.awt.*;


public class FlightScreen
{
	public static void main(String[] args)
	{
		new FlightScreen();
	}

	FlightScreen()
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

	//	main.setPreferredSize(new Dimension(1000,1000));
		JPanel buttonPanel1=new JPanel();
		JPanel buttonPanel2=new JPanel();
		JPanel flightPanel=new JPanel();
		JPanel numberPanel=new JPanel();
		JPanel bigButtonPanel=new JPanel();

		buttonPanel2.setBackground(Color.WHITE);
		buttonPanel1.setBackground(Color.WHITE);
		numberPanel.setBackground(Color.WHITE);

		
		JLabel tripLabel=new JLabel("YYZ - YOW");
		tripLabel.setFont(new Font("Arial", Font.BOLD, 100));

		ImageIcon airlineIcon=new ImageIcon("images/ac.png");
		JLabel logoLabel=new JLabel(airlineIcon);

		JLabel numberLabel=new JLabel("AC200");
		numberLabel.setFont(new Font("Arial",Font.PLAIN,100));

		JLabel timeLabel=new JLabel("22/11/2017 15:05");
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JLabel statusLabel=new JLabel("Delayed to 15:35");
		statusLabel.setForeground(Color.RED);
		statusLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JTextArea connectingLabel=new JTextArea("Connecting From: YQT\nConnecting To: YHZ");
		connectingLabel.setEditable(false);
		connectingLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JButton foodButton=new JButton("View Food Served");
		JButton luggageButton=new JButton("View Luggage");
		JButton planeButton=new JButton("View Aircraft");
		JButton passengerButton=new JButton("View Passengers");

		foodButton.setFont(new Font("Arial", Font.PLAIN, 40));
		foodButton.setBackground(Color.WHITE);
		foodButton.setBorderPainted(false);

		luggageButton.setFont(new Font("Arial", Font.PLAIN, 40));
		luggageButton.setBackground(Color.WHITE);
		luggageButton.setBorderPainted(false);

		planeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		planeButton.setBackground(Color.WHITE);
		planeButton.setBorderPainted(false);

		passengerButton.setFont(new Font("Arial", Font.PLAIN, 40));
		passengerButton.setBackground(Color.WHITE);
		passengerButton.setBorderPainted(false);

	//main.setLayout();
		gbc.insets=new Insets(10,10,10,10);

		gbc.gridx=0;
		gbc.gridy=0;
		main.add(tripLabel);
		gbc.gridy=10;
		numberPanel.add(logoLabel);
		gbc.gridx=5;
		numberPanel.add(numberLabel);
		numberPanel.add(timeLabel);
		main.add(numberPanel);
		gbc.gridx=0;
		gbc.gridy=20;
		main.add(connectingLabel);
		gbc.gridy=30;
		buttonPanel1.add(foodButton);
		gbc.gridx=10;
		buttonPanel1.add(luggageButton);
		gbc.gridy=40;
		buttonPanel2.add(planeButton);
		gbc.gridx=0;
		buttonPanel2.add(passengerButton);
		main.add(buttonPanel1);
		main.add(buttonPanel2);


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
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}