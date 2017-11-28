import javax.swing.*;
import java.awt.*;


public class SecurityScreen
{
	public static void main(String[] args)
	{
		new SecurityScreen();
	}

	SecurityScreen()
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
		ImageIcon feedIcon=new ImageIcon("images/cameraFeed.jpg");
		JLabel feedLabel=new JLabel(feedIcon);
		JLabel feedLabel2=new JLabel(feedIcon);
		JLabel feedLabel3=new JLabel(feedIcon);
		JLabel feedLabel4=new JLabel(feedIcon);
		JLabel feedLabel5=new JLabel(feedIcon);
		JLabel feedLabel6=new JLabel(feedIcon);

		JLabel locationLabel=new JLabel("(Location of Camera)", SwingConstants.CENTER);
		JLabel locationLabel2=new JLabel("(Location of Camera)", SwingConstants.CENTER);
		JLabel locationLabel3=new JLabel("(Location of Camera)", SwingConstants.CENTER);
		JLabel locationLabel4=new JLabel("(Location of Camera)", SwingConstants.CENTER);
		JLabel locationLabel5=new JLabel("(Location of Camera)", SwingConstants.CENTER);
		JLabel locationLabel6=new JLabel("(Location of Camera)", SwingConstants.CENTER);

		locationLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		locationLabel2.setFont(new Font("Arial", Font.PLAIN, 20));
		locationLabel3.setFont(new Font("Arial", Font.PLAIN, 20));
		locationLabel4.setFont(new Font("Arial", Font.PLAIN, 20));
		locationLabel5.setFont(new Font("Arial", Font.PLAIN, 20));
		locationLabel6.setFont(new Font("Arial", Font.PLAIN, 20));

		JButton alertButton = new JButton("REPORT EVENT");
		alertButton.setFont(new Font("Arial", Font.PLAIN, 40));
		alertButton.setBackground(Color.WHITE);
		alertButton.setForeground(Color.RED);
		alertButton.setBorderPainted(false);

		gbc.insets=new Insets(2,2,2,2);
		main.setLayout(new GridBagLayout());
		gbc.gridx=0;
		gbc.gridy=0;
		main.add(feedLabel,gbc);
		gbc.gridx=10;
		main.add(feedLabel2, gbc);
		gbc.gridx=20;
		main.add(feedLabel3, gbc);

		gbc.gridy=10;
		gbc.gridx=0;
		main.add(locationLabel,gbc);
		gbc.gridx=10;
		main.add(locationLabel2,gbc);
		gbc.gridx=20;
		main.add(locationLabel3,gbc);

		gbc.gridy=30;
		gbc.gridx=0;
		main.add(feedLabel4,gbc);
		gbc.gridx=10;
		main.add(feedLabel5,gbc);
		gbc.gridx=20;
		main.add(feedLabel6,gbc);
		
		gbc.gridy=40;
		gbc.gridx=0;
		main.add(locationLabel4,gbc);
		gbc.gridx=10;
		main.add(locationLabel5,gbc);
		gbc.gridx=20;
		main.add(locationLabel6,gbc);

		gbc.gridy=50;
		gbc.gridx=10;
		main.add(alertButton,gbc);
		main.setBackground(Color.WHITE);

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