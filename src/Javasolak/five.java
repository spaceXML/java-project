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
//			// a������,b����(���� ��ܹ� �̸�)
		String[] headings = new String[] { "Id", "Name", "Country"};
			// �÷��� 3�� id", "Name", "Country"
		Object [] [] data = new Object[] [] {
			{"1", "Daniel", "Korea"},
			{"2", "Sunny", "France"},
			{"3", "John" , "Japan"}
			
		};
		//-----------------------���� ���̺� �� ������ ���±��� --------------
		
		JTable table = new JTable(data, headings);
								// ���� String[] headdings
								//  Object [] [] data 
								// ������ , ����
		
		table.setPreferredScrollableViewportSize(new Dimension(700,600));
		// ǥ�� �������� ������ ũ��
		table.setFillsViewportHeight(true);
		// //�����̳��� ��ü ���̸� ���̺��� ���� ����ϵ��� �����Ѵ�.
		
		
								
		
		//-----------------------���� �������̵� ��ɾ� --------------
		
		panel.add(table);
		//����
		frame.add(panel);
		panel.add(new JScrollPane(table));
		// J
		
		//-----------------------���� ���̺� ��ɾ� --------------
		
		
		
		
		frame.setVisible(true);
		frame.setSize(800,640);
		frame.setLocationRelativeTo(null);
		//setLocationRelativeTo ����� ������ ����Ǳ� �߾�����Ʈ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										//JFrame.��Ʈ���ֱ� = Table Prac.
	}

}
