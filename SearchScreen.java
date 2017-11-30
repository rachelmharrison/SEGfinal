import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SearchScreen extends JPanel
{

	View view;
	JButton searchButton;
	JButton[] r;
	SearchScreen(String category, int n, String[][] m, String s[], View view)
	{
		
		this.view=view;
		JLabel fieldLabel=new JLabel(""+category+" ");
		JTextField textFeild=new JTextField();
		searchButton=new JButton("Search");

		searchButton.addActionListener(view);

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

		r=new JButton[20];

		searchPanel.setBackground(Color.WHITE);
		metricPanel.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());

		JPanel north=new JPanel();
		north.setLayout(new BorderLayout());
		north.add(searchPanel,BorderLayout.NORTH);
		north.add(metricPanel, BorderLayout.SOUTH);
		this.add(north, BorderLayout.NORTH);

		JPanel results=new JPanel();
		results.setLayout(new GridLayout(10,1));
		results.setBackground(Color.WHITE);


		for(int i=0; i<20; i++)
		{
			r[i].setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
			r[i].setBackground(Color.WHITE);
			r[i].setFont(new Font("Arial", Font.PLAIN, 20));
			r[i].addActionListener(view);
			results.add(r[i]);
		}


		this.add(results, BorderLayout.CENTER);


	}

	public void updateResults(String[] s)
	{
		int n=s.length();
		for(int i<0; i<n || i<20; i++)
		{
			r[i].setText(s[i]);
		}
	}
}