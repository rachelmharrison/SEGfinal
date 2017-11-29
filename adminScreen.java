import javax.swing.*;
import java.awt.*;


public class adminScreen extends JPanel
{


	adminScreen()
	{
		
		JPanel leftPanel=new JPanel();
		JPanel rightPanel=new JPanel();
		JPanel centerPanel=new JPanel();

		this.setLayout(new BorderLayout());

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
		viewDeliveries.addActionListener(this);

		viewLineTimes.setFont(new Font("Arial", Font.PLAIN, 20));
		viewLineTimes.setBackground(Color.WHITE);
		viewLineTimes.setBorderPainted(false);
		viewLineTimes.setHorizontalAlignment(SwingConstants.LEFT);
		viewLineTimes.addActionListener(this);

		viewGuards.setFont(new Font("Arial", Font.PLAIN, 20));
		viewGuards.setBackground(Color.WHITE);
		viewGuards.setBorderPainted(false);
		viewGuards.setHorizontalAlignment(SwingConstants.LEFT);
		viewGuards..addActionListener(this);

		viewServices.setFont(new Font("Arial", Font.PLAIN, 20));
		viewServices.setBackground(Color.WHITE);
		viewServices.setBorderPainted(false);
		viewServices.setHorizontalAlignment(SwingConstants.LEFT);
		viewServices.addActionListener(this);

		viewFeeds.setFont(new Font("Arial", Font.PLAIN, 20));
		viewFeeds.setBackground(Color.WHITE);
		viewFeeds.setBorderPainted(false);
		viewFeeds.setHorizontalAlignment(SwingConstants.LEFT);
		viewFeeds.addActionListener(this);

		viewFlights.setFont(new Font("Arial", Font.PLAIN, 20));
		viewFlights.setBackground(Color.WHITE);
		viewFlights.setBorderPainted(false);
		viewFlights.setHorizontalAlignment(SwingConstants.LEFT);
		viewFlights.addActionListener(this);

		viewEventLogs.setFont(new Font("Arial", Font.PLAIN, 20));
		viewEventLogs.setBackground(Color.WHITE);
		viewEventLogs.setBorderPainted(false);
		viewEventLogs.setHorizontalAlignment(SwingConstants.LEFT);
		viewEventLogs.addActionListener(this);

		viewPersonnel.setFont(new Font("Arial", Font.PLAIN, 20));
		viewPersonnel.setBackground(Color.WHITE);
		viewPersonnel.setBorderPainted(false);
		viewPersonnel.setHorizontalAlignment(SwingConstants.LEFT);
		viewPersonnel              //HERE

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

		this.add(leftPanel, BorderLayout.WEST);
		this.add(rightPanel, BorderLayout.EAST);

	
	}
}