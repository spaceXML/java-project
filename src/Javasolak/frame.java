package Javasolak;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame ();
		JPanel panel = new JPanel ();
		JLabel label = new JLabel("Some text");
		JButton btnl = new JButton("Click Me!:" );
		JButton btn2 = new JButton("Exit");    //��ư ����2��
		JTextArea txtArea = new JTextArea();
		panel.setLayout(new BorderLayout());
		JTextField txtField = new JTextField(200);
		//���� ���� �������ؼ�
		JPanel btnPanel = new JPanel();
		panel.setLayout(new BorderLayout());
		//���� ����� ���� �� ����� ��ɾ�
		
	
		btnPanel.add(btnl);
		btnPanel.add(btn2);//��ư ����2��
		panel.add(label, BorderLayout.NORTH);
//							�۾��� ��ġ . ���� ���� ���� 
		panel.add(btnPanel, BorderLayout.WEST);
		//panel.add(btnl, BorderLayout.WEST); ū ��ư���� 
		
//		Jpanel btnPanel = new JPanel();
//		panel.add(btnPanel, BorderLayout.WEST); �����ؼ� ��ư�� ����� �ؽ�Ʈ���ڷ� ����.
		
		
//		�ؽ�Ʈ ���ڷ� �ٲٱ� ���� 
		
		panel.add(txtArea, BorderLayout.CENTER);
							//�̰ɾ��� BorderLayout /txtArea �� ����� ���Եǰ�
			
		frame.add(panel);
		// 1.panel�� ���� �ϳ� ������ �۵������ʴ´�.
		// 2.�ؿ� add�� �����ؼ� ���� ��ߵȴ�.
		// 3. ���� �г��� ����� "��Ʈ��+����Ʈ+o�� ����Ʈ �ø���"�� �ؾ����� �۵�����
		
		
		
//		panel.add(new JLabel ("welcome this is ={::S::O::L::}= Hello Wolrd"));
		 // JLabel  panel.add(txtArea, BorderLayout.CENTER); 
//		 �̺κ��� ���� ���� sol Hello Wolrd �� ��������
//		  some text �� �������� �����Ҽ��ִ�.
	
		
		
		
		
		
		frame.setResizable(false);
				//���α׷��� ������ ũ���ϱ� ��ũ���ϱ� �����ϰԸ����  âũ��
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		//��ưũ��					//������ ũ��, �������� ũ�� 
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
				//� ��ġ���� �� ���α׷��� �����Ұ��ΰ�, null�� ���ÿ� �����ǰ������ ��µȴ�.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//���α׷� x ǥ�� ������ ������ ������ ������.
				
		btnl.addActionListener(new ActionListener() {
			
			@Override  //��ư1�� ���� ��ɿ� Ŭ���� �����߰�
			public void actionPerformed(ActionEvent e) {
				label.setText(txtArea.getText());
				
				// ActionListener�� ����Ͽ� ��ư�� ����� �߰��Ҽ��ִ�.
//				txtArea.append("You are so amazing\n");
						//append Ŭ���Ҷ����� ""�� ������ ��µȴ�.
											// /n�� �ƴϰ� \n �ٹٲ��̳� ��
//				txtArea.append("You are so amazing\n");
//				���� "You are so amazing\n"�� ǥ���ߴ������� �����Ѵ�.
				
//				label.setText(txtArea.getText());
//				�� ���Ƿν� ActionListener�� �ؽ�Ʈ���ڿ� �������� �ױ���
				
				
			}
		}); //�������̵��Ǹ� /); ���� ǥ��?? ����
		
		btn2.addActionListener(new ActionListener() {
			
			@Override //��ư2�� ���� ��ɿ� Ŭ���� �����߰� 
//						exit ������ �����Ű�� ��ư������ �߰��Ͽ����ϴ�.
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}

}
