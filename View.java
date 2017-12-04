
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

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
	JLabel employeeLabel;

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

		employeeLabel=new JLabel("Welcome: (name of logged in user)");
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
		main.setBackground(Color.WHITE);
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

			if(e.getSource().equals(c.logInButton))
			{
				boolean valid=system.validateUser(c.usernameField.getText(), c.passwordField.getPassword());
				if(tracing)System.out.println(valid);
			//	boolean valid=true;
				if(valid==false)
					JOptionPane.showMessageDialog(null, "There is an error in the username or password.", "Error", JOptionPane.ERROR_MESSAGE);
				if(valid)
				{
					String role=system.getCurrentAccountType();
					if(tracing)System.out.println(role);
					if(role=="Passenger")
					{
						JOptionPane.showMessageDialog(null, "This function has not been implemented. Please log in with an admin account", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(role=="Employee")
					{
						//JOptionPane.showMessageDialog(null, "This function has not been implemented. Please log in with an admin account", "Error", JOptionPane.ERROR_MESSAGE);
					}
					if(role=="admin")
					{
						employeeLabel.setText("Welcome: "+system.getCurrentUserName());
						changeScreen(new adminScreen(this), true);
					}

		
				}
			
			}
		}

		if(currentPanel.getClass().getName().equals("CreateAccountScreen"))
		{
			CreateAccountScreen c=(CreateAccountScreen)currentPanel;
			if(e.getSource().equals(c.confirmButton))
			{
				if(tracing)System.out.println("method is running");
				prevScreens.push(currentPanel);

				String username=c.usernameField.getText();
				String password1=c.passwordField1.getText();
				String password2=c.passwordField2.getText();
				String name=c.nameField.getText();
				String role=(String)c.roleBox.getSelectedItem();
				String dob=c.dobField.getText();
				char gender=((String)c.genderBox.getSelectedItem()).charAt(0);
				String email=c.emailField.getText();

				boolean valid=true;

				//test for username in system
				if(system.checkForUsername(username))
					valid=false;
				if(tracing)System.out.println(valid);
				if(system.checkForEmail(email))
					valid=false;
				if(tracing)System.out.println(valid);
				if(tracing)System.out.println("1: "+password1+" 2: "+password2);
				if(password1.equals(password2)==false)
					valid=false;
				if(tracing)System.out.println(valid);
				if(tracing)System.out.println("Working up until the code Alan wrote");

				if(username==""||password1.length()<8||name==""||email=="")
					valid=false;
				//Here I am writing my code - Doyle
				/*for (int x=0; x<dob.length(); x++){
					//making sure numbers are in an appropriate order
					if(x==0){//first digit of year, has to be either 1 or 2 since im going from 1900-2017
						if(dob.charAt(x)!='1'||dob.charAt(x)!='2'){
							valid=false;
						}
					}
					if(x==1){//see above reasoning
						if(dob.charAt(x)!='9'||dob.charAt(x)!='0'){
							valid=false;
						}
					}
					if(x==5){//first number for month, has to be 0 or 1
						if(dob.charAt(x)!='0'||dob.charAt(x)!='1'){
							valid=false;
						}
					}
					if(x==8){//first number for day has to be 0-3
						if(dob.charAt(x)!='0'||dob.charAt(x)!='1'||dob.charAt(x)!='2'||dob.charAt(x)!='3'){
							valid=false;
						}
					}
				}
				//making strings to store individual datas to see if they valid
				String dayy = "";
				dayy+=dob.charAt(8);
				dayy+=dob.charAt(9);
				int day = Integer.parseInt(dayy);
				String yearr = "";
				yearr+=dob.charAt(0);
				yearr+=dob.charAt(1);
				yearr+=dob.charAt(2);
				yearr+=dob.charAt(3);
				int year = Integer.parseInt(yearr);
				String monthh = "";
				monthh+=dob.charAt(5);
				monthh+=dob.charAt(6);
				int month = Integer.parseInt(monthh);
				//making sure numbers are valid i.e not feb 31 etc
				if(month>12){//there's only 12 months
					valid=false;
				}
				if (year>2017 || year<1900){//can't be a future birthday
					valid=false;
				}
				if (day>31){//no months have more than 31 days, so don't need to check months with 31 days
					valid=false;
				}
				if(monthh=="02"){//only feb has 28 days
					if(day>28){
						valid = false;
					}
				}
				if(monthh!="04"||monthh!="06"||monthh!="09"||monthh!="11"){//apr, jun, sep, nov all have 30 days
					if(day>30){
						valid = false;
					}
				}*/
				//add code that validates birthday here (set valid to false)

				if(valid==false)
					JOptionPane.showMessageDialog(null, "There is an error in one or more fields or account has already been created.", "Error", JOptionPane.ERROR_MESSAGE);

				if(valid)
				{
					system.createAccount(username, password1, name, role, dob, gender, email);
					changeScreen(new LogOnScreen(this), true);
					
				}
	
				if(tracing)System.out.println("reached end");
			}
		}

			if(currentPanel.getClass().getName().equals("adminScreen"))
			{
				adminScreen c=(adminScreen)currentPanel;

				if(e.getSource().equals(c.viewPassengers))
				{
					prevScreens.push(currentPanel);
					ViewPassengersScreen s=new ViewPassengersScreen(this);
					changeScreen(s, true);
					s.updateResults(system.passengersToString());

				}
				if(e.getSource().equals(c.viewLuggage))
				{
					prevScreens.push(currentPanel);
					ViewLuggageScreen s=new ViewLuggageScreen(this);
					changeScreen(s, true);
					s.updateResults(system.luggageToString());
				}
				if(e.getSource().equals(c.viewPersonnel))
				{
					prevScreens.push(currentPanel);
					ViewPersonnelScreen s=new ViewPersonnelScreen(this);
					changeScreen(s, true);
					s.updateResults(system.personnelToString());
				}
				if(e.getSource().equals(c.viewEventLogs))
				{
					prevScreens.push(currentPanel);
					ViewEventLogsScreen s=new ViewEventLogsScreen(this);
					changeScreen(s, true);
					s.updateResults(system.eventsToString());
				}
				if(e.getSource().equals(c.viewFlights))
				{
					prevScreens.push(currentPanel);
					ViewFlightsScreen s=new ViewFlightsScreen(this);
					changeScreen(s, true);
					s.updateResults(system.flightsToString());
					if(tracing)System.out.println("All good so far");
				}
				if(e.getSource().equals(c.viewFeeds))
				{
					prevScreens.push(currentPanel);
					changeScreen(new SecurityScreen(this), true);
				}
				if(e.getSource().equals(c.viewServices))
				{
					prevScreens.push(currentPanel);
					VIewServicesScreen s=new VIewServicesScreen(this);
					changeScreen(s, true);
					s.updateResults(system.servicesToString());
				}
				if(e.getSource().equals(c.viewDeliveries))
				{
					prevScreens.push(currentPanel);
					ViewDeliveriesScreen s=new ViewDeliveriesScreen(this);
					changeScreen(s, true);
					s.updateResults(system.deliveriesToString());
				}
				if(e.getSource().equals(c.viewLineTimes))
				{
					prevScreens.push(currentPanel);
					ViewLineTimesScreen s=new ViewLineTimesScreen(this);
					changeScreen(s, true);
					s.updateResults(system.waitLinesToString());
				}
				if(e.getSource().equals(c.logLuggage))
				{
					prevScreens.push(currentPanel);
					changeScreen(new LuggageScreen(this), true);
				}
				if(e.getSource().equals(c.logPassenger))
				{
					prevScreens.push(currentPanel);
					changeScreen(new TicketScreen(this), true);
				}
				if(e.getSource().equals(c.logEvent))
				{
					
					prevScreens.push(currentPanel);
					changeScreen(new LogEventView(this), true);
				}
				if(e.getSource().equals(c.logPersonnel))
				{
					String inputValue = JOptionPane.showInputDialog("Please input the name of the employee");
					Personnel p=system.findEmployee(inputValue);
					if(p==null)
						JOptionPane.showMessageDialog(null, "This employee does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
					else
					{
						prevScreens.push(currentPanel);
						changeScreen(new clockInOutScreen(this, p), true);
					}
					
				}
				if(e.getSource().equals(c.logDelivery))
				{
					//prevScreens.push(currentPanel);
					//changeScreen(new LogDeliveryScreen(this), true);
					//RACHEL DO THIS
				}
			}

			if(currentPanel.getClass().getName().equals("ViewPassengersScreen"))
			{
				ViewPassengersScreen c=(ViewPassengersScreen)currentPanel;
				if(e.getSource().equals(c.searchButton))
				{
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					//make this screen maybe


				}
			}
			if(currentPanel.getClass().getName().equals("ViewLuggageScreen"))
			{
				ViewLuggageScreen c=(ViewLuggageScreen)currentPanel;
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					//MAKE THIS SCREEN MAYBE
				}
			}
			if(currentPanel.getClass().getName().equals("ViewPersonnelScreen"))
			{
				ViewPersonnelScreen c=(ViewPersonnelScreen)currentPanel;
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else{
					//MAKE THIS SCREEN MAYBE
				}
			}
			if(currentPanel.getClass().getName().equals("ViewEventLogsScreen"))
			{
				ViewEventLogsScreen c=(ViewEventLogsScreen)currentPanel;
				
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else if(e.getActionCommand().length()>15)
				{
					String text=e.getActionCommand();
					StringTokenizer st=new StringTokenizer(text);
					String category=st.nextToken();
					String date=st.nextToken()+" "+st.nextToken();
					Event event=system.findEvent(category, date);
					prevScreens.push(currentPanel);
					changeScreen(new EventLogViewScreen(event), true);
				}
			}
			if(currentPanel.getClass().getName().equals("ViewFlightsScreen"))
			{
				ViewFlightsScreen c=(ViewFlightsScreen)currentPanel;
				if(tracing)System.out.println("SOMETHING IS WRONG");
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else if(e.getActionCommand().length()>15)
				{
					if(tracing)System.out.println("Button clicked");
					String text=e.getActionCommand();
					StringTokenizer st=new StringTokenizer(text);
					String id=st.nextToken();
					if(tracing)System.out.println("Find flight about to run");
					Flight flight=system.findFlight(id);
					prevScreens.push(currentPanel);
					if(tracing)System.out.println("ID: "+id+".");
					changeScreen(new FlightScreen(flight, this), true);
					if(tracing)System.out.println("end of if reached");
				}
			}
			if(currentPanel.getClass().getName().equals("VIewServicesScreen"))
			{
				VIewServicesScreen c=(VIewServicesScreen)currentPanel;
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					//DO THIS MAYBE
				}
			}
			if(currentPanel.getClass().getName().equals("ViewDeliveriesScreen"))
			{
				ViewDeliveriesScreen c=(ViewDeliveriesScreen)currentPanel;
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					//DO THIS MAYBE
				}
			}
			if(currentPanel.getClass().getName().equals("ViewLineTimesScreen"))
			{
				ViewLineTimesScreen c=(ViewLineTimesScreen)currentPanel;
				if(e.getSource().equals(c.searchButton))					{
					
					JOptionPane.showMessageDialog(null, "This function has not been implemented.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					//DO THIS MAYBE
				}
			}
			if(currentPanel.getClass().getName().equals("LogEventView"))
			{
				LogEventView c=(LogEventView)currentPanel;
				if(e.getSource().equals(c.saveButton))
				{
					String category=(String)c.categoryBox.getSelectedItem();
					String date=c.dateField.getText();
					String location=c.locationField.getText();
					String description=c.descriptionField.getText();
					String name=c.guardField.getText();
					Personnel guard=system.findGuard(name);
					if(guard==null)
						JOptionPane.showMessageDialog(null, "No such guard exists.", "Error", JOptionPane.ERROR_MESSAGE);
					else
					{
						system.createEvent(category, date, location, description, guard);
						changeScreen((JPanel)prevScreens.pop(), true);
					}
					
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
