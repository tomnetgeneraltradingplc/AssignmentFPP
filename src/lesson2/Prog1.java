package lesson2;
import java.util.Random;
public class Prog1 {
	public static void main(String[] args) {
		
	
	

	int  x = RandomNumbers .getRandomInt(1,9);
	System.out.println("The random nubers for x: " + x);
	Double computed1= (Math.pow(Math.PI, x));
	System.out.println("The Compute value of π: " + computed1);
	
	int  y = RandomNumbers .getRandomInt(3,14);
	System.out.println("The random nubers for y: " + y);
	Double computed2= (Math.pow(y,Math.PI));
	System.out.println("The Compute value of π: " + computed2);
	}
} 
