package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		
// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
 String riddle = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
	
 // 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("A stamp")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score+=1;
}

// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null,"Wrong.The answer is A stamp."); }

 // 6. Add some more riddles
 String riddle1 = JOptionPane.showInputDialog("During which month do people sleep the least?");
if(riddle1.equals("February")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score+=1;
}
else {JOptionPane.showMessageDialog(null, "Wrong. The answer is February.");}
// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null, "Your score is" + score);
	}
}

