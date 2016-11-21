package winPrototype;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import java.awt.Label;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;

import win.User;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HomeScreen {

	private JFrame homeFrame;
	private User user1 = new User(123, "Ana", "female", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);
	private User user2 = new User(123, "Hector", "male", "hcervantes10","hcervantes@gmail.com","rocco",false);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.homeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeFrame = new JFrame();
		homeFrame.setBounds(100, 100, 295, 475);
		homeFrame.getContentPane().setBackground(SystemColor.textHighlight);
		homeFrame.getContentPane().setLayout(null);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label welcomeLabel = new Label("Welcome, " + user1.getName() + "!");
		welcomeLabel.setForeground(Color.WHITE);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		welcomeLabel.setBounds(19, 26, 154, 36);
		homeFrame.getContentPane().add(welcomeLabel);
		
		JLabel numStepsLabel = new JLabel("10650");
		numStepsLabel.setForeground(Color.WHITE);
		numStepsLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		numStepsLabel.setBounds(19, 68, 145, 109);
		homeFrame.getContentPane().add(numStepsLabel);
		
		JLabel walkingLabel = new JLabel("New label");
		walkingLabel.setBounds(165, 72, 93, 125);
		homeFrame.getContentPane().add(walkingLabel);
		ImageIcon myImage = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\dogWalking.png");
		Image img = myImage.getImage();
		Image newImg = img.getScaledInstance(walkingLabel.getWidth(), walkingLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		walkingLabel.setIcon(image);
		
		JLabel stepsTakenLabel = new JLabel("Steps taken today");
		stepsTakenLabel.setForeground(Color.WHITE);
		stepsTakenLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		stepsTakenLabel.setBounds(19, 158, 148, 19);
		homeFrame.getContentPane().add(stepsTakenLabel);
		
		JButton menuButton = new JButton("");
		menuButton.setBounds(231, 10, 38, 36);
		homeFrame.getContentPane().add(menuButton);
		ImageIcon menuIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\menu-icon.png");
		Image menuImg = menuIcon.getImage();
		Image resizedMenu = menuImg.getScaledInstance(menuButton.getWidth(), menuButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedMenuIcon = new ImageIcon(resizedMenu);
		menuButton.setIcon(resizedMenuIcon);
		
		JButton logActivityButton = new JButton("");
		logActivityButton.setBounds(188, 335, 70, 66);
		homeFrame.getContentPane().add(logActivityButton);
		ImageIcon logIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\plusButtonOrange.png");
		Image statsImg = logIcon.getImage();
		Image resizedLog = statsImg.getScaledInstance(logActivityButton.getWidth(), logActivityButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedLogIcon = new ImageIcon(resizedLog);
		logActivityButton.setIcon(resizedLogIcon);
		
		JLabel logActivityLabel = new JLabel("Log Activity");
		logActivityLabel.setForeground(Color.WHITE);
		logActivityLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		logActivityLabel.setBounds(173, 406, 106, 19);
		homeFrame.getContentPane().add(logActivityLabel);
		
	
	}
}
