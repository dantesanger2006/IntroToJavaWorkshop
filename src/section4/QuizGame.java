package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		 String no=JOptionPane.showInputDialog("wat is a int variable");
		// 3.  Use an if statement to check if their answer is correct
		if (no.equals("numbers")) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1; 
		}else {
			JOptionPane.showMessageDialog(null, "wrong");
			
		}
		// 4.  if the user's answer was correct, add one to their score 
		JOptionPane.showMessageDialog(null, "you ganed one pont"+score);
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		int scor=1;
		String one=JOptionPane.showInputDialog("wat is a string");
		if (one.equals("leters")) {
			JOptionPane.showMessageDialog(null, "correct");
			score=scor+1; 
		}else {
			JOptionPane.showMessageDialog(null, "wrong");
		// 6.  After all the questions have been asked, print the user's score 
			JOptionPane.showMessageDialog(null, "you ganed one pont"+scor);

				
		
	}
	}
}