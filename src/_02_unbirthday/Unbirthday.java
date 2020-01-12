package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null,"When is your birthday?");
if (answer.equals("01/11")) {
	JOptionPane.showMessageDialog(null,"happy birthday");
}else {
	JOptionPane.showMessageDialog(null,"happy UNbirthday");
}
}
}