package lesson2;
import java.util.Scanner;

public class Prog6 {
 public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[] string = new String[5];
        String[] string1 = new String[5];
        
        boolean check = true;
        
        System.out.println("Enter Five Strings :");
        for(int i = 0 ; i < 5 ; i++)
        	string[i] = scan.nextLine();
        
        int index = 0;    
        for(int i=0 ; i < 5 ; i++){
            for(int j = i+1 ; j < 5 ; j++)
            {
                if(string[i].equals(string[j]))
                    check = false;
            }
            if(check){
            	string1[index] = string[i];
                index++;
            }
            check = true;
        }
        

        System.out.println("------After Removed Duplicates strings-------");
        for(int i = 0 ; i < index ; i++)
            System.out.println(string1[i]);
        scan.close();
    }

}
	/*Output
	 *Enter Five Strings :
hourse
dog
cat
hourse
dog
------After Removed Duplicates strings------
cat
hourse
dog	
	 */
		
