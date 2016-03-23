/*
Group B10
Student Name: Aadam Bari
Student ID: C13425202

Student Name: Jonathan Riordan
Student ID: C13432152
*/
import lejos.nxt.*;
import lejos.robotics.subsumption.*;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.navigation.DifferentialPilot;

public class Clapped implements Behavior {
	
	private int soundValue;
	private boolean suppress = false;
	
	private SoundSensor sound = new SoundSensor(SensorPort.S2);
	private DifferentialPilot pilot = new DifferentialPilot(2.25, 4.25, Motor.A, Motor.B);

	public void action(){
		suppress = false;
		
		pilot.forward();
		LCD.drawString("Clap",0,0);

	}

	public void suppress (){LCD.clear();
		pilot.stop();
		suppress = true;
	}

	public boolean takeControl(){
		soundValue = sound.readValue();
		
		// if sound is greater than 55, activate the action by returning the true.
		if(soundValue > 55){
			return true;
		}
		else{
			return false;
		}
	}
}
