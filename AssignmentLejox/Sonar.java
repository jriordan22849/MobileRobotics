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

public class Sonar implements Behavior {
	
	private int distanceToObject = 30;
	private int sonarValue;
	private boolean suppress = false;
	
	private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);

	public void action(){
		suppress = false;
		pilot.stop();
		
		// rotate 180 degrees
		pilot.rotate(-180);
		
		// travel 20 unis.
		pilot.travel(20);
		
		// turn 90 degrees right
		pilot.rotate(90);
	

	}

	public void suppress (){
		suppress = true;
	}

	public boolean takeControl(){
		
		sonarValue = sonic.getDistance();
		
		if(sonarValue < distanceToObject) {
			return true;
		}
		else {
			return false;
		}
	}
}
