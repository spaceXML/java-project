package Javasolak;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel2 extends JPanel {
	private Image img;
	
	public ImagePanel2(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g) {
		//�г��� �������� �ڵ����� �������� ���
		g.drawImage(img, 0,0,null);
						//x,y ������ 
	}
				
			
			
}
public class six {
	public static void main(String[] args) {
	JFrame	frame = new JFrame("six");
	frame.setSize(640,480);
	frame.setLocationRelativeTo(null);
	// â ������ ����� �������� �ϱ�
	frame.setVisible(true);
	//setVisible �� �־�� â�� ����, ���ʱ���
	
	ImagePanel2 panel = new ImagePanel2(new ImageIcon("./image/righting.jpg").getImage());
						//righting.jpg").getImage()); �̹��� �������� 
	
	
	
// ������ ��ΰ� �´��� Ȯ���ϱ� ���� �̱��� ���� f11������ exists�� ���´�.
//	File f = new File("./image/righting.jpg");
//	System.out.println(f.exists()?"Exists":"doesnt exists");
//	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	frame.pack();
	//pack�� ���� �׸��� �������� 
//	  pack�� �Ⱦ��� �׸��� �Ⱥ�������.
	
	
	}


}
