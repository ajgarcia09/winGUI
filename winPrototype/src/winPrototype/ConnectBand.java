package winPrototype;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ConnectBand {

	private JFrame connectBandFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConnectBand window = new ConnectBand();
					window.connectBandFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConnectBand() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		connectBandFrame = new JFrame();
		connectBandFrame.setBounds(100, 100, 295, 475);
		connectBandFrame.getContentPane().setBackground(SystemColor.textHighlight);
		connectBandFrame.getContentPane().setLayout(null);
		connectBandFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Label bandLabel = new Label("Connect Your Fit Band");
		bandLabel.setForeground(SystemColor.window);
		bandLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		bandLabel.setBounds(22, 10, 235, 75);
		connectBandFrame.getContentPane().add(bandLabel);
		
		Label bluetoothLabel = new Label("Make sure your band is charged"
				+ "and Bluetooth on your device is on, then tap Connect Band");
		bluetoothLabel.setForeground(SystemColor.window);
		bluetoothLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		bluetoothLabel.setBounds(10, 64, 261, 60);
		connectBandFrame.getContentPane().add(bluetoothLabel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AnaJacqueline\\Documents\\Adv OOP\\stuffForGUI\\band2.jpg"));
		lblNewLabel.setBounds(26, 130, 231, 208);
		connectBandFrame.getContentPane().add(lblNewLabel);
		
		JButton connectButton = new JButton("Connect Band");
		connectButton.setBounds(88, 349, 106, 35);
		connectBandFrame.getContentPane().add(connectButton);
		
	}
}
