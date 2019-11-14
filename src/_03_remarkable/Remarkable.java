package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String Joe = "Good Coder";
		String Sophia = "Fast Typer";
		String Joseph = "Owner of Facebook";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Input = JOptionPane.showInputDialog(" What's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (Input.equals("Joe")) {
			JOptionPane.showMessageDialog(null, "Good Coder");
		}
		if (Input.equals("Sophia")) {
			JOptionPane.showMessageDialog(null, "Fast typer");
		}
	
		if (Input.equals("Joseph")) {
			JOptionPane.showMessageDialog(null, "Owner of Facebook");
	
	
	
	
		}
	}
	
	
	
}
