package winPrototype;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import win.User;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogSwimWindow {

	private JFrame logSwimFrame;
	private JTextField swimDurationField;
	private int swimDuration;
	private JTextField numLapsField;
	private int numLaps;
	private JLabel numCyclesLabel;	
	private JTextField numCyclesField;
	private int numCycles;
	private JLabel lblNewLabel;
	private JLabel hitEnterLabel1;
	private JLabel hitEnterLabel2;
	private JLabel hitEnterLabel3;
	private User user1 = new User(123, "Ana", "female", "ajgarcia09","anita@gmail.com","honeyButterBiscuit",false);
	private JButton goBackButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void displaySwimWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogSwimWindow window = new LogSwimWindow();
					window.logSwimFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogSwimWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logSwimFrame = new JFrame();
		
		
		JLabel swimLenghLabel = new JLabel("How long was your swim?");
		swimLenghLabel.setForeground(Color.WHITE);
		swimLenghLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		swimDurationField = new JTextField();
		/**gets user input from swimDurationField,
		 * parses it into an int, & updates field swimDuration
		 * to be used in creating a Swim object
		 */
		swimDurationField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String swDuration = swimDurationField. getText();
				swimDuration = Integer.parseInt(swDuration);
			}
		});
		swimDurationField.setColumns(10);
		
		JLabel numLapsLabel = new JLabel("How many laps did you swim?");
		numLapsLabel.setForeground(Color.WHITE);
		numLapsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		numLapsField = new JTextField();
		/**gets user input from numLapsField,
		 * parses it into an int, & updates field numLaps
		 * to be used in creating a Swim object
		 */
		numLapsField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nLaps = numLapsField.getText();
				numLaps = Integer.parseInt(nLaps);
			}
		});
		numLapsField.setColumns(10);
		
		numCyclesLabel = new JLabel("How many cycles did you swim?");
		numCyclesLabel.setForeground(Color.WHITE);
		numCyclesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		numCyclesField = new JTextField();
		/**gets user input from numCyclesField,
		 * parses it into an int, & updates field numCycless
		 * to be used in creating a Swim object
		 */
		numCyclesField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nCycles = numCyclesField.getText();
				numCycles = Integer.parseInt(nCycles);
			}
		});
		numCyclesField.setColumns(10);
		
		JButton logSwimButton = new JButton("Log Swim");
		/**Creates a new Swim object (with swimDuration,
		 * numLaps,numCycles fields) when logSwimButton is clicked.
		 * It also opens a new window displaying that a workout was
		 * successfully logged
		 * 
		 */
		logSwimButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user1.logSwim(swimDuration, numLaps,numCycles);
				user1.printActivities();
				WorkoutAddedWindow wkAdded = new WorkoutAddedWindow();
				wkAdded.displayWorkoutAddedwindow();
			}
		});
		logSwimButton.setBounds(82, 366, 111, 33);
		logSwimFrame.getContentPane().add(logSwimButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LogSwimWindow.class.getResource("/winPrototype/swimIcon.png")));
		
		hitEnterLabel1 = new JLabel("Enter a value and hit Enter");
		hitEnterLabel1.setForeground(Color.WHITE);
		hitEnterLabel1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		hitEnterLabel2 = new JLabel("Enter a value and hit Enter");
		hitEnterLabel2.setForeground(Color.WHITE);
		hitEnterLabel2.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		hitEnterLabel3 = new JLabel("Enter a value and hit Enter");
		hitEnterLabel3.setForeground(Color.WHITE);
		hitEnterLabel3.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		goBackButton = new JButton("Go Back");
		/**takes user back to LogWorkoutWindow
		 * 
		 */
		goBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogWorkoutWindow logWorkout = new LogWorkoutWindow();
				logWorkout.displayWorkoutWindow();
			}
		});
		
		cancelButton = new JButton("Cancel");
		/**takes user back to homepage
		 * 
		 */
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen homeScreen = new HomeScreen();
				homeScreen.displayHomeScreen();
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(logSwimFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(goBackButton, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(swimLenghLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(63, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(swimDurationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(183, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(hitEnterLabel1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(136, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(numLapsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(183, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(hitEnterLabel2, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(136, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(numCyclesLabel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(22, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(numCyclesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(183, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(numLapsLabel, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(37, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(hitEnterLabel3, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(136, Short.MAX_VALUE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(98)
					.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(103, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(goBackButton)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(swimLenghLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(swimDurationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hitEnterLabel1, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(numLapsLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(numLapsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hitEnterLabel2, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(numCyclesLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(numCyclesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hitEnterLabel3, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
					.addComponent(cancelButton)
					.addContainerGap())
		);
		logSwimFrame.getContentPane().setLayout(groupLayout);
		logSwimFrame.setBounds(100, 100, 295, 475);
		logSwimFrame.getContentPane().setBackground(SystemColor.textHighlight);
		logSwimFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
