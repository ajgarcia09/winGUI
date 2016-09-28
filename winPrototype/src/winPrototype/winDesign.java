package winPrototype;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.Label;

public class winDesign {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winDesign window = new winDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public winDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 297, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Get Started");
		btnNewButton.setBounds(82, 322, 111, 33);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(67, 232, 145, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 291, 145, 20);
		frame.getContentPane().add(passwordField);
		
		Label label = new Label("Username");
		label.setBounds(67, 204, 62, 22);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Password");
		label_1.setBounds(67, 263, 62, 22);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("Win");
		label_2.setBounds(31, 34, 62, 22);
		frame.getContentPane().add(label_2);
	}
}
