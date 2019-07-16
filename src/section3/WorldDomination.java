package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String no=JOptionPane.showInputDialog("do you know how to write code");
		// 2. If they say "yes", tell them they will rule the world.
		if(no.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you well rule the world");
		}else {
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
		// 3. Otherwise, wish them good luck washing dishes.
			
	}
}

