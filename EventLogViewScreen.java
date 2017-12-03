import javax.swing.*;
import java.awt.*;


public class EventLogViewScreen extends JPanel
{
	View view;
	Event event;
	EventLogViewScreen(Event event)
	{
		this.view=view;
		this.event=event;
		
		GridBagConstraints gbc=new GridBagConstraints();
		
		
		JLabel titleLabel=new JLabel("Event Log");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 80));

		JTextArea eventInfo=new JTextArea("\n\nDate: "+event.getDate()+"\nTime: "+event.getTime()+"\nEvent Category: "+event.getCategory()+"\nLocation(s): "+event.getLocation());
		eventInfo.setEditable(false);
		eventInfo.setFont(new Font("Arial", Font.PLAIN, 20));
		JTextArea description=new JTextArea("Description: "+event.getDescription());
		description.setFont(new Font("Arial", Font.PLAIN, 20));
		description.setEditable(false);
		description.setLineWrap(true);
		description.setWrapStyleWord(true);

		JTextArea guards=new JTextArea("Guard(s): ");
		Personnel[] p=event.getGuards();
		for (int i=0; i<p.length; i++)
		{
			guards.append("\n"+p[i].getName());
		}
		JPanel infoPanel=new JPanel();
		infoPanel.setLayout(new GridBagLayout());
		gbc.insets=new Insets(2,2,2,2);
		gbc.gridx=0;
		gbc.gridy=0;
		infoPanel.add(eventInfo, gbc);
		gbc.gridy=10;
		infoPanel.add(description, gbc);
		gbc.gridy=20;
		infoPanel.add(guards, gbc);

		this.setLayout(new BorderLayout());
		this.add(titleLabel,BorderLayout.NORTH);
		this.add(infoPanel,BorderLayout.CENTER);

	}
}