package lesson2;
public class Prog2 {
public static void main(String[] args) {
	float a=1.27f;
	float b=3.881f;
	float c=9.6f;
	
	int sum1=(int) (a+b+c);
	int sum2= Math.round(a+b+c);
	
	System.out.println("The sum by casting is: " +  sum1);
	System.out.println("The sum by rounding is: " + sum2);
}
}
/*Output
 The sum by casting is: 14
 The sum by rounding is: 15
 */
