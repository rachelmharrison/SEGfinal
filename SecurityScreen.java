import javax.swing.*;
import java.awt.*;


public class SecurityScreen
{

	SecurityScreen()
	{
		
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
		this.setLayout(new GridBagLayout());
		gbc.gridx=0;
		gbc.gridy=0;
		this.add(feedLabel,gbc);
		gbc.gridx=10;
		this.add(feedLabel2, gbc);
		gbc.gridx=20;
		this.add(feedLabel3, gbc);

		gbc.gridy=10;
		gbc.gridx=0;
		this.add(locationLabel,gbc);
		gbc.gridx=10;
		this.add(locationLabel2,gbc);
		gbc.gridx=20;
		this.add(locationLabel3,gbc);

		gbc.gridy=30;
		gbc.gridx=0;
		this.add(feedLabel4,gbc);
		gbc.gridx=10;
		this.add(feedLabel5,gbc);
		gbc.gridx=20;
		this.add(feedLabel6,gbc);
		
		gbc.gridy=40;
		gbc.gridx=0;
		this.add(locationLabel4,gbc);
		gbc.gridx=10;
		this.add(locationLabel5,gbc);
		gbc.gridx=20;
		this.add(locationLabel6,gbc);

		gbc.gridy=50;
		gbc.gridx=10;
		this.add(alertButton,gbc);
		this.setBackground(Color.WHITE);

	}
}