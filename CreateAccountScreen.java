import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateAccountScreen extends JPanel
{
	JTextField usernameField;
	JPasswordField passwordField1;
	JPasswordField passwordField2;
	JTextField nameField;
	JComboBox roleBox;
	JComboBox genderBox;
	JTextField dobField;
	JButton confirmButton;
	JTextField emailField;
	View view;


	CreateAccountScreen(View view)
	{
		this.view=view;

		confirmButton=new JButton("Create Account");
		confirmButton.setFont(new Font("Arial", Font.BOLD, 30));
		confirmButton.setBorderPainted(false);
		confirmButton.setBackground(Color.WHITE);
		confirmButton.addActionListener(view);

		JLabel usernameLabel=new JLabel("Username: ");
		JLabel passwordLabel1=new JLabel("Password: ");
		JLabel passwordLabel2=new JLabel("Confirm Password: ");
		JLabel nameLabel=new JLabel("Name: ");
		JLabel roleLabel=new JLabel("Type of Account: ");
		JLabel genderLabel=new JLabel("Gender (if passenger): ");
		JLabel dobLabel=new JLabel("Date of Birth YYYY/MM/DD (if passenger): ");
		JLabel emailLabel=new JLabel("Email Address: ");
		usernameField=new JTextField();
		passwordField1=new JPasswordField();
		passwordField2=new JPasswordField();
		nameField=new JTextField();
		roleBox=new JComboBox(new String[]{"Passenger","Employee","Admin"});
		genderBox=new JComboBox(new String[]{"F","M"});
		dobField=new JTextField();
		emailField=new JTextField();


		usernameField.setColumns(10);
		passwordField1.setColumns(10);
		passwordField2.setColumns(10);
		nameField.setColumns(10);
		dobField.setColumns(10);
		emailField.setColumns(10);
	
		roleBox.setBackground(Color.WHITE);
		genderBox.setBackground(Color.WHITE);

		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordLabel1.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordLabel2.setFont(new Font("Arial", Font.PLAIN, 30));
		nameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		roleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		genderLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		dobLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		emailLabel.setFont(new Font("Arial", Font.PLAIN, 30));

		usernameField.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordField1.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordField2.setFont(new Font("Arial", Font.PLAIN, 30));
		nameField.setFont(new Font("Arial", Font.PLAIN, 30));
		roleBox.setFont(new Font("Arial", Font.PLAIN, 30));
		genderBox.setFont(new Font("Arial", Font.PLAIN, 30));
		dobField.setFont(new Font("Arial", Font.PLAIN, 30));
		emailField.setFont(new Font("Arial", Font.PLAIN, 30));

		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.insets=new Insets(2,2,2,2);

		gbc.gridx=0;
		gbc.gridy=0;
		this.add(usernameLabel, gbc);
		gbc.gridy=10;
		this.add(passwordLabel1, gbc);
		gbc.gridy=20;
		this.add(passwordLabel2, gbc);
		gbc.gridy=30;
		this.add(nameLabel, gbc);
		gbc.gridy=35;
		this.add(emailLabel, gbc);
		gbc.gridy=40;
		this.add(roleLabel, gbc);
		gbc.gridy=50;
		this.add(dobLabel, gbc);
		gbc.gridy=60;
		this.add(genderLabel, gbc);
		

		gbc.gridx=10;
		gbc.gridy=0;
		this.add(usernameField, gbc);
		gbc.gridy=10;
		this.add(passwordField1, gbc);
		gbc.gridy=20;
		this.add(passwordField1, gbc);
		gbc.gridy=30;
		this.add(nameField, gbc);
		gbc.gridy=75;
		this.add(emailField, gbc);
		gbc.gridy=40;
		this.add(roleBox, gbc);
		gbc.gridy=50;
		this.add(dobField, gbc);
		gbc.gridy=60;
		this.add(genderBox, gbc);
		gbc.gridy=80;
		this.add(confirmButton, gbc);

		this.setBackground(Color.WHITE);


	}
}