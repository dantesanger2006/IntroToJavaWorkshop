package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
		String one=JOptionPane.showInputDialog("type the anser");
		
		
		// 3. If the user spelled the word correctly, speak "correct"
		if(one.equals("mandlebrot")) {
			JOptionPane.showMessageDialog(null, "correct");
		}else { 
			JOptionPane.showMessageDialog(null, "wrong");
		}
		// 4. Otherwise say "wrong"
		
		// 5. repeat the process for other words
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
				speak("spell sketchUp");
				// 2. Catch the user's answer in a String
				one=JOptionPane.showInputDialog("type the anser");
				
				
				// 3. If the user spelled the word correctly, speak "correct"
				if(one.equalsIgnoreCase("sketchup")) {
					JOptionPane.showMessageDialog(null, "correct");
				}else { 
					JOptionPane.showMessageDialog(null, "wrong");
				}}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


