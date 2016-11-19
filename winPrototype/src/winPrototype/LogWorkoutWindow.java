package winPrototype;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogWorkoutWindow {

	private JFrame logWorkoutFrame;

	/**
	 * Launch the application.
	 */
	public static void displayWorkoutWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogWorkoutWindow window = new LogWorkoutWindow();
					window.logWorkoutFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogWorkoutWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logWorkoutFrame = new JFrame();
		logWorkoutFrame.setBounds(100, 100, 295, 475);
		logWorkoutFrame.getContentPane().setBackground(SystemColor.textHighlight);
		logWorkoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton swimButton = new JButton("");
		/**display LogSwimWindow if swimButton is clicked
		 * 
		 */
		swimButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogSwimWindow swimWindow = new LogSwimWindow();
				swimWindow.displaySwimWindow();
			}
		});
		swimButton.setIcon(new ImageIcon(LogWorkoutWindow.class.getResource("/winPrototype/swimIcon.png")));
		
		JButton runButton = new JButton("");
		/**display LogSwimWindow if swimButton is clicked
		 * 
		 */
		runButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogRunWindow runWindow = new LogRunWindow();
				runWindow.displayRunWindow();
			}
		});
		runButton.setIcon(new ImageIcon(LogWorkoutWindow.class.getResource("/winPrototype/workoutOption.png")));
		
		JLabel kindWorkoutLabel = new JLabel("What kind of workout did you do?");
		kindWorkoutLabel.setForeground(SystemColor.window);
		kindWorkoutLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		kindWorkoutLabel.setBounds(29, 70, 135, 75);
		logWorkoutFrame.getContentPane().add(kindWorkoutLabel);
		
		JLabel lblSwim = new JLabel("Swim");
		
		JLabel lblRun = new JLabel("Run");
		
		GroupLayout groupLayout = new GroupLayout(logWorkoutFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(kindWorkoutLabel, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(swimButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblSwim)))
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblRun)
								.addComponent(runButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(kindWorkoutLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(swimButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(runButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSwim)
						.addComponent(lblRun))
					.addGap(235))
		);
		logWorkoutFrame.getContentPane().setLayout(groupLayout);
	}

}
