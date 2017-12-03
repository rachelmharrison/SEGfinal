import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SearchScreen extends JPanel
{

	View view;
	JButton searchButton;
	JButton[] r;
	JTextField textField;

	JLabel [] metric;
	JComboBox [] cb;
	JPanel metricPanel;

	SearchScreen(String category, int n, String[][] m, String s[], View view)
	{
		
		this.view=view;
		metric=new JLabel[n];
		cb=new JComboBox[n];
		metricPanel=new JPanel();
		JLabel fieldLabel=new JLabel(""+category+" ");
		textField=new JTextField();
		searchButton=new JButton("Search");

		searchButton.addActionListener(view);

		fieldLabel.setFont(new Font("Arial", Font.BOLD, 30));
		searchButton.setBackground(Color.WHITE);
		searchButton.setBorderPainted(false);
		searchButton.setFont(new Font("Arial", Font.BOLD, 30));
		textField.setColumns(30);
		textField.setFont(new Font("Arial", Font.PLAIN, 20));

		JPanel searchPanel=new JPanel();
		searchPanel.add(fieldLabel);
		searchPanel.add(textField);
		searchPanel.add(searchButton);

		
		for(int i=0; i<n; i++)
		{
			metric[i]=new JLabel(""+s[i]+": ");
			String[] temp=m[i];
			cb[i]=new JComboBox(temp);
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
			r[i]=new JButton();
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
		int n=s.length;
		for(int i=0; (i<n && i<20); i++)
		{
			r[i].setText(s[i]);
		}
	}
}