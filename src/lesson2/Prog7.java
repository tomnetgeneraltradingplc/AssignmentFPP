package lesson2;
public class Prog7 {

	public static void main(String[] args) {
    int length=0;
    int countA = 0;
    if(args != null) 
    	length = args.length;
		System.out.println("The length of the string you entered is:" + length);	
		for(int i=0;i<args.length;i++){
			
			//count the number of A's
			//if(args.charAt(i)=='A')
			countA++;
		}
		
		System.out.println("\nThe number of A's you entered is:" + countA);
		
		
	}
	
 }
