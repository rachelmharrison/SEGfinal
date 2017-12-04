import javax.swing.*;
import java.awt.*;


public class TicketScreen extends JPanel
{
	View view;
	TicketScreen(View view)
	{
		this.view=view;
		GridBagConstraints gbc=new GridBagConstraints();
	
		
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

		this.add(flightPanel);
		this.add(passengerLabel);

		ImageIcon check=new ImageIcon("images/check.jpg");
		JLabel checkLabel=new JLabel(check);
		this.add(checkLabel);

		this.setBackground(Color.WHITE);

	}
}