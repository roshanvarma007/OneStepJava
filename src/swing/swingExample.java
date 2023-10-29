package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class swingExample {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame ("My first GUI");
// NOw first must must have to define size
		frame.setSize(380, 400);
		
		
		JLabel lable = new JLabel ("Welcome To My First GUI");
		
		JTextField textField = new JTextField ("Text Field");
		
		JButton button1 = new JButton ("1.Button");
		JButton button2 = new JButton ("2.Button");
		JButton button3 = new JButton ("3.Button");
		JButton button4 = new JButton ("4.Button");
		
		JPanel panel = new JPanel ();
		// We will add button in pannel
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(lable);
		panel.add(textField);
		
		//Adding panel to frame
		
		frame.add(panel);
		
		frame.show();	
	}

}
