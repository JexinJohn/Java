// Java program to demonstrate the
// working of a HashSet

import java.util.*;
public class Hashset {
	public static void main(String args[])
	{
		// Creating HashSet and
		// adding elements
		HashSet<String> hs = new HashSet<String>();

		hs.add("Jexin");
		hs.add("Plays");
		hs.add("Football");
		hs.add("very");
		hs.add("Well");

		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
