package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LogWorkoutWindow {

	private JFrame logWorkoutFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		logWorkoutFrame.getContentPane().setBackground(UIManager.getColor("textHighlight"));
		logWorkoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea txtrWhatKindOf = new JTextArea();
		txtrWhatKindOf.setText("What kind of workout did you do?");
		
		JButton swimButton = new JButton("");
		swimButton.setIcon(new ImageIcon(LogWorkoutWindow.class.getResource("/winPrototype/swimIcon.png")));
		
		JButton runButton = new JButton("");
		runButton.setIcon(new ImageIcon(LogWorkoutWindow.class.getResource("/winPrototype/runIcon.png")));
		
		GroupLayout groupLayout = new GroupLayout(logWorkoutFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(txtrWhatKindOf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(swimButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(runButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrWhatKindOf, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(swimButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
						.addComponent(runButton, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(260, Short.MAX_VALUE))
		);
		logWorkoutFrame.getContentPane().setLayout(groupLayout);
	}

}
