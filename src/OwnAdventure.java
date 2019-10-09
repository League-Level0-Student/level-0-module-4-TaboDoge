import javax.swing.JOptionPane;
public class OwnAdventure {
	
public static void main(String[] args) {
	String road = JOptionPane.showInputDialog("You are going down a road, which way will you go: road 1 or 2?");
	if (road.contentEquals("1")) {
		road = JOptionPane.showInputDialog("It breaks, do you want to go right or left?");
	}
	else {
		JOptionPane.showMessageDialog(null, "It ends with a tunnel, blocked at the end.");
	}
	 if (road.equals("right")) {
		JOptionPane.showMessageDialog(null, "You end up in Hawaii..");
	}
}
}
