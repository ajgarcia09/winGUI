package winPrototype;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;

import win.User;

import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewGoalsWindow {
	

	private JFrame goalsFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		displaySetGoalsWindow();
		
	}

	/**
	 * Create the application.
	 */
	public ViewGoalsWindow() {
		initialize();
	}
	
	public static void displaySetGoalsWindow(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGoalsWindow window = new ViewGoalsWindow();
					window.goalsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		User user1 = new User(123, "Ana", "female", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);
		user1.setStepGoal(1123);
		user1.setSleepGoal(8);//hours
		user1.setSwimGoal(10); //number of laps
		user1.setRunGoal(5);//km
		
		goalsFrame = new JFrame();
		goalsFrame.setBounds(100, 100, 295, 475);
		goalsFrame.getContentPane().setBackground(SystemColor.textHighlight);
		goalsFrame.getContentPane().setLayout(null);
		
		JLabel stepCountLabel = new JLabel();
		stepCountLabel.setText(Integer.toString(user1.getStepGoal()));
		stepCountLabel.setForeground(Color.WHITE);
		stepCountLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		stepCountLabel.setBounds(65, 40, 145, 67);
		goalsFrame.getContentPane().add(stepCountLabel);
		
		Label myGoalsLabel = new Label(user1.getName() + "'s Goals");
		myGoalsLabel.setForeground(Color.WHITE);
		myGoalsLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		myGoalsLabel.setBounds(10, 10, 154, 36);
		goalsFrame.getContentPane().add(myGoalsLabel);
		
		Label stepsLabel = new Label("Daily Steps");
		stepsLabel.setForeground(Color.WHITE);
		stepsLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		stepsLabel.setBounds(75, 113, 129, 36);
		goalsFrame.getContentPane().add(stepsLabel);
		
		JLabel sleephours = new JLabel(Integer.toString(user1.getSleepGoal()));
		sleephours.setForeground(Color.WHITE);
		sleephours.setFont(new Font("Tahoma", Font.BOLD, 40));
		sleephours.setBounds(85, 155, 79, 67);
		goalsFrame.getContentPane().add(sleephours);
		
		Label label = new Label("Sleep per night");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(58, 209, 168, 36);
		goalsFrame.getContentPane().add(label);
		
		JLabel runTime = new JLabel(Integer.toString(user1.getRunGoal()));
		runTime.setForeground(Color.WHITE);
		runTime.setFont(new Font("Tahoma", Font.BOLD, 40));
		runTime.setBounds(36, 273, 109, 67);
		goalsFrame.getContentPane().add(runTime);
		
		Label runLabel = new Label("Run km");
		runLabel.setForeground(Color.WHITE);
		runLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		runLabel.setBounds(10, 346, 129, 36);
		goalsFrame.getContentPane().add(runLabel);
		
		JButton btnBackToProfile = new JButton("Back to Profile");
		/**display profile screen window
		 * 
		 */
		btnBackToProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ProfileScreen profileScreen = new ProfileScreen();
			profileScreen.displayProfileScreen();
			}
		});
		btnBackToProfile.setBounds(134, 402, 135, 23);
		goalsFrame.getContentPane().add(btnBackToProfile);
		
		JLabel lblH = new JLabel("h");
		lblH.setForeground(Color.WHITE);
		lblH.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblH.setBounds(174, 155, 79, 67);
		goalsFrame.getContentPane().add(lblH);
		
		Label swimTimeLabel = new Label("Swim Laps");
		swimTimeLabel.setForeground(Color.WHITE);
		swimTimeLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		swimTimeLabel.setBounds(145, 346, 129, 36);
		goalsFrame.getContentPane().add(swimTimeLabel);
		
		JLabel swimTime = new JLabel(Integer.toString(user1.getSwimGoal()));
		swimTime.setForeground(Color.WHITE);
		swimTime.setFont(new Font("Tahoma", Font.BOLD, 40));
		swimTime.setBounds(160, 273, 109, 67);
		goalsFrame.getContentPane().add(swimTime);
		goalsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
