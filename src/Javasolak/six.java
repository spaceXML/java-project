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
		//패널을 열었을때 자동으로 비춰지는 기능
		g.drawImage(img, 0,0,null);
						//x,y 시작점 
	}
				
			
			
}
public class six {
	public static void main(String[] args) {
	JFrame	frame = new JFrame("six");
	frame.setSize(640,480);
	frame.setLocationRelativeTo(null);
	// 창 생성시 가운데로 보여지게 하기
	frame.setVisible(true);
	//setVisible 이 있어야 창을 생성, 최초구현
	
	ImagePanel2 panel = new ImagePanel2(new ImageIcon("./image/righting.jpg").getImage());
						//righting.jpg").getImage()); 이미지 가져오기 
	
	
	
// 파일의 경로가 맞는지 확인하기 위해 이글을 쓰고 f11누르면 exists가 나온다.
//	File f = new File("./image/righting.jpg");
//	System.out.println(f.exists()?"Exists":"doesnt exists");
//	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	frame.pack();
	//pack을 쓰면 그림이 보여지고 
//	  pack을 안쓰면 그림이 안보여진다.
	
	
	}


}
