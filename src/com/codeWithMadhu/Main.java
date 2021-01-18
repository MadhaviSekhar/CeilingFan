package com.codeWithMadhu;

/**
 * Client for the Ceiling fan class.
 * @author madhavi.katreddy@cgi.com
 *
 */
public class Main {
	public static void main(String[] args){
		CeilingFan fan = new CeilingFan(new DirectionCord(), new SpeedCord()); 
		
		fan.changeSpeed();
		fan.changeSpeed();
		fan.changeDirection();
		fan.changeDirection();
		fan.changeDirection();
		
		fan.changeSpeed();
		fan.changeSpeed();
		fan.changeSpeed();
		fan.changeDirection();
	}
}
