package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
	Robot niga=new Robot();
		// 5. Set your robot's pen down 
		niga.penDown();
		// 3. Set the robot to go at max speed (100)
		niga.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			
		
			// 7. Change the pen color to random
		niga.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			niga.move(5*i);
			// 2. Turn the robot 360/7 degrees to the right
		niga.turn (360/7);
			// 8. Set the pen width to i
		niga.setPenWidth(i);
		}
	}
}
