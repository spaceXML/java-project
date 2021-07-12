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
		//setTitle은 맨위창에 text를 꾸밀수있다.
		frame.setBounds(100, 100, 800, 600);
								//가로  세로  크기 지정
		frame.setLocationRelativeTo(null);
		//화면을 중앙으로 무조건 보여지게 한다.
		frame.setResizable(false);
	    //화면의 사이즈를 변경할수없게 한다.
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel endPage = new JPanel();
		endPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(endPage);
		endPage.setLayout(null);
		
		JButton btnBefore = new JButton("Go to Last");
		btnBefore.setFont(new Font("휴먼엑스포", Font.BOLD, 46));
		btnBefore.setBounds(432, 75, 323, 384);
		endPage.add(btnBefore);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnNext = new JButton("Go to NEXT");
		btnNext.setFont(new Font("휴먼엑스포", Font.PLAIN, 38));
		btnNext.setBounds(52, 73, 323, 384);
		startPage.add(btnNext);
		
		endPage.setVisible(false);
		//endPage를 안보이게 하고 btnNext을 보이게하는것
		
		btnNext.addActionListener(new ActionListener() {
			
			@Override ////next 페이지를 눌렀을때 endpage로 가게 되는 명령어 흠..
			public void actionPerformed(ActionEvent e) {
				endPage.setVisible(true);
				startPage.setVisible(false);
				//next 페이지를 눌렀을때 endpage로 가게 되는 명령어 흠..
				
			}
		});
		
		
		btnBefore.addActionListener(new ActionListener() {
			
			@Override//endPage를 안보이게 하고 btnNext을 보이게하는것 의 반대로써
					// 서로 버튼을 누르면 이동하게끔 만들게되었다.
			
			public void actionPerformed(ActionEvent e) {
				startPage.setVisible(true); //스타트페이지를 보여지게 하라
				endPage.setVisible(false); // endpage 막기 
				
				
			}
		});
		
		
		
	}
	
}
