package LoginFormProject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm {
	
	//4rth step
	
	public static boolean checkData(String userName , String paasword) {
		if (userName.equals("Roshan") && paasword.equals("123")){
			return true;
			}
		return false;
		}
	
	
	//2nd step
	
	public static void addComponentToPanel(JPanel panel) {
		JLabel userLabel = new JLabel("User");
		JTextField userText = new JTextField();
		JLabel paaswordLabel = new JLabel ("paasword");
		JTextField paaswordText = new JTextField();
		
		//Now Buttons
		
		JButton cancelButton = new JButton("Cancel");
		JButton loginButton = new JButton("Login");
		
		//Adding component to pannel
		
		panel.add(userLabel);
		panel.add(userText);
		panel.add(paaswordLabel);
		panel.add(paaswordText);
		panel.add(cancelButton);
		panel.add(loginButton);
	
		//5th Step
		
		//adding action button 
		
		loginButton.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
			if(checkData(userText.getText(),paaswordText.getText())) {
				JOptionPane.showMessageDialog(panel,"Hello " + userText.getText() + "!Welocm To Java Swing", "Login Messgae", 
						JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(panel, "Invlid Usernaem or Paasword","Login Message" , JOptionPane.ERROR_MESSAGE);
			}
			}
			
		});
		cancelButton.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
			
		});
	}

	public static void main(String[] args) {
	
		//1step
		JFrame frame = new JFrame ("Login Form Demo");
		
		// Now will create a pannel object to store container
		
		JPanel panel = new JPanel (new GridLayout(3,2,15,15));
		
		//Calling method
		//3rd Step
		
		addComponentToPanel(panel);
		
		//Close button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Center the frame of screen
		
		frame.setLocationRelativeTo(null);
		frame.setSize(300, 150);
		
		//It will use to get conent in frame 
		
		frame.getContentPane().add(panel);
		//frame appear on screen
		
		frame.setVisible(true);

	}

}
