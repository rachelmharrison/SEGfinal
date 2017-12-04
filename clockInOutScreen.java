import javax.swing.*;
import java.awt.*;


public class clockInOutScreen extends JPanel
{
	View view;
	Personnel p;
	Shift[] shifts;
	JButton b1;
	JButton b2;

	clockInOutScreen(View view, Personnel p)
	{
		this.view=view;
		this.p=p;

		GridBagConstraints gbc=new GridBagConstraints();
		
		
		b1=new JButton("Clock In");
		b2=new JButton("Clock Out");

//		b2.setClickable(false);


		JPanel s1=new JPanel();
		b1.setFont(new Font("Arial", Font.PLAIN, 30));
		b1.setBackground(Color.WHITE);
		b1.setBorderPainted(false);
		s1.setBackground(Color.WHITE);

		b2.setFont(new Font("Arial", Font.PLAIN, 30));
		b2.setBackground(Color.WHITE);
		b2.setBorderPainted(false);

		

		shifts=p.getShifts();
		JLabel[] shiftLabel=new JLabel[shifts.length];
		JPanel c=new JPanel();
		c.setBackground(Color.WHITE);
	//	System.out.println("Lenght: "+shifts.length);
		
		for(int i=0; i<shifts.length; i++)
		{
		//	System.out.println(shifts[i].toString());
			shiftLabel[i]=new JLabel(shifts[i].toString());
			if(i==0)
			{
				shiftLabel[i].setFont(new Font("Arial", Font.BOLD, 30));
				s1.add(shiftLabel[i]);
				s1.add(b1);
				s1.add(b2);
				c.add(s1);

			}
			else
			{
				shiftLabel[i].setFont(new Font("Arial", Font.PLAIN, 30));
				c.add(shiftLabel[i]);
			}
		}



	

		this.setLayout(new BorderLayout());
		this.add(c, BorderLayout.CENTER);


	
	}
}