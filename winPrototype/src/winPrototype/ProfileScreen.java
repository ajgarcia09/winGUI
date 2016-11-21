package winPrototype;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

import win.User;
import java.awt.Button;
import java.awt.Panel;

public class ProfileScreen {

	private JFrame homeFrame;
	private User user1 = new User(123, "Ana", "female", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);
	private User user2 = new User(123, "Hector", "male", "hcervantes10","hcervantes@gmail.com","rocco",false);
	/**
	 * Launch the application.
	 */
	public static void displayProfileScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileScreen window = new ProfileScreen();
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
	public ProfileScreen() {
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

		Label homeLabel = new Label("Welcome, " + user1.getName()+ "!");
		homeLabel.setForeground(SystemColor.window);
		homeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		homeLabel.setBounds(10, 10, 154, 54);
		homeFrame.getContentPane().add(homeLabel);
		
		JLabel pictureLabel = new JLabel("New label");
		pictureLabel.setBounds(21, 70, 93, 125);
		homeFrame.getContentPane().add(pictureLabel); 
				
		/**resize an image to fit JLabel above
		 * for now, it only works with the actual 
		 * path of the picture located on my hard disk
		 * TODO try to have this work via Classpath
		 */
//		String imagePath;
//		if(user1.getGender().equals("female")){
//			imagePath = "C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\girlPose.png";
//		}
//		else{
//			imagePath = "C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\guyPose.png";
//		}
		ImageIcon myImage = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\girlPose.png");
		Image img = myImage.getImage();
		Image newImg = img.getScaledInstance(pictureLabel.getWidth(), pictureLabel.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		pictureLabel.setIcon(image);
		
		JLabel numStepsLabel = new JLabel("10525");
		numStepsLabel.setForeground(SystemColor.window);
		numStepsLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		numStepsLabel.setBounds(124, 70, 145, 109);
		homeFrame.getContentPane().add(numStepsLabel);
		
		JLabel stepsTakenLabel = new JLabel("Steps taken today");
		stepsTakenLabel.setForeground(Color.WHITE);
		stepsTakenLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		stepsTakenLabel.setBounds(107, 158, 162, 19);
		homeFrame.getContentPane().add(stepsTakenLabel);
		
		JButton statsButton = new JButton("");
		statsButton.setBounds(156, 234, 70, 66);
		homeFrame.getContentPane().add(statsButton);
		ImageIcon statsIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\statsLogo.png");
		Image statsImg = statsIcon.getImage();
		Image resizedStats = statsImg.getScaledInstance(statsButton.getWidth(), statsButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedStatsIcon = new ImageIcon(resizedStats);
		statsButton.setIcon(resizedStatsIcon);
		
		JButton goalsButton = new JButton("");
		goalsButton.setBounds(50, 234, 70, 66);
		homeFrame.getContentPane().add(goalsButton);
		ImageIcon goalsIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\goalsLogo.png");
		Image goalsImg = goalsIcon.getImage();
		Image resizedGoals = goalsImg.getScaledInstance(goalsButton.getWidth(), goalsButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedGoalsIcon = new ImageIcon(resizedGoals);
		goalsButton.setIcon(resizedGoalsIcon);
		
		JButton menuButton = new JButton("");
		menuButton.setBounds(224, 10, 45, 36);
		homeFrame.getContentPane().add(menuButton);
		ImageIcon menuIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\menu-icon.png");
		Image menuImg = menuIcon.getImage();
		Image resizedMenu = menuImg.getScaledInstance(menuButton.getWidth(), menuButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedMenuIcon = new ImageIcon(resizedMenu);
		menuButton.setIcon(resizedMenuIcon);
		
		
		JButton workoutsButton = new JButton("");
		workoutsButton.setBounds(105, 334, 70, 66);
		homeFrame.getContentPane().add(workoutsButton);
		ImageIcon workoutsIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\weightLogo.png");
		Image workoutsImg = workoutsIcon.getImage();
		Image resizedWorkouts = workoutsImg.getScaledInstance(workoutsButton.getWidth(), workoutsButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedWorkoutsIcon = new ImageIcon(resizedWorkouts);
		workoutsButton.setIcon(resizedWorkoutsIcon);
		
		JLabel goalsLabel = new JLabel("My Goals");
		goalsLabel.setForeground(Color.WHITE);
		goalsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		goalsLabel.setBounds(50, 304, 75, 19);
		homeFrame.getContentPane().add(goalsLabel);
		
		JLabel workoutsLabel = new JLabel("My Workouts");
		workoutsLabel.setForeground(Color.WHITE);
		workoutsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		workoutsLabel.setBounds(85, 406, 113, 19);
		homeFrame.getContentPane().add(workoutsLabel);
		
		JLabel statsLabel = new JLabel("My Stats");
		statsLabel.setForeground(Color.WHITE);
		statsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		statsLabel.setBounds(156, 304, 75, 19);
		homeFrame.getContentPane().add(statsLabel);
	
}
}
