package lesson2;
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

/*OutPut
The random nubers for x: 6
The Compute value of π: 961.3891935753043
The random nubers for y: 13
The Compute value of π: 3159.04819858571
*/
