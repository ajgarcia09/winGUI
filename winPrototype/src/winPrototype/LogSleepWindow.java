package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LogSleepWindow {

	private JFrame logSleepFrame;
	private JTextField napField;
	private JLabel howLongLabel;
	private JTextField sleepDurationField;

	/**
	 * Launch the application.
	 */
	public static void displaySleepWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogSleepWindow window = new LogSleepWindow();
					window.logSleepFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogSleepWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logSleepFrame = new JFrame();
		logSleepFrame.setBounds(100, 100, 295, 475);
		logSleepFrame.getContentPane().setBackground(SystemColor.textHighlight);
		logSleepFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel sleepLabel = new JLabel("");
		sleepLabel.setIcon(new ImageIcon(LogSleepWindow.class.getResource("/winPrototype/sleepOption.png")));
		
		JLabel napLabel = new JLabel("Did you take a nap?");
		napLabel.setForeground(Color.WHITE);
		napLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		napField = new JTextField();
		napField.setColumns(10);
		
		howLongLabel = new JLabel("How long did you sleep?");
		howLongLabel.setForeground(Color.WHITE);
		howLongLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		sleepDurationField = new JTextField();
		sleepDurationField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(logSleepFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(98)
							.addComponent(sleepLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(napField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(napLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
								.addComponent(howLongLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
								.addComponent(sleepDurationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(sleepLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addComponent(napLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(napField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(howLongLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sleepDurationField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(170, Short.MAX_VALUE))
		);
		logSleepFrame.getContentPane().setLayout(groupLayout);
	}

}
