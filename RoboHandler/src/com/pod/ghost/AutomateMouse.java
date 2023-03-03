package com.pod.ghost;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class AutomateMouse {

	public static void main(String[] args) {
		int minutes = Integer.parseInt(args[0]);
		mouseMove(minutes);
	}

	private static void mouseMove(int minutes) {
	    Robot robot;
		try {
			robot = new Robot();
			for (int i=1;i<=minutes;i++) {
				Random random = new Random();
				int randomNum = random.nextInt(10);
		        // Move the mouse cursor a small distance to simulate user activity
		        robot.mouseMove(randomNum * 100, randomNum * 100);
		        System.out.println("MOVED " + i);
		        System.out.println("MOVED TO " + randomNum);
		        Thread.sleep(60000); // Wait for 10 seconds
		    }
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
