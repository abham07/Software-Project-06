/*
	BY: 	ABAD HAMEED
	DATE:	OCT. 14. 2015
	ENGI3051 In-Class Assign. 2
	Simple Chat v.2
*/

// All required import statements
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

// Java class extending JFrame library
public class SimpleChat_v2 extends JFrame
{
	// Variable declarations
	private JLabel lbl1, lbl2;
	private JButton btn1, btn2;
	private JTextField txt1, txt2;
	
	// Constructor for SimpleChat_v2
	public SimpleChat_v2()
	{
		super("Simple Chat v.2"); // title of window
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(0,2));	// layout type (with specified values)
		
		// Creating labels and textfields and adding to frame
		lbl1 = new JLabel("Host: ");
		lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbl1);
		txt1 = new JTextField();
		add(txt1);
		
		lbl2 = new JLabel("Port: ");
		lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lbl2);
		txt2 = new JTextField();
		add(txt2);
		
		// Creating buttons and adding to frame
		btn1 = new JButton("Open");
		add(btn1);
		btn2 = new JButton("Send");
		add(btn2);
		
		// Creating instances of Handler class
		Handler hostTextHandler = new Handler();
		Handler portTextHandler = new Handler();
		Handler openBtnHandler = new Handler();
		Handler sendBtnHandler = new Handler();
		
		txt1.addActionListener(hostTextHandler);
		txt2.addActionListener(portTextHandler);
		btn1.addActionListener(openBtnHandler);
		btn2.addActionListener(sendBtnHandler);
	}
	
	// class for action handler
	private class Handler implements ActionListener
	{
		// function to perform action based on event
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(SimpleChat_v2.this, 
					String.format("%s", event.getActionCommand()));
		}
	}
}
