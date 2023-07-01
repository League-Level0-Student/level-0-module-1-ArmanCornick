package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog("What is greater than God,more evil than the devil,the poor have it,the rich need it,and if you eat it, youll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle1.equals("nothing")) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong, it was nothing");	

}
JOptionPane.showMessageDialog(null, "score: "+score);
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("What has a bottom at its top?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle2.equals("legs")) {
JOptionPane.showMessageDialog(null, "Correct");
score++;
}
// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "Wrong, it was legs");	

}
JOptionPane.showMessageDialog(null, "score: "+score);
		// 2. Make a pop up to show the score.
		
	}
}

