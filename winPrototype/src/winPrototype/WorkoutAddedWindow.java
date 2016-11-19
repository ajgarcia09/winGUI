package winPrototype;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class WorkoutAddedWindow {

	private JFrame workoutAddedFrame;

	/**
	 * Launch the application.
	 */
	public static void displayWorkoutAddedwindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkoutAddedWindow window = new WorkoutAddedWindow();
					window.workoutAddedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WorkoutAddedWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		workoutAddedFrame = new JFrame();
		workoutAddedFrame.getContentPane().setBackground(SystemColor.textHighlight);
//		ImageIcon imageIcon = new ImageIcon("/winPrototype/checkMark_smaller.png");
//		Image image = imageIcon.getImage();
//		Image newImage = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
//		imageIcon = new ImageIcon(newImage);
		
		JLabel wktAddedLabel = new JLabel("Workout Added!");
		wktAddedLabel.setForeground(SystemColor.window);
		wktAddedLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton backHomeButton = new JButton("Back to Home");
		
		
		GroupLayout groupLayout = new GroupLayout(workoutAddedFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(wktAddedLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(78)
							.addComponent(backHomeButton, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(276)
					.addComponent(wktAddedLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(backHomeButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(44))
		);
		workoutAddedFrame.getContentPane().setLayout(groupLayout);
		workoutAddedFrame.setBounds(100, 100, 295, 475);
		workoutAddedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
