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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class MenuWindow {

	private JFrame frmWin;

	/**
	 * Launch the application.
	 */
	public static void displayMenuWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindow window = new MenuWindow();
					window.frmWin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWin = new JFrame();
		frmWin.setTitle("Win");
		frmWin.getContentPane().setBackground(SystemColor.textHighlight);
		
		JButton btnHome = new JButton("Home");
		
		JButton btnNewButton = new JButton("Profile");
		
		JButton btnNewButton_1 = new JButton("Stats");
		
		JButton btnNewButton_2 = new JButton("Goals");
		
		JButton btnNewButton_3 = new JButton("Workouts");
		
		JButton btnNewButton_4 = new JButton("Settings");
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout groupLayout = new GroupLayout(frmWin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(123)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addComponent(btnHome)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(btnNewButton_1)
							.addComponent(btnNewButton_2)))
					.addContainerGap(79, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(202, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btnHome)
					.addGap(33)
					.addComponent(btnNewButton)
					.addGap(32)
					.addComponent(btnNewButton_1)
					.addGap(32)
					.addComponent(btnNewButton_2)
					.addGap(27)
					.addComponent(btnNewButton_3)
					.addGap(28)
					.addComponent(btnNewButton_4)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
		);
		
		JLabel lblLougout = new JLabel("Logout");
		lblLougout.setForeground(SystemColor.text);
		lblLougout.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AnaJacqueline\\Pictures\\userSmallPicture.PNG"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLougout, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addGap(146)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLougout, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		frmWin.getContentPane().setLayout(groupLayout);
		frmWin.setBounds(100, 100, 297, 475);
		frmWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
