package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Birthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What's your birthday?(mm/dd)");
		if(birthday.equals("07/01")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}	
		else {
		JOptionPane.showMessageDialog(null,"Have a merry unbirthday!");
		}
		}
		}















