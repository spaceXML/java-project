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
		JButton btn2 = new JButton("Exit");    //버튼 순서2번
		JTextArea txtArea = new JTextArea();
		panel.setLayout(new BorderLayout());
		JTextField txtField = new JTextField(200);
		//많은 글을 쓰기위해서
		JPanel btnPanel = new JPanel();
		panel.setLayout(new BorderLayout());
		//글을 가운데로 쓰게 끔 만드는 명령어
		
	
		btnPanel.add(btnl);
		btnPanel.add(btn2);//버튼 순서2번
		panel.add(label, BorderLayout.NORTH);
//							글씨의 위치 . 왼쪽 위로 쓰기 
		panel.add(btnPanel, BorderLayout.WEST);
		//panel.add(btnl, BorderLayout.WEST); 큰 버튼에서 
		
//		Jpanel btnPanel = new JPanel();
//		panel.add(btnPanel, BorderLayout.WEST); 연동해서 버튼을 지우고 텍스트상자로 쓴다.
		
		
//		텍스트 상자로 바꾸기 위해 
		
		panel.add(txtArea, BorderLayout.CENTER);
							//이걸쓰면 BorderLayout /txtArea 가 가운데에 쓰게되고
			
		frame.add(panel);
		// 1.panel이 따로 하나 잇으면 작동하지않는다.
		// 2.밑에 add로 연동해서 같이 써야된다.
		// 3. 뉴로 패널을 만들고 "컨트롤+쉬프트+o로 임폴트 올리기"를 해야지만 작동가능
		
		
		
//		panel.add(new JLabel ("welcome this is ={::S::O::L::}= Hello Wolrd"));
		 // JLabel  panel.add(txtArea, BorderLayout.CENTER); 
//		 이부분을 통해 위로 sol Hello Wolrd 을 쓸것인지
//		  some text 를 쓸것인지 설정할수있다.
	
		
		
		
		
		
		frame.setResizable(false);
				//프로그램을 조절할 크게하기 안크게하기 가능하게만드는  창크기
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840/12*9));
		//버튼크기					//왼쪽의 크기, 오른쪽의 크기 
		frame.setSize(840, 840/12*9);
		frame.setLocationRelativeTo(null);
				//어떤 위치에서 이 프로그램을 실행할것인가, null을 쓸시에 무조건가운데에서 출력된다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//프로그램 x 표를 누를때 모든실행 파일이 꺼진다.
				
		btnl.addActionListener(new ActionListener() {
			
			@Override  //버튼1의 내용 기능에 클릭시 내용추가
			public void actionPerformed(ActionEvent e) {
				label.setText(txtArea.getText());
				
				// ActionListener를 사용하여 버튼의 기능을 추가할수있다.
//				txtArea.append("You are so amazing\n");
						//append 클릭할때마다 ""의 내용이 출력된다.
											// /n가 아니고 \n 줄바꿈이네 흠
//				txtArea.append("You are so amazing\n");
//				으로 "You are so amazing\n"를 표시했던내용을 수정한다.
				
//				label.setText(txtArea.getText());
//				을 쓰므로써 ActionListener의 텍스트상자에 글을쓸때 그글이
				
				
			}
		}); //오버라이딩되면 /); 으로 표시?? 뭐지
		
		btn2.addActionListener(new ActionListener() {
			
			@Override //버튼2의 내용 기능에 클릭시 내용추가 
//						exit 누르면 종료시키는 버튼내용을 추가하엿습니다.
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
	}

}
