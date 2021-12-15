//import javax.management.timer.Timer;
import javax.swing.Timer;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class PongPanel extends JPanel implements ActionListener, KeyListener{
	
	private final static Color BACKGROUND_COLOR = Color.BLACK;
	private final static int TIMER_DELAY = 5;
	
	public PongPanel() {
		setBackground(BACKGROUND_COLOR);
		Timer timer = new Timer(TIMER_DELAY, this);
		timer.start();
	}
	
	private void update() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);;
		g.setColor(BACKGROUND_COLOR.WHITE);
		g.fillRect(20, 20, 100, 100);
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		update();
		
	}

}
