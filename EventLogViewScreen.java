import javax.swing.*;
import java.awt.*;


public class EventLogViewScreen extends JPanel
{
	View view;
	EventLogViewScreen(View view)
	{
		this.view=view;
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		
		JLabel titleLabel=new JLabel("Event Log ####");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 80));

		JTextArea eventInfo=new JTextArea("\n\nDate: (date)\nTime: (time)\nEvent Category: (category)\nLocation(s): (location)\nDescription: (multi-line Description)\n\n\n\n\n\n\nGuards Present: (list of guards)\nLogged by: (guard's name)");
		eventInfo.setEditable(false);
		eventInfo.setFont(new Font("Arial", Font.PLAIN, 20));

		this.setLayout(new BorderLayout());
		this.add(titleLabel,BorderLayout.NORTH);
		this.add(eventInfo,BorderLayout.CENTER);

	}
}