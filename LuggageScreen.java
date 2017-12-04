import javax.swing.*;
import java.awt.*;


public class LuggageScreen extends JPanel
{
	View view;

	LuggageScreen(View view)
	{
		this.view=view;
		JLabel weightLabel=new JLabel("16.56 kg");
		weightLabel.setForeground(Color.GREEN);
		weightLabel.setFont(new Font("Arial", Font.PLAIN, 200));
		GridBagConstraints gbc=new GridBagConstraints();
		JTextArea passengerLabel=new JTextArea("Passenger Name: (name)\nLuggage Allowance: (luggage allowance)\nFlight: (flight number and time)\nDestination: (airport code)");
		passengerLabel.setEditable(false);
		passengerLabel.setFont(new Font("Arial", Font.PLAIN, 40));

		JLabel destinationLabel=new JLabel("YYZ");
		destinationLabel.setFont(new Font("Arial", Font.BOLD, 80));

		JButton printButton=new JButton("Print Luggage Tag");
		printButton.setFont(new Font("Arial", Font.BOLD, 80));
		printButton.setBackground(Color.WHITE);
		printButton.setBorderPainted(false);

		this.setLayout(new BorderLayout());
		gbc.insets=new Insets(2,2,2,2);

		gbc.gridx=0;
		gbc.gridy=0;
		this.add(weightLabel, BorderLayout.NORTH);
		gbc.gridy=10;
		this.add(passengerLabel, BorderLayout.CENTER);
		gbc.gridx=10;
	//	main.add(destinationLabel,BorderLayout.CENTER);
		gbc.gridy=20;
		gbc.gridx=0;
		this.add(printButton,BorderLayout.SOUTH);

		this.setBackground(Color.WHITE);

	}
}