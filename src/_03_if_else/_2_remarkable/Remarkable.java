package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String mom = "Was in court for speeding and the judge found her not guilty but her brother told her to say she was guilty so she did and was fined 300 dollars";
String dad = "Was around 10 years old and touched a live elecrical wire and forgot everything he did a year prior";
String Ishan = "Was 7 years old when someone stole his pizza slice at lunch at school and bit the kid who took it in the arm";
String Arman = "Was 5 years old and was bouncing on a bouncy house and got pushed behind it stuck between the ball and the massive bouncy house for 20 minutes";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String userNameGuess = JOptionPane.showInputDialog("Pick a person");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(userNameGuess.equals("mom")) {
	JOptionPane.showMessageDialog(null, mom);
}
if(userNameGuess.equals("dad")) {
	JOptionPane.showMessageDialog(null, dad);
}
if(userNameGuess.equals("Ishan")) {
	JOptionPane.showMessageDialog(null, Ishan);
}
if(userNameGuess.equals("Arman")) {
	JOptionPane.showMessageDialog(null, Arman);
}
	}
}

