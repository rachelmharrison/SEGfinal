import javax.swing.*;
import java.awt.*;


public class adminScreen extends JPanel
{

		JButton viewPassengers;
		JButton viewLuggage;
		JButton viewPersonnel;
		JButton viewEventLogs;
		JButton viewFlights;
		JButton viewFeeds;
		JButton viewServices;
		JButton viewGuards;
		JButton viewDeliveries;
		JButton viewLineTimes;

		JButton logLuggage;
		JButton logPassenger;
		JButton logEvent;
		JButton logPersonnel;
		JButton logDelivery;

		View view;

	adminScreen(View view)
	{
		
		JPanel leftPanel=new JPanel();
		JPanel rightPanel=new JPanel();
		JPanel centerPanel=new JPanel();

		this.setLayout(new BorderLayout());
		this.view=view;

		viewPassengers=new JButton("Passengers");
		viewLuggage=new JButton("Luggage");
		viewPersonnel=new JButton("Personnel");
		viewEventLogs=new JButton("Event Logs");
		viewFlights=new JButton("Flights");
		viewFeeds=new JButton("Camera Feeds");
		viewServices=new JButton("Services and Shops");
		viewGuards=new JButton("Security Guard Locations");
		viewDeliveries=new JButton("Deliveries");
		viewLineTimes=new JButton("Line Wait Times");

		logLuggage=new JButton("Scan Luggage");
		logPassenger=new JButton("Scan Ticket");
		logEvent=new JButton("Log Event");
		logPersonnel=new JButton("Check In/Out Employee");
		logDelivery=new JButton("Scan Delivery");

		
		viewDeliveries.setFont(new Font("Arial", Font.PLAIN, 20));
		viewDeliveries.setBackground(Color.WHITE);
		viewDeliveries.setBorderPainted(false);
		viewDeliveries.setHorizontalAlignment(SwingConstants.LEFT);
		viewDeliveries.addActionListener(view);

		viewLineTimes.setFont(new Font("Arial", Font.PLAIN, 20));
		viewLineTimes.setBackground(Color.WHITE);
		viewLineTimes.setBorderPainted(false);
		viewLineTimes.setHorizontalAlignment(SwingConstants.LEFT);
		viewLineTimes.addActionListener(view);

		viewGuards.setFont(new Font("Arial", Font.PLAIN, 20));
		viewGuards.setBackground(Color.WHITE);
		viewGuards.setBorderPainted(false);
		viewGuards.setHorizontalAlignment(SwingConstants.LEFT);
		viewGuards.addActionListener(view);

		viewServices.setFont(new Font("Arial", Font.PLAIN, 20));
		viewServices.setBackground(Color.WHITE);
		viewServices.setBorderPainted(false);
		viewServices.setHorizontalAlignment(SwingConstants.LEFT);
		viewServices.addActionListener(view);

		viewFeeds.setFont(new Font("Arial", Font.PLAIN, 20));
		viewFeeds.setBackground(Color.WHITE);
		viewFeeds.setBorderPainted(false);
		viewFeeds.setHorizontalAlignment(SwingConstants.LEFT);
		viewFeeds.addActionListener(view);

		viewFlights.setFont(new Font("Arial", Font.PLAIN, 20));
		viewFlights.setBackground(Color.WHITE);
		viewFlights.setBorderPainted(false);
		viewFlights.setHorizontalAlignment(SwingConstants.LEFT);
		viewFlights.addActionListener(view);

		viewEventLogs.setFont(new Font("Arial", Font.PLAIN, 20));
		viewEventLogs.setBackground(Color.WHITE);
		viewEventLogs.setBorderPainted(false);
		viewEventLogs.setHorizontalAlignment(SwingConstants.LEFT);
		viewEventLogs.addActionListener(view);

		viewPersonnel.setFont(new Font("Arial", Font.PLAIN, 20));
		viewPersonnel.setBackground(Color.WHITE);
		viewPersonnel.setBorderPainted(false);
		viewPersonnel.setHorizontalAlignment(SwingConstants.LEFT);
		viewPersonnel.addActionListener(view);

		viewLuggage.setFont(new Font("Arial", Font.PLAIN, 20));
		viewLuggage.setBackground(Color.WHITE);
		viewLuggage.setBorderPainted(false);
		viewLuggage.setHorizontalAlignment(SwingConstants.LEFT);
		viewLuggage.addActionListener(view);

		viewPassengers.setFont(new Font("Arial", Font.PLAIN, 20));
		viewPassengers.setBackground(Color.WHITE);
		viewPassengers.setBorderPainted(false);
		viewPassengers.setHorizontalAlignment(SwingConstants.LEFT);
		viewPassengers.addActionListener(view);
		
		logDelivery.setFont(new Font("Arial", Font.PLAIN, 20));
		logDelivery.setBackground(Color.WHITE);
		logDelivery.setBorderPainted(false);
		logDelivery.setHorizontalAlignment(SwingConstants.LEFT);
		logDelivery.addActionListener(view);

		logPersonnel.setFont(new Font("Arial", Font.PLAIN, 20));
		logPersonnel.setBackground(Color.WHITE);
		logPersonnel.setBorderPainted(false);
		logPersonnel.setHorizontalAlignment(SwingConstants.LEFT);
		logPersonnel.addActionListener(view);

		logEvent.setFont(new Font("Arial", Font.PLAIN, 20));
		logEvent.setBackground(Color.WHITE);
		logEvent.setBorderPainted(false);
		logEvent.setHorizontalAlignment(SwingConstants.LEFT);
		logEvent.addActionListener(view);

		logPassenger.setFont(new Font("Arial", Font.PLAIN, 20));
		logPassenger.setBackground(Color.WHITE);
		logPassenger.setBorderPainted(false);
		logPassenger.setHorizontalAlignment(SwingConstants.LEFT);
		logPassenger.addActionListener(view);

		logLuggage.setFont(new Font("Arial", Font.PLAIN, 20));
		logLuggage.setBackground(Color.WHITE);
		logLuggage.setBorderPainted(false);
		logLuggage.setHorizontalAlignment(SwingConstants.LEFT);
		logLuggage.addActionListener(view);

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