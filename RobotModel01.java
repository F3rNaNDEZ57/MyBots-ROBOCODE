package test;
import java.awt.Color;

import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * RobotModel01 - a robot by (ferNaNDEZ57)
 */
public class RobotModel01 extends Robot
{
	public void run() {
		setBodyColor(Color.BLACK);


		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() <= 100) {
			fire(5);
		} else {
			fire(1);
		}
	}

	
	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	
	public void onHitWall(HitWallEvent e) {
		back(20);
	}	
}
