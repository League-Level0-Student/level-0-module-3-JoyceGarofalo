import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();

public static void main(String[] args) {
	rob.setPenWidth(10);
	rob.setSpeed(10);
	rob.penDown();
	String color = JOptionPane.showInputDialog("What color do you want?");
	if(color.equalsIgnoreCase("blue")) {
		rob.setPenColor(Color.blue);
	}
	else if(color.equalsIgnoreCase("red")) {
		rob.setPenColor(Color.red);
	}
	else if(color.equalsIgnoreCase("green")) {
		rob.setPenColor(Color.green);
	}
	else if(color.equals("black")) {
		rob.setPenColor(Color.black);
	}
	else {
		rob.setRandomPenColor();
	}
	
	String shape = JOptionPane.showInputDialog("what shape do you want?");
	if(shape.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if(shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else {
		drawCircle();
	}
}
public static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		rob.move(100);
		rob.turn(90);
}
}
public static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
	rob.turn(30);
	rob.move(100);
	rob.turn(90);
}
}
public static void drawCircle() {
	for (int i = 0; i < 40; i++) {
	rob.move(10);
	rob.turn(10);
}
}


}

