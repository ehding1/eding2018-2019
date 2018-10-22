
public class Hourglass {

	public static void main(String[] args) {
		int size=20; //size is number of quotes in base, only even sizes will give symmetrical hourglasses
		base(size);
		tophalf(size);
		middle(size);
		bottomhalf(size);
		base(size);
	}
	
	//receives string and and integer and prints the string the number of times dictated by integer 
	public static void printchars(String character, int times) {
		for(int i=1; i<=times; i++) {
			System.out.print(character);
		}
	}
	
	public static void base(int size) {
		printchars("|", 1);
		printchars("\"", size);
		printchars("|\n", 1);
	}
	
	public static void tophalf(int size) {
		for(int i=1; i<=((size-2)/2); i++) {
			printchars(" ", i);
			printchars("\\", 1);
			printchars(":", -2*i+size);
			printchars("/\n", 1);
		}
	}
	
	public static void middle(int size) {
		printchars(" ", ((size-2)/2)+1);
		printchars("||\n", 1);
	}
	
	public static void bottomhalf(int size) {
		for(int i=((size-2)/2); i>=1; i--) {
			printchars(" ", i);
			printchars("/", 1);
			printchars(":", -2*i+(size));
			printchars("\\\n", 1);
		}
	}
}
