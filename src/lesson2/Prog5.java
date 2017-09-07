package lesson2;


import java.util.*;

/**
 * This class keeps hold of an instance of Random and guarantees that the same
 * instance will be used over and over (so the cost of re-seeding the random
 * number generator is avoided). Each time the getRandomInt() method is called,
 * the next integer from this Random instance is returned.
 */
public class Prog5{

	static Random random;

	private Prog5() {
		random = new Random();
	}

	/**
	 * Use this method to get a random integer, with a call like this: int myInt
	 * = RandomNumbers.getRandomInt();
	 */
	public static int getRandomInt() {
		if (random == null)
			new Prog5();
		return random.nextInt();
	}

	/**
	 * Returns a random integer x satisfying lower <= x <= upper. If lower >
	 * upper, returns 0.
	 * 
	 * @param lower
	 * @param upper
	 * @return
	 */
	public static int getRandomInt(int lower, int upper) {
		if (lower > upper)
			return 0;
		if (lower == upper)
			return lower;
		int difference = upper - lower;
		int start = getRandomInt();

		// nonneg int in the range 0..difference - 1
		start = Math.abs(start) % (difference + 1);

		start += lower;
		return start;
	}

	public static void main(String[] args) {

		for (int outer = 0; outer < 2; outer++) {
			for (int i = 0; i < 2; i++) {

				for (int j = 1; j < 5; j++) {
					int rnd1;
					rnd1 = Prog5.getRandomInt(1, 99);

					if (rnd1 < 10) {
						System.out.format("%4d", rnd1);

					} else {
						System.out.format("%4d", rnd1);

					}
					System.out.format("%5s", " ");
				}
				System.out.println("");

				for (int j = 1; j < 5; j++) {
					int rnd1;
					rnd1 = Prog5.getRandomInt(1, 99);

					if (rnd1 < 10) {
						System.out.format("%s %2d", "+", rnd1);

					} else {
						System.out.format("%s %d", "+", rnd1);

					}
					System.out.format("%5s", " ");
				}
				System.out.println("");
				for (int k = 0; i < 4; i++) {
					System.out.format("____");
					if (i == 4)
						break;
					System.out.format("%5s", " ");
				}

			}
			System.out.format("\n");
			System.out.format("\n");
			System.out.format("\n");
		}
	}

}