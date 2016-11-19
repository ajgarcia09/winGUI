package winPrototype;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;

public class LogSwimWindow {

	private JFrame logSwimFrame;
	private JTextField swimLengthField;
	private JTextField numLapsField;
	private JLabel numCyclesLabel;
	private JTextField numCyclesField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void displaySwimWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogSwimWindow window = new LogSwimWindow();
					window.logSwimFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogSwimWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		logSwimFrame = new JFrame();
		
		
		JLabel swimLenghLabel = new JLabel("How long was your swim?");
		swimLenghLabel.setForeground(Color.WHITE);
		swimLenghLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		swimLengthField = new JTextField();
		swimLengthField.setColumns(10);
		
		JLabel numLapsLabel = new JLabel("How many km did you run?");
		numLapsLabel.setForeground(Color.WHITE);
		numLapsLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		numLapsField = new JTextField();
		numLapsField.setColumns(10);
		
		numCyclesLabel = new JLabel("How many cycles did you swim?");
		numCyclesLabel.setForeground(Color.WHITE);
		numCyclesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		numCyclesField = new JTextField();
		numCyclesField.setColumns(10);
		
		JButton logSwimButton = new JButton("Log Swim");
		logSwimButton.setBounds(82, 366, 111, 33);
		logSwimFrame.getContentPane().add(logSwimButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LogSwimWindow.class.getResource("/winPrototype/swimIcon.png")));
		
		GroupLayout groupLayout = new GroupLayout(logSwimFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numLapsLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(numLapsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(swimLenghLabel, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
						.addComponent(swimLengthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(numCyclesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(numCyclesLabel, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(22, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(107, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(102))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(swimLenghLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(swimLengthField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(numLapsLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(numLapsField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(numCyclesLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(numCyclesField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		logSwimFrame.getContentPane().setLayout(groupLayout);
		logSwimFrame.setBounds(100, 100, 295, 475);
		logSwimFrame.getContentPane().setBackground(UIManager.getColor("textHighlight"));
		logSwimFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
