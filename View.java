import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View implements ActionListener
{
	MainClass system;
	NodeStack prevScreens=new NodeStack(); //sets up back feature
	JPanel currentPanel;
	JButton helpButton;
	JButton logOutButton;
	JButton backButton;
	JPanel top;
	JPanel main;
	JPanel bottom;
	JFrame frame;
	JPanel borderLayoutPanel;
	boolean tracing=true;

	View(MainClass system)
	{
		this.system=system;

		setUpScreen();


	}

	private void setUpScreen()
	{
		frame=new JFrame("Airport Manager");
		top=new JPanel();
		main=new LogOnScreen(this);
		bottom=new JPanel();
		//borderLayoutPanel=new JPanel();

		JLabel employeeLabel=new JLabel("Welcome: (name of logged in user)");
		logOutButton=new JButton("Log Out");
		backButton=new JButton("Back");
		helpButton=new JButton("Help");

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

		logOutButton.addActionListener(this);
		backButton.addActionListener(this);
		helpButton.addActionListener(this);

		top.setBackground(Color.WHITE);
		top.setLayout(new BorderLayout());
		top.add(employeeLabel, BorderLayout.WEST);
		top.add(logOutButton, BorderLayout.	EAST);

		bottom.setBackground(Color.WHITE);
		bottom.setLayout(new BorderLayout());
		bottom.add(backButton, BorderLayout.WEST);
		bottom.add(helpButton, BorderLayout.	EAST);

		frame.setLayout(new BorderLayout());
	//	borderLayoutPanel.add(top, BorderLayout.NORTH);
		frame.add(main, BorderLayout.CENTER);
	//	borderLayoutPanel.add(bottom, BorderLayout.SOUTH);
		frame.setBackground(Color.WHITE);
		main.setBackground(Color.WHITE);

		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		currentPanel=main;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(logOutButton))
		{

			while(prevScreens.isEmpty()!=true)
			{
				prevScreens.pop();
			}
			changeScreen(new LogOnScreen(this), false);
			
			if(tracing)System.out.println("Success logOutButton");
		}

		if(e.getSource().equals(backButton))
		{
			try
			{
				changeScreen((JPanel)prevScreens.pop(), true);

			}
			catch(EmptyStackException ex)
			{

			}
		}

		if(e.getSource().equals(helpButton))
		{
			JOptionPane.showMessageDialog(null, "This Function has not been implemented", "Error", JOptionPane.ERROR_MESSAGE);
		}

		if(currentPanel.getClass().getName().equals("LogOnScreen"))
		{
			LogOnScreen c=(LogOnScreen)currentPanel;
			if(e.getSource().equals(c.accountButton))
			{
				prevScreens.push(currentPanel);
				changeScreen(new CreateAccountScreen(this), true);
	
				if(tracing)System.out.println("Create Account Screen would appear");
			}

			if(e.getSource().equals(c.logOnButton))
			{
				
			}
		}

		if(currentPanel.getClass().getName().equals("CreateAccountScreen"))
		{
			CreateAccountScreen c=(CreateAccountScreen)currentPanel;
			if(e.getSource().equals(c.confirmButton))
			{
				prevScreens.push(currentPanel);

				String username=c.usernameField.getText();
				String password1=c.passwordField1.getPassword().toString();
				String password2=c.passwordField2.getPassword().toString();
				String name=c.nameField.getText();
				String role=(String)c.roleBox.getSelectedItem();
				String dob=c.dobField.getText();
				char gender=((String)c.genderBox.getSelectedItem()).charAt(0);
				String email=c.emailField.getText();

				boolean valid=true;

				//test for username in system
				if(system.checkForUsername(username))
					valid=false;
				if(system.checkForEmail(email))
					valid=false;

				if(password1!=password2)
					valid=false;

				if(username==""||password1.length()<8||name==""||email=="")
					valid=false;

				//add code that validates birthday here (set valid to false)

				if(valid==false)
					JOptionPane.showMessageDialog(null, "There is an error in one or more fields or account has already been created.", "Error", JOptionPane.ERROR_MESSAGE);

				if(valid)
				{
					changeScreen(new CreateAccountScreen(this), true);
					system.createAccount(username, password1, name, role, dob, gender, email);
				}
	
				if(tracing)System.out.println("Create Account Screen would appear");
			}
		}

	}

	public void changeScreen(JPanel panel, boolean border)
	{
		frame.remove(currentPanel);
		frame.remove(top);
		frame.remove(bottom);
		frame.add(panel, BorderLayout.CENTER);

		if(border)
		{
			frame.add(top, BorderLayout.NORTH);
			frame.add(bottom, BorderLayout.SOUTH);
		}

		frame.repaint();
		frame.revalidate();

		currentPanel=panel;
	}
}