package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot never = new Robot();
	
	void go() {
		 // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		never.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int no = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {
			
		
		
		// 8. Increase the length variable by 10
			no =no+10;
		// 5. call your drawTriangle() method using your length variable
					drawTriangle(no);
		
		
		// 9. Change the color of the pen to a random color
			never.setRandomPenColor();
			
			
			
			// 10. Turn the robot 6 degrees to the right
			never.turn(6);
			
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
	never.penDown();
	never.turn(360/3);
	never.move(length);
	never.turn(360/3);
	never.move(length);
	never.turn(360/3);
	never.move(length);
	
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
