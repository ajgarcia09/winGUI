package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class LogRunWindow {

	private JFrame logRunFrame;
	private JTextField runDistanceField;
	private JTextField runDurationField;

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
		logRunFrame.getContentPane().setBackground(UIManager.getColor("textHighlight"));
		logRunFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel runLengthLabel = new JLabel("How long was your run?");
		runLengthLabel.setForeground(Color.WHITE);
		runLengthLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblHowManyKm = new JLabel("How many km did you run?");
		lblHowManyKm.setForeground(Color.WHITE);
		lblHowManyKm.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton logRunButton = new JButton("Log Run");
		logRunButton.setBounds(82, 366, 111, 33);
		logRunFrame.getContentPane().add(logRunButton);
		
		runDistanceField = new JTextField();
		runDistanceField.setColumns(10);
		
		runDurationField = new JTextField();
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
