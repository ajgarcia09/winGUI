package winPrototype;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.SystemColor;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

public class WelcomeScreen {

	private JFrame homeFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen window = new WelcomeScreen();
					window.homeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		homeFrame = new JFrame();
		homeFrame.setBounds(100, 100, 295, 475);
		homeFrame.getContentPane().setBackground(UIManager.getColor("textHighlight"));
		homeFrame.getContentPane().setLayout(null);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Label welcomeLabel = new Label("Home");
		welcomeLabel.setForeground(SystemColor.window);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		welcomeLabel.setBounds(89, 10, 130, 75);
		homeFrame.getContentPane().add(welcomeLabel);

		JLabel graphLabel = new JLabel("New label");
		graphLabel.setIcon(new ImageIcon("C:\\Users\\AnaJacqueline\\Pictures\\userPieChart.PNG"));
		graphLabel.setBounds(34, 91, 201, 120);
		homeFrame.getContentPane().add(graphLabel);

		JButton menuButton = new JButton("Menu");
		menuButton.setBounds(10, 10, 49, 44);
		homeFrame.getContentPane().add(menuButton);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\menu-icon.png");
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 59, 44,  java.awt.Image.SCALE_SMOOTH ) ;  
		icon = new ImageIcon( newimg );
		menuButton.setIcon(new ImageIcon(WelcomeScreen.class.getResource("/winPrototype/menu-icon.png")));

		JButton logActivityButton = new JButton("Log Activity");
		logActivityButton.setIcon(new ImageIcon(WelcomeScreen.class.getResource("/winPrototype/plusButtonOrange.png")));
		logActivityButton.setBounds(192, 359, 77, 66);
		homeFrame.getContentPane().add(logActivityButton);
	}
}
