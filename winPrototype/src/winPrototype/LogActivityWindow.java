package winPrototype;
import win.*;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogActivityWindow {

	private JFrame logActivityFrame;
	private User user1 = new User(123, "Ana", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogActivityWindow window = new LogActivityWindow();
					window.logActivityFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogActivityWindow() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logActivityFrame = new JFrame();
		logActivityFrame.setBounds(100, 100, 295, 475);
		logActivityFrame.getContentPane().setBackground(UIManager.getColor("textHighlight"));
		
		
		
		JButton sleepButton = new JButton("");
		/**call LogSleepWindow if sleepButton is clicked
		 * 
		 */
		sleepButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogSleepWindow sleepWindow = new LogSleepWindow();
				sleepWindow.displaySleepWindow();
			}
		});
		sleepButton.setIcon(new ImageIcon(LogActivityWindow.class.getResource("/winPrototype/sleepOption.png")));
		
		JLabel logActivityLabel = new JLabel("");
		
		JButton workoutButton = new JButton("");
		/**call LogWorkoutWindow if workoutButton is clicked
		 * 
		 */
		workoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LogWorkoutWindow wktWindow = new LogWorkoutWindow();
				wktWindow.displayWorkoutWindow();
			}
		});
		workoutButton.setIcon(new ImageIcon(LogActivityWindow.class.getResource("/winPrototype/workoutOption.png")));
		
		JLabel workoutLabel = new JLabel("Workout");
		
		JLabel sleepLabel = new JLabel("Sleep");
		
		JLabel logPromptLabel = new JLabel("What would you like to log?");
		logPromptLabel.setForeground(SystemColor.window);
		logPromptLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		logPromptLabel.setBounds(29, 70, 135, 75);
		logActivityFrame.getContentPane().add(logPromptLabel);
		
		GroupLayout groupLayout = new GroupLayout(logActivityFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(58, Short.MAX_VALUE)
					.addComponent(workoutButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(sleepButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(70)
					.addComponent(workoutLabel)
					.addGap(59)
					.addComponent(sleepLabel)
					.addContainerGap(83, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(logPromptLabel)
						.addComponent(logActivityLabel))
					.addContainerGap(212, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(logActivityLabel)
					.addGap(21)
					.addComponent(logPromptLabel)
					.addGap(82)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(workoutButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(sleepButton))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(workoutLabel)
						.addComponent(sleepLabel))
					.addContainerGap(211, Short.MAX_VALUE))
		);
		logActivityFrame.getContentPane().setLayout(groupLayout);
		logActivityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
