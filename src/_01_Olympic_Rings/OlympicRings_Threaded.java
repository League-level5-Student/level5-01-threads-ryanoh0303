package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
		public static void main(String[] args) {
			Robot timmy = new Robot(400, 400);
			Robot ryan = new Robot(525, 550);
			Robot jake = new Robot(650, 400);
			Robot anand = new Robot(775, 550);
			Robot ray = new Robot(900,400);
			
			
			timmy.setSpeed(10);
			ryan.setSpeed(10);
			jake.setSpeed(10);
			anand.setSpeed(10);
			ray.setSpeed(10);
			
			timmy.penDown();
			ryan.penDown();
			jake.penDown();
			anand.penDown();
			ray.penDown();
			
			timmy.setPenColor(Color.BLUE);
			ryan.setPenColor(Color.YELLOW);
			jake.setPenColor(Color.BLACK);
			anand.setPenColor(Color.GREEN);
			ray.setPenColor(Color.RED);
	
			
			Thread r1 = new Thread(()-> {
				for(int i=0; i<=360; i++) {
					timmy.turn(1);
					timmy.move(2);
				}
			}
			);
			Thread r2 = new Thread(()-> {
				for(int i=0; i<=360; i++) {
					ryan.turn(1);
					ryan.move(2);
				}
			}
			);
			Thread r3 = new Thread(()-> {
				for(int i=0; i<=360; i++) {
					jake.turn(1);
					jake.move(2);
				}
			}
			);
			Thread r4 = new Thread(()-> {
				for(int i=0; i<=360; i++) {
					anand.turn(1);
					anand.move(2);
				}
			}
			);
			Thread r5 = new Thread(()-> {
				for(int i=0; i<=360; i++) {
					ray.turn(1);
					ray.move(2);
				}
			}
			);
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
			
			
			

			
			
		}

	
}

