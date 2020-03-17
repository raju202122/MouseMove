package com.felix;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * @author ravudari
 *
 */
public class MouseMove {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("MouseMove is starting...");
		var log = true;
		var sleepMins = 3;

		var robot = new Robot();
		while (true) {
			var point = MouseInfo.getPointerInfo().getLocation();
			var x = (int) point.getX();
			var y = (int) point.getY();

			if (log) {
				String msg = String.format("Moving Mouse pointer @ %s", LocalDateTime.now());
				System.out.println(msg);
			}
			robot.mouseMove(++x, y);

			TimeUnit.MINUTES.sleep(sleepMins);
		}
	}
}
