package winPrototype;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class LogActivityWindow {

	private JFrame logActivityframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogActivityWindow window = new LogActivityWindow();
					window.logActivityframe.setVisible(true);
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
		logActivityframe = new JFrame();
		logActivityframe.setBounds(100, 100, 295, 475);
		logActivityframe.getContentPane().setBackground(Color.DARK_GRAY);
		logActivityframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label activityLabel = new Label("Log an Activity");
		activityLabel.setForeground(SystemColor.window);
		activityLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		activityLabel.setBounds(29, 70, 135, 75);
		GroupLayout groupLayout = new GroupLayout(logActivityframe.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(activityLabel, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(activityLabel, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
		);
		logActivityframe.getContentPane().setLayout(groupLayout);
	}

}
