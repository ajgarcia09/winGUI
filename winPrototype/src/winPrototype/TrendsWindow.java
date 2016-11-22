package winPrototype;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JTable;

public class TrendsWindow {

	private JFrame trendsFrame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrendsWindow window = new TrendsWindow();
					window.trendsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TrendsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		trendsFrame = new JFrame();
		trendsFrame.setBounds(100, 100, 295, 475);
		trendsFrame.getContentPane().setBackground(SystemColor.textHighlight);
		trendsFrame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(157, 311, -90, -120);
		trendsFrame.getContentPane().add(table);
		trendsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
