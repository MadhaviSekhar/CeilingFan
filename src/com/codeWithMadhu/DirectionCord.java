package com.codeWithMadhu;

/**
 * This class is responsible to perform the operation of speed cord.
 * @author madhavi.katreddy@cgi.com
 *
 */
public class DirectionCord implements ICord{
	private final String REVERSE_DIRECTION = "REVERSE", FORWARD_DIRECTION = "FORWARD";

	private String direction = FORWARD_DIRECTION;
	
	/**
	 * Change the direction, either Reverse or Forward.
	 */
	@Override
	public void pull() {
		direction = direction.equalsIgnoreCase(FORWARD_DIRECTION) ? REVERSE_DIRECTION : FORWARD_DIRECTION;
	}

	/**
	 * Return current direction of the fan
	 */
	@Override
	public String getState() {
		return direction;
	}

}
