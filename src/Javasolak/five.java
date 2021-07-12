package Javasolak;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class five {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Prac.");
		JPanel panel = new JPanel();
//		JTable (a,b)
//			// a데이터,b제목(맨위 상단바 이름)
		String[] headings = new String[] { "Id", "Name", "Country"};
			// 컬럼값 3줄 id", "Name", "Country"
		Object [] [] data = new Object[] [] {
			{"1", "Daniel", "Korea"},
			{"2", "Sunny", "France"},
			{"3", "John" , "Japan"}
			
		};
		//-----------------------위에 테이블에 들어갈 내용을 적는구간 --------------
		
		JTable table = new JTable(data, headings);
								// 위에 String[] headdings
								//  Object [] [] data 
								// 데이터 , 제목
		
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		// 표를 보았을때 사이즈 크기
		table.setFillsViewportHeight(true);
		// //컨테이너의 전체 높이를 테이블이 전부 사용하도록 설정한다.
		
		
								
		
		//-----------------------위에 오버라이딩 명령어 --------------
		
		panel.add(table);
		//위에
		frame.add(panel);
		panel.add(new JScrollPane(table));
		// J
		
		//-----------------------위에 테이블 명령어 --------------
		
		
		
		
		frame.setVisible(true);
		frame.setSize(800,640);
		frame.setLocationRelativeTo(null);
		//setLocationRelativeTo 가운데로 무조건 실행되기 중앙포인트
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										//JFrame.인트값넣기 = Table Prac.
	}

}
