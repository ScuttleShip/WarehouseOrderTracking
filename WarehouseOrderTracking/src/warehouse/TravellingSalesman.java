/**
 * @author Hannah Evans <hannah.c.evans@live.co.uk>
 * @version 4.4.0 (current version number of program)
 * @since 4.4.0 (the version of the package this class was first added to)
 */
package warehouse;

// At the moment this will identify all possible combinations given a string
// This would be modify to take in the customer order 2D array
// Identify the location of the items (xItemLocation, yItemLocation)
// Calculate all possible permutations of these coordinates
// Calculate the path distance for each permutation
// Identify the shortest path i.e. solve TS Problem

public class TravellingSalesman {

	public static void permutations(String prefix, String str) {

		// Length of string
		int customerOrderLength = str.length();

		// If length is zero, print out the prefix
		if (customerOrderLength == 0) {
			System.out.println(prefix);
		}

		else {
			for (int i = 0; i < customerOrderLength; i++) {

				permutations(prefix + str.charAt(i),

				str.substring(0, i) + str.substring(i + 1));

			}

		}
	}

	public static void main(String[] args) {

		permutations("", "567");
	}
}

