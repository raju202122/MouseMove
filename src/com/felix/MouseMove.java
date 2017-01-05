package com.felix;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.util.Date;

public class MouseMove {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println("START");
		Robot robot = new Robot();
		
		while(true){
			PointerInfo pointerInfo = MouseInfo.getPointerInfo();
			if(pointerInfo != null){
				Point location = pointerInfo.getLocation();
				int x = (int)location.getX();
				int y = (int)location.getY();
				System.out.println("@ "+new Date());
				System.out.println("-- Before :: x="+x);
				
				robot.mouseMove(++x, y);
				System.out.println("-- After :: x="+x);
				
			}else {
				System.out.println("pointerInfo is null @ "+new Date());
			}
			Thread.sleep(1000*60*3);
			System.out.println("================================");
		}
	}
}
