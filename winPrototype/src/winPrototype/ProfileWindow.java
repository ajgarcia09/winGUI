package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileWindow {

	private JFrame frmWin;
	private final JLabel lblProfile = new JLabel("Profile");

	//Launch the application.
	public static void displayProfileWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProfileWindow window = new ProfileWindow();
					window.frmWin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	public ProfileWindow() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		frmWin = new JFrame();
		frmWin.setTitle("Win");
		frmWin.getContentPane().setBackground(SystemColor.textHighlight);
		lblProfile.setFont(new Font("Tahoma", Font.BOLD, 16));

		JButton btnSettings = new JButton("Menu");
		btnSettings.addActionListener(new ActionListener() {
			/*actionPerformed()creates a new object
			of the class MenuWindow, which pops up a 
			new window upon the user clicking on btnSettings*/
			public void actionPerformed(ActionEvent e) {
				MenuWindow showMenu = new MenuWindow();
				showMenu.displayMenuWindow();
			}
		});

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\AnaJacqueline\\Pictures\\userProfileSample.PNG"));
		GroupLayout groupLayout = new GroupLayout(frmWin.getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(lblProfile, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
										.addComponent(btnSettings))
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSettings)
								.addComponent(lblProfile, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(27, Short.MAX_VALUE))
				);
		frmWin.getContentPane().setLayout(groupLayout);
		frmWin.setBounds(100, 100, 297, 475);
		frmWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
