package Javasolak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogIn extends JFrame{
						// JFrame ��Ʈ�� ����Ʈ �� �� ��� 
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password: ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		//JPasswordField�� ����Ͽ� ��й�ȣ **** ǥ��
		JButton logBt =new JButton("Log In");

		
		
		
		panel.add(label);
		//JLabel label = new JLabel("ID");�� ����
		panel.add(txtID);	
		//JTextField texID = new JTextField(10);�� ����
		panel.add(pswrd);
		//JLabel pswrd = new JLabel("Password: ");�� ����
		panel.add(txtPass);
		//JPasswordField txtPass = new JPasswordField(10);�� ����
		panel.add(logBt);
		// ���̵� �н����� ���� Login ��ư�� ����
		
		logBt.addActionListener(new ActionListener() {
			// ActionListener�� ��������ν� �ڽ����� �ȿ� �ɼ� �ֱⰡ ����������.
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "sol";
				String pass = "1234";
					
				//�α��� yes,
				if(id.equals(txtID.getText()) &&pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "You have a successfully in come to join us");
					//�α��ο� �����Ͽ������ getText�� �����ʰ� , 
					//�α��ι��α���"You have a successfully in come to join us"�� ��������.
				} else {
					//�α��� no,
					JOptionPane.showMessageDialog(null, "You failed to log no Succesfully , Thank you.");
					
					//�α����� �ȵɽÿ� "You failed to log no Succesfully , Thank you." ������ �߻��ȴ�.
				}
			}
		});
		
		
		
		
//		-------�� �����δ� panel.add() ���� �ܾ�� ����Ǵºκ�
		
		
		add(panel);
		//JPanel panel = new JPanel(); �� ����
		
		setVisible(true);
		setSize(600,400);
		//�α��� ������ (600,400)
		setLocationRelativeTo(null);
		// â�� ����� ������ ����Ǵ¹���
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new LogIn();
	}
	
}
