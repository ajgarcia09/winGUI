package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Color;

public class UserStats {

	private JFrame frmWin;

	/**
	 * Launch the application.
	 */
	public static void displayStatsWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserStats window = new UserStats();
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
	public UserStats() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWin = new JFrame();
		frmWin.getContentPane().setBackground(SystemColor.textHighlight);
		frmWin.setBackground(new Color(51, 153, 255));
		frmWin.setTitle("Win");
		frmWin.setBounds(100, 100, 297, 475);
		frmWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Week");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblSeptember = new JLabel("September");
		lblSeptember.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel label = new JLabel("2016");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel userPieChart = new JLabel("");
		userPieChart.setIcon(new ImageIcon("C:\\Users\\AnaJacqueline\\Pictures\\userPieChart.PNG"));
		
		JButton btnNewButton = new JButton("View My Profile");
		GroupLayout groupLayout = new GroupLayout(frmWin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblSeptember)
								.addContainerGap())
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(btnNewButton)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel)
										.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
										.addComponent(lblMonth, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
										.addGap(38)
										.addComponent(lblYear, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)))
								.addGap(19)))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(userPieChart, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblYear)
						.addComponent(lblMonth))
					.addGap(18)
					.addComponent(lblSeptember)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label)
					.addGap(18)
					.addComponent(userPieChart, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
					.addComponent(btnNewButton)
					.addGap(23))
		);
		frmWin.getContentPane().setLayout(groupLayout);
	}
}
