//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("what color should Rob use?");
		//5. Use an if/else statement to set the pen color that the user requested
			if(color.equals("blue")) {
			rob.setPenColor(Color.blue);
		}
		else if(color.equals("red")) {
			rob.setPenColor(Color.red);
		}
		else if(color.equals("green")) {
			rob.setPenColor(Color.green);
		}
		else if(color.equals("")) {
			rob.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.setSpeed(50);
		rob.setPenColor(Color.black);
		rob.penDown();
		for (int i = 0; i < 4; i++) {
		rob.move(60);
		rob.turn(90);
		}

	}
}
