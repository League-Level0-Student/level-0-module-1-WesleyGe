package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
JOptionPane.showMessageDialog(null,"This is a state IQ test.");
JOptionPane.showMessageDialog(null,"If your score is equal or higher that your age, you have an IQ above 100. If its lower, you have a below average IQ.");		
JOptionPane.showInputDialog("What is your age?");
String answer1 = JOptionPane.showInputDialog("How much wood does a woodchuck chuck if a wood chuck could chuck wood?");
	
if(answer1.equals("400.1")) { 
	JOptionPane.showMessageDialog(null,"Nice job!!!");
	score++;
}else{
	
	JOptionPane.showInputDialog("LMAO how can someone be so dumb?? Small brain bald mango.");}

		// 6. Add some more riddles
JOptionPane.showMessageDialog(null,"Your score is "+score);
String answer2 = JOptionPane.showInputDialog("12*12+144?");

if(answer2.equals("288")) { 
	JOptionPane.showMessageDialog(null,"WOWOWOWOWOW GENIUS!");
}else{
	
	JOptionPane.showMessageDialog(null,"WTF go back to kindergarden you dumb dense cabbage.");}
JOptionPane.showMessageDialog(null,"Your final score is "+score);
JOptionPane.showMessageDialog(null,"You have a total Iq of 23, which is the lower 1% quartile. I don't even know how you are alive.");
// 2. Make a pop up to show the score.
		
	}

	private static void showMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub
		
	}
}

