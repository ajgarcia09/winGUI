package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuWindow {

	private JFrame menuFrame;

	//Launch the application.
	public static void displayMenuWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindow window = new MenuWindow();
					window.menuFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Create the application.
	public MenuWindow() {
		initialize();
	}

	//Initialize the contents of the frame
	private void initialize() {
		menuFrame = new JFrame();
		menuFrame.setTitle("Win");
		menuFrame.getContentPane().setBackground(SystemColor.textHighlight);

		JButton homeButton = new JButton("Home");
		/**take user back to homepage
		 * 
		 */
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreen homeScreen = new HomeScreen();
				homeScreen.displayHomeScreen();
			}
		});
		homeButton.setBounds(108, 61, 79, 23);

		JButton profileButton = new JButton("Profile");
		/**take user to the profile window
		 * 
		 */
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfileScreen profileScreen = new ProfileScreen();
				profileScreen.displayProfileScreen();
			}
		});
		profileButton.setBounds(108, 110, 79, 23);

		JButton goalssButton = new JButton("Set Goals");
		goalssButton.setBounds(87, 161, 101, 23);

		JButton remindersButton = new JButton("Set Reminders");
		remindersButton.setBounds(87, 209, 118, 23);

		JButton btnNewButton_3 = new JButton("Workouts");
		btnNewButton_3.setBounds(87, 261, 111, 23);

		JButton btnNewButton_4 = new JButton("Settings");
		btnNewButton_4.setBounds(93, 307, 94, 23);

		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(10, 0, 69, 35);
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMenu.setForeground(SystemColor.text);
		menuFrame.getContentPane().setLayout(null);
		
		JButton menuButton = new JButton("");
		menuButton.setBounds(231, 10, 38, 36);
		menuFrame.getContentPane().add(menuButton);
		/**scale menu stripes icon into the 
		 * size of the menuButton
		 */
		ImageIcon menuIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\menu-icon.png");
		Image menuImg = menuIcon.getImage();
		Image resizedMenu = menuImg.getScaledInstance(menuButton.getWidth(), menuButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedMenuIcon = new ImageIcon(resizedMenu);
		menuButton.setIcon(resizedMenuIcon);

		JLabel lblLougout = new JLabel("Logout");
		lblLougout.setBounds(133, 390, 69, 35);
		lblLougout.setForeground(SystemColor.text);
		lblLougout.setFont(new Font("Tahoma", Font.BOLD, 16));
		menuFrame.getContentPane().add(lblLougout);
		menuFrame.getContentPane().add(profileButton);
		menuFrame.getContentPane().add(homeButton);
		menuFrame.getContentPane().add(btnNewButton_3);
		menuFrame.getContentPane().add(btnNewButton_4);
		menuFrame.getContentPane().add(goalssButton);
		menuFrame.getContentPane().add(remindersButton);
		menuFrame.getContentPane().add(lblMenu);
		
		JButton logoutButton = new JButton("");
		/**takes user back to the log in window
		 * 
		 */
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WinLoginWindow logWindow = new WinLoginWindow();
				logWindow.displayWinLoginWindow();
		
			}
		});
		logoutButton.setBounds(231, 389, 38, 36);
		menuFrame.getContentPane().add(logoutButton);
		menuFrame.setBounds(100, 100, 297, 475);
		ImageIcon outIcon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\logoutIcon.png");
		Image outImg = outIcon.getImage();
		Image resizedOut = outImg.getScaledInstance(logoutButton.getWidth(), logoutButton.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon resizedOutIcon = new ImageIcon(resizedOut);
		logoutButton.setIcon(resizedOutIcon);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
