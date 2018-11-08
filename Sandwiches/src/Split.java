import java.util.Arrays;

public class Split {

		 public static void main(String[] args) {

		// Your task Part 0

		//String.split();

		//It's a method that acts on a string, <StringName>.split(<String sp>);
			 
		//toUpperCase, toLowerCase, equals, charAt, length, subString, indexOf

		//Where sp is the string where the string splits

		//And it returns an array

		// Example: "I like apples!".split(" ");
		
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		

		// it will split at spaces and return an array of ["I","like","apples!"]

		// Example 2: "I really like really red apples"split("really")
		
		System.out.println(Arrays.toString("I really like really red apples".split("really")));

		// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

		//play around with String.split!

		//What happens if you "I reallyreally likeapples".split("really") ?

		System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
		
		//Your task Part 1:

		/*Write a method that take in a string like

		* "applespineapplesbreadlettustomatobaconmayohambreadcheese"

		* describing a sandwich.

		* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

		* the sandwich and ignores what's on the outside

		* What if it's a fancy sandwich with multiple pieces of bread?

		*/
	
		System.out.println(breadSplit("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		System.out.println(spaceSplit("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));

		}
		
		public static String breadSplit(String s) {
			int bread1=s.indexOf("bread");
			int bread2=s.length()-5;
			int breadcount=0;
			if (!s.substring(bread2).equals("bread")) {
				while (!s.substring(bread2, bread2+5).equals("bread")) {
					bread2--;
				}
			}
			for (int i=0; i<s.length()-5; i++) {
				if (s.substring(i, i+5).equals("bread")) {
					breadcount++;
				}
			}
			
			String[] sandwichparts=s.split("bread");
			if(breadcount<=2) {
				return ((Arrays.toString(sandwichparts)).substring(bread1+3, bread2-2));
			} else {
				return ((Arrays.toString(sandwichparts)).substring(bread1+3, bread2-(5*(breadcount-2))));
			}
		}
			
		
			
		

		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettus tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/
		
		public static String spaceSplit (String s) {
			String[] sandwichParts=s.split(" "); //split by space removes all spaces 
			String noSpaces=""; 				 // creates empty String noSpaces to eventually store String s modified to contain no spaces	
			for(String t: sandwichParts) { 		 //for each loop to put each element of sandwich Parts into noSpaces
				noSpaces+=t;
			}
			return breadSplit(noSpaces);		//String noSpaces is in same format as arguments for breadSplit, so you can just pass it in there
		}
	
		

}

	
		
		
		

		






