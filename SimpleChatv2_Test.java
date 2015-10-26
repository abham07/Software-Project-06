/*
	BY: 	ABAD HAMEED
	DATE:	OCT. 14. 2015
	ENGI3051 In-Class Assign. 2
	Simple Chat v.2 Test
*/

import java.awt.Color;
import javax.swing.JFrame;

public class SimpleChatv2_Test
{
	// Main function
	public static void main(String[] args) 
	{
		SimpleChat_v2 simpleChatv2 = new SimpleChat_v2(); // creates SimpleChat object
		simpleChatv2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates program at close
		simpleChatv2.setSize(300,200);
		simpleChatv2.setVisible(true);
		simpleChatv2.getContentPane().setBackground(Color.GREEN);
	}
}
