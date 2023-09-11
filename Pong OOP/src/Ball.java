import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int x, y;  	//position
	private int vx, vy; //velocity
	private int size; 	//width
	private Color ballColor;
	
	public Ball() {
		x = 390;
		y = 390; 
		vx = 0;
		vy = 0;
		size = 20;
		ballColor = Color.cyan;
	}
	
	public Ball(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}

	public Color getBallColor() {
		return ballColor;
	}

	public void setBallColor(Color ballColor) {
		this.ballColor = ballColor;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void paint(Graphics g) {
		update();
		g.setColor(ballColor);
		g.fillOval(x, y, size, size);
		
	}
	/**
	 * Update the x and y variables
	 */
	public void update() {
		//update position
		//how?
		x += vx;
		y += vy;
		
		
		
		
	}
	
	
	
}
