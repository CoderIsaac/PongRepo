import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	private int x, y;  			//position
	private int vx, vy; 		//velocity
	private int w, h; 			//width, height
	private Color paddleColor;
	
	public Paddle() {
		x = 0;
		y = 0; 
		vx = 0;
		vy = 0;
		w = 20;
		h = 100;
		paddleColor = Color.cyan;
	}
	
	public Paddle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public Color getPaddleColor() {
		return paddleColor;
	}

	public void setPaddleColor(Color c) {
		this.paddleColor = c;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVx() {
		return vx;
	}

	public void setVx(int vx) {
		this.vx = vx;
	}

	public int getVy() {
		return vy;
	}

	public void setVy(int vy) {
		this.vy = vy;
	}


	
	public void paint(Graphics g) {
		update();
		g.setColor(paddleColor);		
		g.fillRect(x, y, w, h);
		
	}
	/**
	 * Update the x and y variables
	 */
	public void update() {
		x += vx;
		y += vy;
		
		
	}
	
	
	
}
