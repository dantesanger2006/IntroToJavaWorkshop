package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot never = new Robot();
	void go() {
		// 4. Make the robot move as fast as possible
		never.setSpeed(100);
		// 5. Set the pen width to 5
			never.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
			for (int i = 0; i < 4.; i++) {
				
			
			// 7. Set the pen color to random
			never.setRandomPenColor();
				// 8. Turn the robot 90 degrees to the right
				never.turn(90);
			
			}	
			
				
				// 1. Call the drawSquare() method		
		drawSquare();
	{	

	}
			
			
	}

	
	void drawSquare() {
		/* 3. Fill in the code to draw a square inside the method below. */
		never.penDown();
		never.move(100);
		never.turn(90);
		never.move(100);
		never.turn(90);
		never.move(100);
		never.turn(90);
		never.move(100);
		
		
	
	}
	
	
	public static void main(String[] args) {
		new FourSquare().go();
	}

}



