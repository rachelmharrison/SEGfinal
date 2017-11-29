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
		borderLayoutPanel=new JPanel();

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

		borderLayoutPanel.setLayout(new BorderLayout());
	//	borderLayoutPanel.add(top, BorderLayout.NORTH);
		borderLayoutPanel.add(main, BorderLayout.CENTER);
	//	borderLayoutPanel.add(bottom, BorderLayout.SOUTH);
		borderLayoutPanel.setBackground(Color.WHITE);
		main.setBackground(Color.WHITE);

		frame.setContentPane(borderLayoutPanel);
		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		currentPanel=main;
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(logOutButton))
		{
			main=new LogOnScreen(this);
			borderLayoutPanel.remove(top);
			borderLayoutPanel.remove(bottom);
			if(tracing)System.out.println("Success logOutButton");
		}

		if(e.getSource().equals(backButton))
		{
			try
			{
				main=(JPanel)prevScreens.pop();
			}
			catch(EmptyStackException ex)
			{

			}
		}

		if(e.getSource().equals(helpButton))
		{
			JOptionPane.showMessageDialog(null, "This Function has not been implemented", "Error", JOptionPane.ERROR_MESSAGE);
		}

		if(currentPanel.getClass().getName().equals("LogOnScreen")&&e.getSource().equals(currentPanel.accountButton))
		{
			//system.createAccount(currentPanel.usernameField.getText(), currentPanel.passwordField.getText());
			prevScreens.push(currentPanel);
			main=new CreateAccountScreen(this);
			currentPanel=main;
		}
	}
}