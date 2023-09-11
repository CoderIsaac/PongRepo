import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Pong extends Frame {
	Ball ball = new Ball();
	Paddle leftPaddle = new Paddle(10,400,20,100);
	Paddle rightPaddle = new Paddle (770,400,20,100);
	//checks if either key is pressed or not for the paddle up and down movements
	//left paddle
	boolean leftUp = false;
	boolean rightUp = false;
	//right paddle
	boolean leftDown = false;
	boolean rightDown = false;
	//these are the variables for the score
	byte leftScore = 0;
	byte rightScore = 0;
	
	
	
	
	
				
	/* paint is getting called roughly 60x per second */
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 800);
		
		ball.paint(g);
		leftPaddle.paint(g);
		rightPaddle.paint(g);
		//if both keys are not pressed the velocity is set to 0, this makes the movement more smooth than the standard method
		//left paddle
		if(leftUp ==false && rightUp == false) {
			leftPaddle.setVy(0);
		}
		//right paddle
		if(leftDown ==false && rightDown == false) {
			rightPaddle.setVy(0);
		}
		//these are the methods that i created that always run
		this.ballEdge();
		this.ballEdgeBounce();
		this.rightPaddleBounce();
		this.leftPaddleBounce();
		g.drawString(""+leftScore, 350, 50);
		g.drawString(""+rightScore, 450, 50);

	} //end of paint method
	//this method resets the ball to the middle of the screen
	public void gameReset() {
		ball.setX(390);
		ball.setY(390);
		ball.setVx(0);
		ball.setVy(0);
		}
	//this method checks for if the ball is on either the left or right edge of the screen and adjusts the score accordingly as well as triggering game reset
	public void ballEdge() {
		//left side
		if (ball.getX() <= 0) {
			gameReset();
			rightScore += 1;}
		//right side
		if (ball.getX()>=800-ball.getSize()) {
			System.out.println((ball.getX()>=800-ball.getSize()));
			gameReset();
			leftScore += 1;
		}
		}
	//this method makes the ball bounce when it touches the top or bottom of the screen
	public void ballEdgeBounce() {
		if (ball.getY() <= 0 || ball.getY() >= 800-ball.getSize()) {
			ball.setVy(-ball.getVy());
		}
		
	}
	//this method makes the ball bounce off the right paddle
	public void rightPaddleBounce() {
		//checks if the x coordinates coincide for the paddle and the ball. 
		boolean xContact = false;
		if (ball.getX() >= 770 - ball.getSize()) {
			xContact = true;
		}
		//checks if the y coordinate for the entire range of the ball for the balls falls within the paddle or not, if the x condition is met

		if (xContact) {
			if (ball.getY() + ball.getSize() > rightPaddle.getY() && ball.getY() < rightPaddle.getY() + 100) {
				ball.setVx(-ball.getVx()); }
		}
		
	}
	//this method makes the ball bounce off the left paddle
	public void leftPaddleBounce() {
		//checks if the x coordinates coincide for the paddle and the ball. 
		boolean xContact = false;
		if (ball.getX() <= 30) {
			xContact = true;
		}
		//checks if the y coordinate for the entire range of the ball for the balls falls within the paddle or not, if the x condition is met
		if (xContact) { 
			System.out.println(ball.getY() + ball.getSize() > leftPaddle.getY());
			System.out.println(ball.getY() < leftPaddle.getY() + 100);
			System.out.println(ball.getY() + ball.getSize() > leftPaddle.getY() && ball.getY() < leftPaddle.getY() + 100);
			if ((ball.getY() + ball.getSize() > leftPaddle.getY() && ball.getY() < leftPaddle.getY() + 100)==true) {			
				ball.setVx(-ball.getVx()); 
			}
		}
	}
		

	
	
	//these check for which keys are being pressed in order to move the paddles, both left and right
	public void keyPressed(KeyEvent key) {
		System.out.println(key.getKeyCode());
		//space to start the game
		if(key.getKeyCode()==32) {
			ball.setVx(20);
			ball.setVy(5);
		}  
		//left side paddle
		if (key.getKeyCode()==83) {
			leftPaddle.setVy(15);
			leftUp = true;
		} 
		if (key.getKeyCode()==87) {
			leftPaddle.setVy(-15);
			rightUp = true;
		} 
		//right side paddle
		if (key.getKeyCode()==40) {
			rightPaddle.setVy(15);
			leftDown = true;
		}
		if (key.getKeyCode()==38) {
			rightPaddle.setVy(-15);
			rightDown = true;
		}
	}
	
//reverses direction when the keys are released, to make the movement more flowy
	public void keyReleased(KeyEvent key) {
		System.out.println(key.getKeyCode());
		//left paddle
		if(key.getKeyCode()==83) {
			leftPaddle.setVy(-7);
			leftUp = false;
		}
		if(key.getKeyCode()==87) {
			leftPaddle.setVy(7);
			rightUp = false;
		}
		//right paddle
		if(key.getKeyCode()==40) {
			rightPaddle.setVy(-7);
			leftDown = false;
		}
		if(key.getKeyCode()==38) {
			rightPaddle.setVy(7);
			rightDown = false;
		}
		
	}


	public void keyTyped(KeyEvent arg0) {
		
		
	}
	public static void main(String[] arg) {
		Pong p = new Pong();
		
	}
	
}
