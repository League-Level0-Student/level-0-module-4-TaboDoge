package _10_happy_pet;
import java.text.BreakIterator;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petType = JOptionPane.showInputDialog("What pet do you want: cat/dog");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i=0; i < 5; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do?", "Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Groom your "+petType, "Take your "+petType+ " outside", "Give your "+petType+" food" }, null);
				JOptionPane.showOptionDialog(null, task, petType, task, task, null, args, task);
			// 5. Use user input to call the appropriate method created in step 4.
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
				if (happinessLevel >= 10) {
						JOptionPane.showMessageDialog(null, "You have satified your pet!");
						break;
					}
	
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
				String happy = "";
				if (petType=="cat") {
					happy = "purring";
				}
				else {
					happy = "wagging their tail";
				}
				if (task==2) {
					JOptionPane.showMessageDialog(null, "Your pet is happy");
					food();
				}
					else if (task==1) {
						JOptionPane.showMessageDialog(null, "Don't let your "+petType+" escape!");
						outside();
					}
					else if (task ==0) {
						JOptionPane.showMessageDialog(null, "Your "+petType+" is "+happy);
						groom();
					}
}
	
	}
	static void groom () {
		happinessLevel = happinessLevel + 1;
		System.out.println(happinessLevel);
	}
	static void outside () {
		happinessLevel = happinessLevel + 3;
		System.out.println(happinessLevel);
	}
	static void food() {
		happinessLevel = happinessLevel + 2;
		System.out.println(happinessLevel);
	}
	
}
