/*
Group B10
Student Name: Aadam Bari
Student ID: C13425202

Student Name: Jonathan Riordan
Student ID: C13432152
*/
import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.robotics.navigation.DifferentialPilot;

public class Touched implements Behavior {
	
	private boolean suppress = false;
	
	private TouchSensor touch = new TouchSensor(SensorPort.S1);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);


	public void action(){
		suppress = false;
		
		// stop the motors.
		pilot.stop();
		
		// print stop to the screen.
		LCD.drawString("Stop",0,0);
		
	}

	public void suppress (){
		// print stop.
		LCD.drawString("Stop",0,0);
		suppress = true;
	}

	
	public boolean takeControl(){
		// if touch is true, activate action method.
		if (touch.isPressed()){
			return true;
		}
		else
			return false;
	}
}
