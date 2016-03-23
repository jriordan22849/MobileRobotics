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

public class Light implements Behavior {
	
	private int lightValue;
	private boolean suppress = false;
		
	private LightSensor light = new LightSensor(SensorPort.S3);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);


	public void action(){
		suppress = false;
		// stop the motors
		pilot.stop();
		
		// turn left
		pilot.rotate(-90);

		// move forward.
		pilot.forward();
	}

	public void suppress (){
		suppress = true;
	}

	public boolean takeControl(){
		lightValue = light.getLightValue();
		
		// if value is greater than 50, return true.
		if (lightValue > 50){
			return true;
		}
		else
			return false;
	}
}

