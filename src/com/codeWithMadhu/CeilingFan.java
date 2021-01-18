package com.codeWithMadhu;

/**
 * Ceilingfan class implements the fan functionality.
 * @author madhavi.katreddy@cgi.com
 *
 */
public class CeilingFan {
	ICord directionController;
	ICord speedController;
	
	public CeilingFan(ICord directionController, ICord speedController){
		this.directionController = directionController;
		this.speedController = speedController;
	}
	
	/**
	 * Invoking the speed cord to change the speed.
	 */
	public void changeSpeed(){
		speedController.pull();
		displayState("Speed cord pulled.");
	}
	
	/**
	 * Invoking the direction cord to change the direction.
	 */
	public void changeDirection(){
		directionController.pull();
		displayState("Direction cord pulled.");
	}
	
	/**
	 * Displays the current state of the fan.
	 * @param action - Indicates what action performed on the cord.
	 */
	private void displayState(String action){
		System.out.println("Action: " + action + " \n Ceiling fan speed at " + speedController.getState() + 
									" and direction: " + directionController.getState());
	}
}
