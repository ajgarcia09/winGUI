package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import win.User;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogRunWindow {

	private JFrame logRunFrame;
	private JTextField runDistanceField;
	private int runDistance;
	private JTextField runDurationField;
	private int runDuration;
	private User user1 = new User(123, "Ana", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);

	/**
	 * Launch the application.
	 */
	public static void displayRunWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogRunWindow window = new LogRunWindow();
					window.logRunFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogRunWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logRunFrame = new JFrame();
		logRunFrame.setBounds(100, 100, 295, 475);
		logRunFrame.getContentPane().setBackground(SystemColor.textHighlight);
		logRunFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel runLengthLabel = new JLabel("How long was your run?");
		runLengthLabel.setForeground(Color.WHITE);
		runLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblHowManyKm = new JLabel("How many km did you run?");
		lblHowManyKm.setForeground(Color.WHITE);
		lblHowManyKm.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton logRunButton = new JButton("Log Run");
		/**Creates a new Run object (with runDistance
		 * and runDuration fields) when logRunButton is clicked.
		 * 
		 */
		logRunButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user1.logRun(runDistance, runDuration);
				WorkoutAddedWindow wktAdded = new WorkoutAddedWindow();
				wktAdded.displayWorkoutAddedwindow();
				user1.printActivities();
			}
		});
		logRunButton.setBounds(82, 366, 111, 33);
		logRunFrame.getContentPane().add(logRunButton);
		
		runDistanceField = new JTextField();
		/**gets user input from runDistanceField,
		 * parses it into an int, & updates field runDistance
		 * to be used in creating a Run object
		 */
		runDistanceField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rDistance = runDistanceField.getText();
				runDistance = Integer.parseInt(rDistance);
			}
		});
		runDistanceField.setColumns(10);
		
		runDurationField = new JTextField();
		/**gets user input from runDurationField,
		 * parses it into an int, & updates field runDuration
		 * to be used in creating a Run object
		 */
		runDurationField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String runTime = runDurationField.getText();
				runDuration = Integer.parseInt(runTime);
			}
		});
		runDurationField.setColumns(10);
		
		JLabel runImageLabel = new JLabel("");
		runImageLabel.setIcon(new ImageIcon(LogRunWindow.class.getResource("/winPrototype/runIcon.png")));
		
		
		GroupLayout groupLayout = new GroupLayout(logRunFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(21)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(runDurationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(runDistanceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHowManyKm, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
								.addComponent(runLengthLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(103)
							.addComponent(runImageLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(runImageLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(runLengthLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(runDurationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(lblHowManyKm, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(runDistanceField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		logRunFrame.getContentPane().setLayout(groupLayout);
	}

}
