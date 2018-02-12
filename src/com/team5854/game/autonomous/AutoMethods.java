package com.team5854.game.autonomous;

import com.team5854.utils.driveSystem.DriveSystem;
import com.team5854.utils.mechanism.Grabber;
import com.team5854.utils.sensors.Ultrasonic;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DriverStation;

public class AutoMethods {
	private static String gameData = "";
	private static ADXRS450_Gyro gyro; 
	private static DriveSystem driveSystem;
	private static Grabber grabber;
	private static Ultrasonic ultraSensor;
	public static void cLeftSwitch() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if('R'==gameData.charAt(0)) {
			driveSystem.drive(gyro, 52);
			driveSystem.drive(227.04);
			driveSystem.drive(gyro, -51);
			grabber.output();
		} else {
			driveSystem.drive(ultraSensor, 12);
		}
			
	}
	public static void cRightSwitch() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if('L'==gameData.charAt(0)) {
			driveSystem.drive(gyro, -52);
			driveSystem.drive(227.04);
			driveSystem.drive(gyro, 51);
			grabber.output();
		} else {
			driveSystem.drive(ultraSensor, 12);
		}
			
	}

	public static void leftSwitch() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if('L'==gameData.charAt(0)) {
			driveSystem.drive(168);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(58.56);
			grabber.output();
		} else {
			driveSystem.drive(226);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(147);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(56);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(5);
			grabber.output();
		}
	}
	
	public static void leftScale() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if('L'==gameData.charAt(0)) {
			driveSystem.drive(317.65);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(4.75);
			grabber.output();
		} else {
			driveSystem.drive(226);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(155);
			driveSystem.drive(gyro, -90);
			driveSystem.drive(121.65);
			driveSystem.drive(gyro, -90);
			driveSystem.drive(4.75);
			grabber.output();
		}
	
	}
	
	public static void rightScale() {
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		if('R'==gameData.charAt(0)) {
			driveSystem.drive(317.65);
			driveSystem.drive(gyro, -90);
			driveSystem.drive(4.75);
			grabber.output();
		} else {
			driveSystem.drive(226);
			driveSystem.drive(gyro, -90);
			driveSystem.drive(155);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(121.65);
			driveSystem.drive(gyro, 90);
			driveSystem.drive(4.75);
			grabber.output();
		}
	
	}
}
