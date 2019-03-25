package ch2;

import java.awt.*;
import javax.swing.*;

// 画同心圆
public class CircleFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame frame = new CircleFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString("CircleFrame", 20, 20);
		
		int x0 = getSize().width/2;
		int y0 = getSize().height/2;
		
		for(int r=0; r<getSize().width/2; r+=10) {
			g.setColor( getRandomColor() );
			g.drawOval(x0-r, y0-r, r*2, r*2);
		}
	}
	
	Color getRandomColor() {
		int r = (int) (Math.random()*256);
		int g = (int) (Math.random()*256);
		int b = (int) (Math.random()*256);
		return new Color(r, g, b);
	}
}
