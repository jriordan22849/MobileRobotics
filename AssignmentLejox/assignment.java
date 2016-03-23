/*
Group B10
Student Name: Aadam Bari
Student ID: C13425202

Student Name: Jonathan Riordan
Student ID: C13432152
*/
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;
import lejos.nxt.NXTMotor;
import lejos.nxt.MotorPort;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.nxt.TouchSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.LightSensor;
import lejos.nxt.*;
import lejos.robotics.subsumption.*;


public class assignment {

	//private static DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);

	public static void main(String[] args) throws Exception {

	
		// print assignment to screen
		LCD.drawString("Assignment 1", 0, 0);
		
		// wait for button to pressed
		Button.waitForAnyPress();
		LCD.clear();

		//
		Behavior clapsBehavior = new Clapped();
		Behavior touchBehavior = new Touched();
		Behavior lightBehavior = new Light();
		Behavior sonarBehavior = new Sonar();
		
		Behavior [] behaviourArray = {clapsBehavior, touchBehavior,lightBehavior,sonarBehavior};
		Arbitrator arbitrator = new Arbitrator(behaviourArray);
		arbitrator.start();
		
		// print assignment to screen
		LCD.drawString("Assignment 1", 0, 0);
		
		System.exit(0);

	}
}
