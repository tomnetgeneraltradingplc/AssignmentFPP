package lesson2;
import java.util.ArrayList;
public class Prog6 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> wordDuplicate = new ArrayList<String>();
		ArrayList<String> finalList= new ArrayList<String>();

	for (int i = 0; i < args.length; i++)
	  wordDuplicate.add(args[i]);


		for (String dupWord : wordDuplicate) {
		    if (!finalList.contains(dupWord)) {
		        finalList.add(dupWord);
		    }
		}

		System.out.println(finalList);
	}

}
		
		
