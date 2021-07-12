package Javasolak;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Three {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Three window = new Three();
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
	public Three() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 15));
		btnNewButton.setBounds(279, 58, 130, 133);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Log In Form");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(41, 22, 191, 77);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(94, 84, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(38, 87, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
