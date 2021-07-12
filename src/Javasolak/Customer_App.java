package Javasolak;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Customer_App {

	private JFrame frame;
	private JTextField id;
	private JPasswordField password;
	private JTextField name;
	private JTextField age;
	private JTextField phone;
	private JTextField gender;
	private JTextField search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_App window = new Customer_App();
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
	public Customer_App() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Customer customer = new Customer();
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		//�����ν� �г��� ����Ҽ��ִ�.
		
		
		

		ImagePanel mainPanel = new ImagePanel(new ImageIcon("C:/Java_study/workspace/Javasolak/image/List.PNG").getImage());
		ImagePanel welcomPanel = new ImagePanel(new ImageIcon("C:/Java_study/workspace/Javasolak/image/welcome1.jpg").getImage());
		ImagePanel tablepanel = new ImagePanel(new ImageIcon("C:/Java_study/workspace/Javasolak/image/List.PNG").getImage());
		//JPanel -> imagePanel
		
		frame.getContentPane().add(welcomPanel);
		frame.getContentPane().add(tablepanel);
		mainPanel.setBounds(0, 0, 1008, 667);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		mainPanel.setVisible(true);
//		---------------------------------------------------------------------------------------------����������� frame �̿���.
		
		
		
		//JPanel���� 
		
		//setVisible���� Ʈ�� �޽��� ��â�� ���� �������Բ� �Ҽ��ִ�.
//		������������ ������ 1ù��° ������ �־����� �����ϴ�.
		String[][] data = customer.getCustomers();
		//
		String[] headers = new String[] {"Name","Phone","Gender", "Age","Note"};
		tablepanel.setLayout(null);
		
		JTable table = new JTable(data,headers);
		table.setRowHeight(30);
		table.setFont(new Font("Sanserif",Font.BOLD, 15));
		table.setAlignmentX(0);
		table.setSize(800,500);
		table.setPreferredScrollableViewportSize(new Dimension(800, 500));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(223, 91, 773, 566);
		tablepanel.add(scrollPane);
	
		
		search = new JTextField();
		search.setFont(new Font("����ü", Font.BOLD, 17));
		search.setBounds(223, 26, 773, 55);
		tablepanel.add(search);
		search.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnNewButton_2.setIcon(new ImageIcon("C:\\java_study\\workspace\\Javasolak\\image\\Rister.PNG"));
		btnNewButton_2.setBounds(24, 48, 158, 74);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablepanel.setVisible(false);
				mainPanel.setVisible(true);
			}
		});
		
		
		tablepanel.add(btnNewButton_2);
		search.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String val = search.getText();			
//				�˻���� �߰��ϱ�
				TableRowSorter<TableModel> trs = new TableRowSorter<>(table.getModel());
				table.setRowSorter(trs);//TableRowSorter = new TableRowSorter<> ���⶧���� <>���� �ϸ� �˻�����.
			//  setRowSorter =���̺�� ������ �ȱ�� ��׿�.
				trs.setRowFilter(RowFilter.regexFilter(val));
		         //���̵带 ���� ����Ʈ���ؾߵȴ�..
				
			}
		});
		
		TableColumnModel columnModels = table.getColumnModel();
		//�÷� ũ�� �����ϴ°�
		columnModels.getColumn(0).setPreferredWidth(100);
		columnModels.getColumn(2).setPreferredWidth(50);
		columnModels.getColumn(3).setPreferredWidth(20);
		
		
		
		
		//mainPanel.setVisible ó��ȭ�鿡�� ����â ���������ʰ� ����� ��ɾ�
		
		JLabel lblNewLabel_3 = new JLabel("51Area wellcome to join us .");
		lblNewLabel_3.setFont(new Font("�޸տ�����", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(343, 29, 532, 65);
		mainPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("name");
		lblNewLabel_4.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(178, 107, 173, 71);
		mainPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("age");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_1.setBounds(178, 200, 173, 71);
		mainPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("gender");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_2.setBounds(178, 313, 173, 71);
		mainPanel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("birthday");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_3.setBounds(527, 107, 173, 71);
		mainPanel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("phone\r\n");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_4.setBounds(527, 200, 173, 71);
		mainPanel.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("note");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setFont(new Font("�޸տ�����", Font.PLAIN, 22));
		lblNewLabel_4_5.setBounds(527, 313, 173, 71);
		mainPanel.add(lblNewLabel_4_5);
		
		name = new JTextField();
		name.setBounds(332, 126, 183, 38);
		mainPanel.add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(332, 227, 183, 38);
		mainPanel.add(age);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(692, 126, 183, 38);
		mainPanel.add(phone);
		
		gender = new JTextField();
		gender.setColumns(10);
		gender.setBounds(692, 227, 183, 38);
		mainPanel.add(gender);
		
		JComboBox gender = new JComboBox(new String[] {"Male","Female"});
		gender.setFont(new Font("�޸տ�����", Font.PLAIN, 40));
		gender.setBounds(332, 327, 183, 46);
		mainPanel.add(gender);
		
		JTextArea note = new JTextArea();
		note.setBounds(692, 338, 243, 266);
		note.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		mainPanel.add(note);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
									//getText�� �۾��Ⱑ ����������.
			  String nameTxt = name.getText();
			  String ageTxt = age.getText();
			  String phoneTxt = phone.getText();
			  String genderTxt = gender.getSelectedItem().toString();
			  String noteTxt = note.getText();
			  
				JPanel tablepanel = new JPanel();
				tablepanel.setBounds(0, 0, 1008, 667);
				frame.getContentPane().add(tablepanel);
			  Customer.createCustomer(nameTxt, phoneTxt, genderTxt, ageTxt, noteTxt);
			  JOptionPane.showMessageDialog(null, "Your data has been saved successfully");
			  mainPanel.setVisible(true);
			  //��ư�� ������ â�� �ݰԵǴµ� + �ٸ�â���� ���̱�
			}
		});
		
		
		
		btnNewButton_1.setBounds(336, 517, 310, 64);
		mainPanel.add(btnNewButton_1);
		
		
		
		btnNewButton_1.setBounds(332, 530, 261, 71);
		mainPanel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btnNewButton_3.setIcon(new ImageIcon("C:\\java_study\\workspace\\Javasolak\\image\\Listbutton.PNG"));
		btnNewButton_3.setBounds(40, 164, 126, 137);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mainPanel.setVisible(false);
				tablepanel.setVisible(true);
				//tablepanel ǥ �����Ͱ� �����̴ϱ� ture
				//
			
			}
		});
		
		mainPanel.add(btnNewButton_3);
		
		
		welcomPanel.setBounds(0, 0, 1008, 729);
		
		
		//=-----------------------------------------------
		//�����г����� ��ġ�����ϰ� mainPanel.setVisible(false); ����
		
		welcomPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setFont(new Font("�޸տ�����", Font.BOLD, 40));
		lblNewLabel.setBounds(77, 164, 171, 142);
		welcomPanel.add(lblNewLabel);
		
		id = new JTextField();
		
		
		id.setHorizontalAlignment(SwingConstants.RIGHT);
		//Variable ���� id �� �Ἥ ���밪 ����
		id.setText("ENTER ID");  // �α���â�� "ENTER ID" ǥ��
		id.setToolTipText("ENTER ID");
		id.setBounds(226, 302, 134, 54);
		welcomPanel.add(id);
		id.setColumns(10);
		
		password = new JPasswordField();
		//Variable ���� password �� �Ἥ ���밪 ����
		password.setColumns(10);
		password.setToolTipText("******");
		password.setHorizontalAlignment(SwingConstants.TRAILING);
		password.setBounds(226, 363, 134, 45);
		welcomPanel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("�޸տ�����", Font.BOLD, 40));
		lblNewLabel_1.setBounds(12, 363, 217, 65);
		welcomPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID ");
		lblNewLabel_2.setFont(new Font("�޸տ�����", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(12, 288, 184, 65);
		welcomPanel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\java_study\\workspace\\Javasolak\\image\\button11.PNG"));
		//�α��ι�ư ������
		btnNewButton.setPressedIcon(new ImageIcon("C:\\java_study\\workspace\\Javasolak\\image\\button11_clicked.jpg"));
		btnNewButton.setBounds(370, 241, 288, 242);
		welcomPanel.add(btnNewButton);
		
	
		
		
		
		// �̹��� �ּҸ� �����ؾ����� Design ���������� ���������Ҽ��ְ� ������ �ڷḦ �۰� �������� �ٲٸ� �����ϴ�.
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			if(id.getText(). equals("51Area")&&Arrays.equals(password.getPassword(),"dr.kim".toCharArray())) {
							//id.getText()= �� 51ARea 
														//
				
				System.out.println("Wellcome to Dr.KIM in 51Area");
				JOptionPane.showMessageDialog(null, "Wellcome to Dr.KIM in 51Area");
				welcomPanel.setVisible(false);
				// �α��� �����ÿ� â�ݱ�
				mainPanel.setVisible(true);
				//�α��� ������ ����â���γѾ��
				//�α��� ������ ���з� �����ϰԸ�����ִºκ�.
				
				
				}else{
					JOptionPane.showMessageDialog(null, "You are not right about input in password");
					
				}
//				if()
			{
				
				}
			}
		});
		
		frame.setLocationRelativeTo(null);
		//ȭ�� ��� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(welcomPanel.getWidth(),welcomPanel.getHeight());
		frame.setResizable(false);
		////âũ�� ���� 2��
		frame.setLocationRelativeTo(null); 
		// â �߾Ӱ��� ��ɾ�
		frame.setJMenuBar(menuBar());
//		1.âx ǥ�� ������� �����ӿ� �޴���()�� ���� 
		
//		�ؿ� {} �� 
//		2.public JMenuBar menuBar() {
//			JMenuBar bar = new JMenuBar();
//			
//			return bar; 
	
	}
	
	public JMenuBar menuBar() {
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		//file ��â���
		JMenu aboutJMenu = new JMenu("About");
		//about ��â���
		bar.add(fileMenu);
		bar.add(aboutJMenu);
		
		JMenuItem openfile = new JMenuItem("Open"); 
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(openfile);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		//file ��â���
		//open exit 
		
		exit.addActionListener(new ActionListener() {
					//addActionListener (Ÿ��ActionListener)������
//									�ڵ����� �������̵���.
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				// exit���� 0���� ���� Ŭ���� â�� ������.
			}
		});
		
		return bar;
		
	}
}

class ImagePanel extends JPanel {
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
					//âũ�� ���� 1��
	}
	
	
	
	public void paintComponent(Graphics g) {
		//�г��� �������� �ڵ����� �������� ���
		g.drawImage(img, 0,0,null);
						//x,y ������ 
	}
				
			
			
}