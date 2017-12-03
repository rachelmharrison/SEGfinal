import javax.swing.*;
import java.awt.*;


public class FlightScreen extends JPanel
{

	Flight flight;
	View view;

	FlightScreen(Flight flight, View view)
	{
		
		this.flight=flight;
		this.view=view;
		GridBagConstraints gbc=new GridBagConstraints();
		
		JPanel buttonPanel1=new JPanel();
		JPanel buttonPanel2=new JPanel();
		JPanel flightPanel=new JPanel();
		JPanel numberPanel=new JPanel();
		JPanel bigButtonPanel=new JPanel();

		buttonPanel2.setBackground(Color.WHITE);
		buttonPanel1.setBackground(Color.WHITE);
		numberPanel.setBackground(Color.WHITE);

		
		JLabel tripLabel=new JLabel(flight.getOrigin()+"-"+flight.getDestination());
		tripLabel.setFont(new Font("Arial", Font.BOLD, 100));

		ImageIcon airlineIcon=new ImageIcon("images/ac.png");
		JLabel logoLabel=new JLabel();

		JLabel numberLabel=new JLabel(flight.getAirlineIdNumber());
		numberLabel.setFont(new Font("Arial",Font.PLAIN,100));

		JLabel timeLabel=new JLabel(flight.getDate()+" "+flight.getTime());
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JLabel statusLabel=new JLabel(flight.getStatus());
		if(flight.getStatus().equalsIgnoreCase("On Time"))
			statusLabel.setForeground(Color.GREEN);
		else
			statusLabel.setForeground(Color.RED);
		statusLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JTextArea connectingLabel=new JTextArea();
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
		this.add(tripLabel);
		gbc.gridy=10;
		numberPanel.add(logoLabel);
		gbc.gridx=5;
		numberPanel.add(numberLabel);
		numberPanel.add(timeLabel);
		this.add(numberPanel);
		gbc.gridx=0;
		gbc.gridy=20;
		this.add(connectingLabel);
		gbc.gridy=30;
		buttonPanel1.add(foodButton);
		gbc.gridx=10;
		buttonPanel1.add(luggageButton);
		gbc.gridy=40;
		buttonPanel2.add(planeButton);
		gbc.gridx=0;
		buttonPanel2.add(passengerButton);
		this.add(buttonPanel1);
		this.add(buttonPanel2);

		this.setBackground(Color.WHITE);
	}
}