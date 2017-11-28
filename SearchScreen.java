import javax.swing.*;
import java.awt.*;


public class SearchScreen
{

	SearchScreen(String category, int n, String[][] m, String s[])
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
		
		JLabel fieldLabel=new JLabel(""+category+" ");
		JTextField textFeild=new JTextField();
		JButton searchButton=new JButton("Search");

		fieldLabel.setFont(new Font("Arial", Font.BOLD, 30));
		searchButton.setBackground(Color.WHITE);
		searchButton.setBorderPainted(false);
		searchButton.setFont(new Font("Arial", Font.BOLD, 30));
		textFeild.setColumns(30);
		textFeild.setFont(new Font("Arial", Font.PLAIN, 20));

		JPanel searchPanel=new JPanel();
		searchPanel.add(fieldLabel);
		searchPanel.add(textFeild);
		searchPanel.add(searchButton);

		JLabel [] metric=new JLabel[n];
		JComboBox [] cb=new JComboBox[n];
		JPanel metricPanel=new JPanel();
		for(int i=0; i<n; i++)
		{
			metric[i]=new JLabel(""+s[i]+": ");
			cb=new JComboBox(m[i]);
			metric[i].setFont(new Font("Arial", Font.PLAIN, 20));
			cb[i].setFont(new Font("Arial", Font.PLAIN, 20));
			cb[i].setBackground(Color.WHITE);
			metricPanel.add(metric[i]);
			metricPanel.add(cb[i]);

		}


		searchPanel.setBackground(Color.WHITE);
		metricPanel.setBackground(Color.WHITE);
		main.setLayout(new BorderLayout());

		JPanel north=new JPanel();
		north.setLayout(new BorderLayout());
		north.add(searchPanel,BorderLayout.NORTH);
		north.add(metricPanel, BorderLayout.SOUTH);
		main.add(north, BorderLayout.NORTH);

		JLabel r1=new JLabel("Result 1");
		JLabel r2=new JLabel("Result 2");
		JLabel r3=new JLabel("Result 3");
		JLabel r4=new JLabel("Result 4");
		JLabel r5=new JLabel("Result 5");
		JLabel r6=new JLabel("Result 6");
		JLabel r7=new JLabel("Result 7");
		JLabel r8=new JLabel("Result 8");
		JLabel r9=new JLabel("Result 9");
		JLabel r10=new JLabel("Result 10");	

		r1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r4.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r5.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r6.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r7.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r8.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r9.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		r10.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));

		r1.setBackground(Color.WHITE);
		r2.setBackground(Color.WHITE);
		r3.setBackground(Color.WHITE);
		r4.setBackground(Color.WHITE);
		r5.setBackground(Color.WHITE);
		r6.setBackground(Color.WHITE);
		r7.setBackground(Color.WHITE);
		r8.setBackground(Color.WHITE);
		r9.setBackground(Color.WHITE);
		r10.setBackground(Color.WHITE);

		r1.setFont(new Font("Arial", Font.PLAIN, 20));
		r2.setFont(new Font("Arial", Font.PLAIN, 20));
		r3.setFont(new Font("Arial", Font.PLAIN, 20));
		r4.setFont(new Font("Arial", Font.PLAIN, 20));
		r5.setFont(new Font("Arial", Font.PLAIN, 20));
		r6.setFont(new Font("Arial", Font.PLAIN, 20));
		r7.setFont(new Font("Arial", Font.PLAIN, 20));
		r8.setFont(new Font("Arial", Font.PLAIN, 20));
		r9.setFont(new Font("Arial", Font.PLAIN, 20));
		r10.setFont(new Font("Arial", Font.PLAIN, 20));


		JPanel results=new JPanel();
		results.setLayout(new GridLayout(10,1));
		results.setBackground(Color.WHITE);

		results.add(r1);
		results.add(r2);
		results.add(r3);
		results.add(r4);
		results.add(r5);
		results.add(r6);
		results.add(r7);
		results.add(r8);
		results.add(r9);
		results.add(r10);

		main.add(results, BorderLayout.CENTER);


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