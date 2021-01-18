package com.codeWithMadhu;

/**
 * This class is responsible to perform the operation of speed cord.
 * @author madhavi.katreddy@cgi.com
 *
 */
public class SpeedCord implements ICord{
	
	private final int OFF = 0, MAX_SPEED = 3;
	
	private int speed = OFF;
	
	/**
	 * Method to change the speed of the fan.
	 */
	@Override
	public void pull() {
		speed = speed == MAX_SPEED ? OFF : ++speed;
	}

	/**
	 * Return current speed of the fan.
	 */
	@Override
	public String getState() {
		return String.valueOf(speed);
	}

}
