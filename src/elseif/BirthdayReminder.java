
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 5th";
		String dadsBirthday = "November 12th";
		String myBirthday = "September 30th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("Who's birthday do you want?");
	
	if (bday.equalsIgnoreCase ("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}
	else if (bday.equalsIgnoreCase ("dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}
	else if (bday.equalsIgnoreCase ("Joyce")) {
		JOptionPane.showMessageDialog(null, myBirthday);
	}
	else {
		JOptionPane.showMessageDialog(null, "Who be it?");
	}
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
