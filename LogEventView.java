import java.util.Calendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class LogEventView extends JPanel
{
	//Event event;
	View view;
	JButton saveButton;
	JComboBox categoryBox;
	JTextField locationField;
	JTextArea descriptionField;
	JTextField guardField;
	JLabel dateField;

	LogEventView(View view)

	{
		JLabel title=new JLabel("Log New Event");
		JLabel dateLabel=new JLabel("Date: ");
		JLabel timeLabel=new JLabel("Time: ");
		JLabel categoryLabel=new JLabel("Category: ");
		JLabel locationLabel=new JLabel("Location: ");
		JLabel descriptionLabel=new JLabel("Description: ");
		JLabel guardLabel=new JLabel("Logged by: ");

		title.setFont(new Font("Arial", Font.BOLD, 40));
		dateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		categoryLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		locationLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		guardLabel.setFont(new Font("Arial", Font.PLAIN, 20));

		saveButton=new JButton("Save Event Log");
		saveButton.setFont(new Font("Arial", Font.BOLD, 20));
		saveButton.setBackground(Color.WHITE);
		saveButton.setBorderPainted(false);
		saveButton.addActionListener(view);

		categoryBox=new JComboBox(new String[]{"Normal","Warning","Failure","Catastrophic"});
		categoryBox.setBackground(Color.WHITE);
		categoryBox.setFont(new Font("Arial", Font.PLAIN, 20));

		locationField=new JTextField();
		descriptionField=new JTextArea();
		guardField=new JTextField();

		locationField.setFont(new Font("Arial", Font.PLAIN, 20));
		descriptionField.setFont(new Font("Arial", Font.PLAIN, 20));
		guardField.setFont(new Font("Arial", Font.PLAIN, 20));

		descriptionField.setLineWrap(true);
		descriptionField.setWrapStyleWord(true);

		locationField.setColumns(20);
		guardField.setColumns(20);
		descriptionField.setColumns(20);
		descriptionField.setRows(20);

		descriptionField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		dateField=new JLabel(dateFormat.format(date));
		JLabel timeField=new JLabel(Calendar.getInstance().getTime().toString());

		timeField.setFont(new Font("Arial", Font.PLAIN, 20));
		dateField.setFont(new Font("Arial", Font.PLAIN, 20));
		this.setBackground(Color.WHITE);
		GridBagConstraints gbc=new GridBagConstraints();
		this.setLayout(new GridBagLayout());

		gbc.insets=new Insets(2,2,2,2);
		gbc.gridx=0;
		gbc.gridy=0;
		this.add(title, gbc);
		gbc.gridy=10;
		this.add(dateLabel, gbc);
		gbc.gridy=20;
	//	this.add(timeLabel, gbc);
		gbc.gridy=30;
		this.add(categoryLabel, gbc);
		gbc.gridy=40;
		this.add(locationLabel, gbc);
		gbc.gridy=50;
		this.add(descriptionLabel, gbc);
		gbc.gridy=60;
		this.add(guardLabel, gbc);
		gbc.gridx=10;
		gbc.gridy=0;

		
	//	this.add(title, gbc);
		gbc.gridy=10;
		this.add(dateField, gbc);
		gbc.gridy=20;
	//	this.add(timeField, gbc);
		gbc.gridy=30;
		this.add(categoryBox, gbc);
		gbc.gridy=40;
		this.add(locationField, gbc);
		gbc.gridy=50;
		this.add(descriptionField, gbc);
		gbc.gridy=60;
		this.add(guardField, gbc);
		gbc.gridy=70;
		this.add(saveButton, gbc);



	}
}