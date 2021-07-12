package Javasolak;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class four4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					four4 window = new four4();
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
	public four4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Sol a.k.a");
		//setTitle�� ����â�� text�� �ٹм��ִ�.
		frame.setBounds(100, 100, 800, 600);
								//����  ����  ũ�� ����
		frame.setLocationRelativeTo(null);
		//ȭ���� �߾����� ������ �������� �Ѵ�.
		frame.setResizable(false);
	    //ȭ���� ����� �����Ҽ����� �Ѵ�.
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel endPage = new JPanel();
		endPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(endPage);
		endPage.setLayout(null);
		
		JButton btnBefore = new JButton("Go to Last");
		btnBefore.setFont(new Font("�޸տ�����", Font.BOLD, 46));
		btnBefore.setBounds(432, 75, 323, 384);
		endPage.add(btnBefore);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnNext = new JButton("Go to NEXT");
		btnNext.setFont(new Font("�޸տ�����", Font.PLAIN, 38));
		btnNext.setBounds(52, 73, 323, 384);
		startPage.add(btnNext);
		
		endPage.setVisible(false);
		//endPage�� �Ⱥ��̰� �ϰ� btnNext�� ���̰��ϴ°�
		
		btnNext.addActionListener(new ActionListener() {
			
			@Override ////next �������� �������� endpage�� ���� �Ǵ� ��ɾ� ��..
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(true);
				startPage.setVisible(false);
				//next �������� �������� endpage�� ���� �Ǵ� ��ɾ� ��..
				
			}
		});
		
		
		btnBefore.addActionListener(new ActionListener() {
			
			@Override//endPage�� �Ⱥ��̰� �ϰ� btnNext�� ���̰��ϴ°� �� �ݴ�ν�
					// ���� ��ư�� ������ �̵��ϰԲ� ����ԵǾ���.
			
			public void actionPerformed(ActionEvent e) {
				startPage.setVisible(true); //��ŸƮ�������� �������� �϶�
				endPage.setVisible(false); // endpage ���� 
				
				
			}
		});
		
		
		
	}
	
}
