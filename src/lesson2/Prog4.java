package lesson2;
import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	 
	
	       System.out.println("Enter your favorite string:");
	       String input=scanner.nextLine();
		   System.out.println("The string you entered after reversed is:");
		
			for(int i=(input.length()-1);i>=0;i--){
			System.out.print(input.charAt(i));
			}
			scanner.close();
	}
	}
/*Output
Enter your favorite string:
Hello
The string you entered after reversed is:
olleH
 */
	

