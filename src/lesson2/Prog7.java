package lesson2;

public class Prog7 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < args.length; ++i) {
		System.out.println("Length of index " + i + " " + args[i] + " = "
		+ args[i].length());
		if (args[i].startsWith("A")) {
		count++;
		}
		}
		System.out.println("\nNumber of strings begin by A is = "+ count);

	}

}
/*Output
Length of index 0 This = 4
Length of index 1 is = 2
Length of index 2 FPP. = 4
Length of index 3 I = 1
Length of index 4 Allow = 5
Length of index 5 to = 2
Length of index 6 teach = 5
Length of index 7 new = 3
Length of index 8 staffs = 6
Length of index 9 in = 2
Length of index 10 programming. = 12

Number of strings begin by A is  = 1
*/