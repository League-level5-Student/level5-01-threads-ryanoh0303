package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;



public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	static boolean racing= true;

	static int x= 10;
	//1. make a main method
	public static void main(String[] args) {
		Robot[] arr= new Robot[5];
		Thread[] arr2=  new Thread[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Robot();
			arr[i].setX(x);
			arr[i].setY(500);
			arr[i].setSpeed(70);
			x+=60;
		}
	
		for(int j=0; j<arr.length; j++) {
			final int x= j;
			arr2[j] =new Thread(()->racing(arr[x], x));	
			arr2[j].start();
			}
		
	
		
		
		
	
	}
public static void racing (Robot rob, int index) {
while(racing) {
	 Random rand = new Random();
	 rob.move(rand.nextInt(50));
	
	 if(rob.getY()<=0) {
			racing=false;
			System.out.println("WINNER WINNER CHICKEN DINNER");
			System.out.println("ROBOT "+ (index+1) +" has won the race!");
	}
}
    	

	
	


}
}
