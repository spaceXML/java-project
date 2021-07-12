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
						// JFrame 컨트롤 쉬프트 오 로 상속 
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password: ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		//JPasswordField를 사용하여 비밀번호 **** 표시
		JButton logBt =new JButton("Log In");

		
		
		
		panel.add(label);
		//JLabel label = new JLabel("ID");과 연동
		panel.add(txtID);	
		//JTextField texID = new JTextField(10);과 연동
		panel.add(pswrd);
		//JLabel pswrd = new JLabel("Password: ");과 연동
		panel.add(txtPass);
		//JPasswordField txtPass = new JPasswordField(10);과 연동
		panel.add(logBt);
		// 아이디 패스워드 옆에 Login 버튼이 생성
		
		logBt.addActionListener(new ActionListener() {
			// ActionListener를 사용함으로써 박스상자 안에 옵션 넣기가 가능해진다.
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "sol";
				String pass = "1234";
					
				//로그인 yes,
				if(id.equals(txtID.getText()) &&pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "You have a successfully in come to join us");
					//로그인에 성공하였을경우 getText는 받지않고 , 
					//로그인문로구는"You have a successfully in come to join us"로 보여진다.
				} else {
					//로그인 no,
					JOptionPane.showMessageDialog(null, "You failed to log no Succesfully , Thank you.");
					
					//로그인이 안될시에 "You failed to log no Succesfully , Thank you." 문구가 발생된다.
				}
			}
		});
		
		
		
		
//		-------이 선위로는 panel.add() 위에 단어와 연결되는부분
		
		
		add(panel);
		//JPanel panel = new JPanel(); 과 연동
		
		setVisible(true);
		setSize(600,400);
		//로그인 싸이즈 (600,400)
		setLocationRelativeTo(null);
		// 창을 가운데로 무조건 실행되는문장
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new LogIn();
	}
	
}
