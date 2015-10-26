/*
	BY: 	ABAD HAMEED
	DATE:	OCT. 14. 2015
	ENGI3051 In-Class Assign. 2
	Simple Chat v.1 Test
*/

import java.awt.Color;
import javax.swing.JFrame;

public class SimpleChat_Test 
{
	// Main function
	public static void main(String[] args) 
	{
		SimpleChat simpleChat = new SimpleChat(); // creates SimpleChat object
		simpleChat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates program at close
		simpleChat.setSize(300,200);
		simpleChat.setVisible(true);
		simpleChat.getContentPane().setBackground(Color.BLUE);
	}
}
