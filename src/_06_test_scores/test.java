package _06_test_scores;
import javax.swing.JOptionPane;
public class test {
public static void main(String[] args) {
	String Score = JOptionPane.showInputDialog("What is your test score? (*10)");
	int score = Integer.parseInt(Score);
	score = score/ 10;
	if (score >= 90) {
		JOptionPane.showMessageDialog(null, "Wow, good job");
		
	}
	else if (score <= 89 & score > 80) {
		JOptionPane.showMessageDialog(null, "Good job");
	}
	else if (score <= 79 & score > 70) {
		JOptionPane.showMessageDialog(null, "Passing grade");
	}
	else {
		JOptionPane.showMessageDialog(null, "If re-takes are avalible, I would do that");
	}
	
}
}
