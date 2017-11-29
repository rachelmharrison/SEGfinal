import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogOnScreen extends JPanel
{
	JButton logInButton=new JButton("Log In");
	JButton accountButton=new JButton("Create an Account");
	View view;

	LogOnScreen(View view)
	{
		this.view=view;
		JLabel usernameLabel=new JLabel("Username: ");
		JLabel passwordLabel=new JLabel("Password: ");
		JTextField usernameField=new JTextField();
		JPasswordField passwordField=new JPasswordField();

		usernameField.setColumns(10);
		passwordField.setColumns(10);

	//	usernameField.setPreferredSize(new Dimension(30, 5));


		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		usernameField.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordField.setFont(new Font("Arial", Font.PLAIN, 30));

		logInButton.setFont(new Font("Arial", Font.PLAIN, 30));
		logInButton.setBorderPainted(false);
		logInButton.setBackground(Color.WHITE);

		accountButton.setFont(new Font("Arial", Font.PLAIN, 30));
		accountButton.setBorderPainted(false);
		accountButton.setBackground(Color.WHITE);

		accountButton.addActionListener(view);
		logInButton.addActionListener(view);

		
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.insets=new Insets(2,2,2,2);

		gbc.gridx=0;
		gbc.gridy=0;
		this.add(usernameLabel, gbc);
		gbc.gridx=10;
		this.add(usernameField, gbc);
		gbc.gridy=10;
		this.add(passwordField, gbc);
		gbc.gridx=0;
		this.add(passwordLabel, gbc);
		gbc.gridx=30;
		this.add(logInButton, gbc);
		gbc.gridx=10;
		gbc.gridy=30;
		this.add(accountButton, gbc);
	}
}