/*
	BY: 	ABAD HAMEED
	DATE:	OCT. 14. 2015
	ENGI3051 In-Class Assign. 2
	Simple Chat v.1
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
public class SimpleChat extends JFrame
{
	// Variable declarations
	private JLabel lbl1, lbl2;
	private JButton btn1, btn2;
	private JTextField txt1, txt2;
	
	// Constructor for SimpleChat
	public SimpleChat()
	{
		super("Simple Chat v.1"); // title of window
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(0,2));	// layout type (with specified values)
		
		// Creating labels and textfields and adding to frame
		lbl1 = new JLabel("Host: ");
		//lbl1.setForeground(Color.WHITE);
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
		
		// Creating handlers for textfield and buttons
		Handler handler = new Handler();
		txt1.addActionListener(handler);
		txt2.addActionListener(handler);
		btn1.addActionListener(handler);
		btn2.addActionListener(handler);
	}
	
	// class for action handler
	private class Handler implements ActionListener
	{
		// function to perform action based on event
		public void actionPerformed(ActionEvent event)
		{
			String string = "";
			
			if (event.getSource() == txt1)
			{
				string = String.format("Host: %s", event.getActionCommand());
				JOptionPane.showMessageDialog(null, string);
			}
			else if (event.getSource() == txt2)
			{
				string = String.format("Port: %s", event.getActionCommand());
				JOptionPane.showMessageDialog(null, string);
			}
			else if (event.getSource() == btn1 || event.getSource() == btn2)
				JOptionPane.showMessageDialog(SimpleChat.this, 
						String.format("You pressed: %s", event.getActionCommand()));
		}
	}
}
