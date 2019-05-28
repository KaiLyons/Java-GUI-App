package gui; //Put it in a folder called gui (all lower case) or change it

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class app {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		// Text
		JLabel text = new JLabel();
		text.setText("Wowie you did it!!");
		text.setLocation(0, 0);
		frame.add(text);
		
		// Frame size
		frame.setPreferredSize(new Dimension(500, 400));
		frame.setSize(800, 700);
		frame.setMinimumSize(new Dimension(500,400));
		
		// Other frame stuff
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setBackground(Color.BLACK);
		
		// Frame basics
		frame.setTitle("Welcome to this app");
		
		// Labels
		
	}
	
}
