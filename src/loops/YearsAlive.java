package loops;

import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	String date = JOptionPane.showInputDialog("When were you born?");
	int year = Integer.parseInt(date);
	String now = JOptionPane.showInputDialog("What year is it?");
	int today = Integer.parseInt(now); 
	for (int i = year; i < today + 1; i++) { //start point ; end point ; each loop end point
		System.out.println(i);
	}
}
}
