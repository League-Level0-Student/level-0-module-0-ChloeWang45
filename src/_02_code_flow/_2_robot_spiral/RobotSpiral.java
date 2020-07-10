package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot rob = new Robot();
		// Set your robot's pen down 
		rob.penDown();
		// SPEED. Set the robot to go at max speed (100)
		rob.setSpeed(100);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		for (int i = 0; i < 50; i++) {
				// Change the robot pen color to random
				rob.setRandomPenColor();;
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
				rob.move(5*i);
				// TURN.    Turn the robot (360/7) degrees to the right
				rob.turn(360/7);
				// Change the robot pen width to (i)
				rob.setPenWidth(i);
		}
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
