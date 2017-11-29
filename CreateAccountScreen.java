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


	CreateAccountScreen(View view)
	{
		this.view=view;
		JLabel usernameLabel=new JLabel("Username: ");
		JLabel passwordLabel1=new JLabel("Password: ");
		JLabel passwordLabel2=new JLabel("Confirm Password: ");
		JLabel nameLabel=new JLabel("Name: ");
		JLabel roleLabel=new JLabel("Type of Account: ");
		JLabel genderLabel=new JLabel("Gender (if passenger): ");
		JLabel dobLabel=new Jlabel("Date of Birth YYYY/MM/DD (if passenger): ");

		usernameField=new JTextField()


		usernameField.setColumns(10);
		passwordField1.setColumns(10);
		passwordField2.setColumns(10);
		nameField.setColumns(10);
		dobField.setColumns(10);
	


		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		usernameField.setFont(new Font("Arial", Font.PLAIN, 30));
		passwordField.setFont(new Font("Arial", Font.PLAIN, 30));
	}
}