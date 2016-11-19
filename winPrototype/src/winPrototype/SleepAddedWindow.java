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

public class SleepAddedWindow {

	private JFrame sleepAddedFrame;

	/**
	 * Launch the application.
	 */
	public static void displaySleepAddedwindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SleepAddedWindow window = new SleepAddedWindow();
					window.sleepAddedFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SleepAddedWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		sleepAddedFrame = new JFrame();
		sleepAddedFrame.getContentPane().setBackground(SystemColor.textHighlight);
//		ImageIcon imageIcon = new ImageIcon("/winPrototype/checkMark_smaller.png");
//		Image image = imageIcon.getImage();
//		Image newImage = image.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
//		imageIcon = new ImageIcon(newImage);
		
		JLabel sleepAddedLabel = new JLabel("Sleep Added!");
		sleepAddedLabel.setForeground(SystemColor.window);
		sleepAddedLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JButton backHomeButton = new JButton("Back to Home");
		
		
		GroupLayout groupLayout = new GroupLayout(sleepAddedFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(sleepAddedLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(78)
							.addComponent(backHomeButton, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(276)
					.addComponent(sleepAddedLabel)
					.addGap(46)
					.addComponent(backHomeButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		sleepAddedFrame.getContentPane().setLayout(groupLayout);
		sleepAddedFrame.setBounds(100, 100, 295, 475);
		sleepAddedFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
