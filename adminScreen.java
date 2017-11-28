import javax.swing.*;
import java.awt.*;


public class adminScreen
{
	public static void main(String[] args)
	{
		new adminScreen();
	}

	adminScreen()
	{
		JFrame frame=new JFrame("Airport Manager");
		JPanel top=new JPanel();
		JPanel main=new JPanel();
		JPanel bottom=new JPanel();
		JPanel borderLayoutPanel=new JPanel();

		GridBagConstraints gbc=new GridBagConstraints();
		JLabel employeeLabel=new JLabel("Welcome: (name of logged in manager)");
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
		
		JPanel leftPanel=new JPanel();
		JPanel rightPanel=new JPanel();
		JPanel centerPanel=new JPanel();

		main.setLayout(new BorderLayout());

		JButton viewPassengers=new JButton("Passengers");
		JButton viewLuggage=new JButton("Luggage");
		JButton viewPersonnel=new JButton("Personnel");
		JButton viewEventLogs=new JButton("Event Logs");
		JButton viewFlights=new JButton("Flights");
		JButton viewFeeds=new JButton("Camera Feeds");
		JButton viewServices=new JButton("Services and Shops");
		JButton viewGuards=new JButton("Security Guard Locations");
		JButton viewDeliveries=new JButton("Deliveries");
		JButton viewLineTimes=new JButton("Line Wait Times");

		JButton logLuggage=new JButton("Scan Luggage");
		JButton logPassenger=new JButton("Scan Ticket");
		JButton logEvent=new JButton("Log Event");
		JButton logPersonnel=new JButton("Check In/Out Employee");
		JButton logDelivery=new JButton("Scan Delivery");

		
		viewDeliveries.setFont(new Font("Arial", Font.PLAIN, 20));
		viewDeliveries.setBackground(Color.WHITE);
		viewDeliveries.setBorderPainted(false);
		viewDeliveries.setHorizontalAlignment(SwingConstants.LEFT);

		viewLineTimes.setFont(new Font("Arial", Font.PLAIN, 20));
		viewLineTimes.setBackground(Color.WHITE);
		viewLineTimes.setBorderPainted(false);
		viewLineTimes.setHorizontalAlignment(SwingConstants.LEFT);

		viewGuards.setFont(new Font("Arial", Font.PLAIN, 20));
		viewGuards.setBackground(Color.WHITE);
		viewGuards.setBorderPainted(false);
		viewGuards.setHorizontalAlignment(SwingConstants.LEFT);

		viewServices.setFont(new Font("Arial", Font.PLAIN, 20));
		viewServices.setBackground(Color.WHITE);
		viewServices.setBorderPainted(false);
		viewServices.setHorizontalAlignment(SwingConstants.LEFT);

		viewFeeds.setFont(new Font("Arial", Font.PLAIN, 20));
		viewFeeds.setBackground(Color.WHITE);
		viewFeeds.setBorderPainted(false);
		viewFeeds.setHorizontalAlignment(SwingConstants.LEFT);

		viewFlights.setFont(new Font("Arial", Font.PLAIN, 20));
		viewFlights.setBackground(Color.WHITE);
		viewFlights.setBorderPainted(false);
		viewFlights.setHorizontalAlignment(SwingConstants.LEFT);

		viewEventLogs.setFont(new Font("Arial", Font.PLAIN, 20));
		viewEventLogs.setBackground(Color.WHITE);
		viewEventLogs.setBorderPainted(false);
		viewEventLogs.setHorizontalAlignment(SwingConstants.LEFT);

		viewPersonnel.setFont(new Font("Arial", Font.PLAIN, 20));
		viewPersonnel.setBackground(Color.WHITE);
		viewPersonnel.setBorderPainted(false);
		viewPersonnel.setHorizontalAlignment(SwingConstants.LEFT);

		viewLuggage.setFont(new Font("Arial", Font.PLAIN, 20));
		viewLuggage.setBackground(Color.WHITE);
		viewLuggage.setBorderPainted(false);
		viewLuggage.setHorizontalAlignment(SwingConstants.LEFT);

		viewPassengers.setFont(new Font("Arial", Font.PLAIN, 20));
		viewPassengers.setBackground(Color.WHITE);
		viewPassengers.setBorderPainted(false);
		viewPassengers.setHorizontalAlignment(SwingConstants.LEFT);
		
		logDelivery.setFont(new Font("Arial", Font.PLAIN, 20));
		logDelivery.setBackground(Color.WHITE);
		logDelivery.setBorderPainted(false);
		logDelivery.setHorizontalAlignment(SwingConstants.LEFT);

		logPersonnel.setFont(new Font("Arial", Font.PLAIN, 20));
		logPersonnel.setBackground(Color.WHITE);
		logPersonnel.setBorderPainted(false);
		logPersonnel.setHorizontalAlignment(SwingConstants.LEFT);

		logEvent.setFont(new Font("Arial", Font.PLAIN, 20));
		logEvent.setBackground(Color.WHITE);
		logEvent.setBorderPainted(false);
		logEvent.setHorizontalAlignment(SwingConstants.LEFT);

		logPassenger.setFont(new Font("Arial", Font.PLAIN, 20));
		logPassenger.setBackground(Color.WHITE);
		logPassenger.setBorderPainted(false);
		logPassenger.setHorizontalAlignment(SwingConstants.LEFT);

		logLuggage.setFont(new Font("Arial", Font.PLAIN, 20));
		logLuggage.setBackground(Color.WHITE);
		logLuggage.setBorderPainted(false);
		logLuggage.setHorizontalAlignment(SwingConstants.LEFT);

		JLabel viewLabel=new JLabel("View");
		viewLabel.setFont(new Font("Arial", Font.BOLD, 40));

		JLabel logLabel=new JLabel("Log");
		logLabel.setFont(new Font("Arial", Font.BOLD, 40));

		leftPanel.setLayout(new GridLayout(11,1));
		leftPanel.setBackground(Color.WHITE);
		leftPanel.add(viewLabel);
		leftPanel.add(viewFlights);
		leftPanel.add(viewPassengers);
		leftPanel.add(viewLuggage);
		leftPanel.add(viewPersonnel);
		leftPanel.add(viewGuards);
		leftPanel.add(viewFeeds);
		leftPanel.add(viewServices);
		leftPanel.add(viewDeliveries);
		leftPanel.add(viewLineTimes);
		leftPanel.add(viewEventLogs);

		rightPanel.setLayout(new GridLayout(11,1));
		rightPanel.setBackground(Color.WHITE);
		rightPanel.add(logLabel);
		rightPanel.add(logPassenger);
		rightPanel.add(logLuggage);
		rightPanel.add(logPersonnel);
		rightPanel.add(logDelivery);
		rightPanel.add(logEvent);

		main.add(leftPanel, BorderLayout.WEST);
		main.add(rightPanel, BorderLayout.EAST);


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