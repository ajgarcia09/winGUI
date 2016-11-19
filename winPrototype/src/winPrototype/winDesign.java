package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class winDesign {

	private JFrame frmWin;
	private JTextField usernameField;
	private JPasswordField passwordField;

	//Launch the application	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winDesign window = new winDesign();
					window.frmWin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Create the application.
	 public winDesign() {
		initialize();
	}
	 
	//Initialize the contents of the frame
	private void initialize() {
		frmWin = new JFrame();
		frmWin.setTitle("Win");
		frmWin.getContentPane().setBackground(SystemColor.textHighlight);
		frmWin.setBounds(100, 100, 295, 475);
		frmWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWin.getContentPane().setLayout(null);
		
		JButton loginButton = new JButton("Log in");
		loginButton.addActionListener(new ActionListener() {
			//creates a new object of the class UserStats, which 
			//pops up a new window upon the user clicking on getStartedButton 
			public void actionPerformed(ActionEvent e) {
				UserStats newWindow = new UserStats();
				newWindow.displayStatsWindow();
			}
		});
		loginButton.setBounds(82, 322, 111, 33);
		frmWin.getContentPane().add(loginButton);
		
		usernameField = new JTextField();
		usernameField.setBounds(67, 232, 145, 20);
		frmWin.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 291, 145, 20);
		frmWin.getContentPane().add(passwordField);
		
		Label usernameLabel = new Label("Username");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		usernameLabel.setBounds(67, 204, 62, 22);
		frmWin.getContentPane().add(usernameLabel);
		
		Label passwordLabel = new Label("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordLabel.setBounds(67, 263, 62, 22);
		frmWin.getContentPane().add(passwordLabel);
		
		Label winLabel = new Label("Win");
		winLabel.setForeground(SystemColor.window);
		winLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
		winLabel.setBounds(29, 70, 135, 75);
		frmWin.getContentPane().add(winLabel);
		
		Label mottoLabel = new Label("Set goals. Reach them. Be the best version of you.");
		mottoLabel.setForeground(SystemColor.window);
		mottoLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		mottoLabel.setBounds(10, 151, 261, 47);
		frmWin.getContentPane().add(mottoLabel);
		
		JLabel medalLabel = new JLabel("");
		medalLabel.setIcon(new ImageIcon(winDesign.class.getResource("/winPrototype/medalLogoSmall.PNG")));
		medalLabel.setBounds(170, 51, 71, 94);
		frmWin.getContentPane().add(medalLabel);
		
		JButton createAccountButton = new JButton("Create Account");
		createAccountButton.setBounds(82, 366, 111, 33);
		frmWin.getContentPane().add(createAccountButton);
	}
}
