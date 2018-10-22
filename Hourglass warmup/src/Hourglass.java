
public class Hourglass {

	public static void main(String[] args) {
		base();
		tophalf();
		middle();
		bottomhalf();
		base();
	}
	
	public static void printchars(String character, int times) {
		for(int i=1; i<=times; i++) {
			System.out.print(character);
		}
	}
	
	public static void base() {
		printchars("|", 1);
		printchars("\"", 10);
		printchars("|\n", 1);
	}
	
	public static void tophalf() {
		for(int i=1; i<=4; i++) {
			printchars(" ", i);
			printchars("\\", 1);
			printchars(":", -2*i+10);
			printchars("/\n", 1);
		}
	}
	
	public static void middle() {
		printchars(" ", 5);
		printchars("||\n", 1);
	}
	
	public static void bottomhalf() {
		for(int i=4; i>=1; i--) {
			printchars(" ", i);
			printchars("/", 1);
			printchars(":", -2*i+10);
			printchars("\\\n", 1);
		}
	}
}
