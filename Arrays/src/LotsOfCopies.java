import java.util.Arrays;

public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain,arrMain);
		System.out.println("x: " + num);
		System.out.println("strMain: " + strMain);		
		System.out.println("arrMain: " + Arrays.toString(arrMain));	
		partTwoWithInts();
		partTwoWithStrings();
	}

	public static void partTwoWithInts() {
		int a = 7;
		int b = a;
		a = 1;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void partTwoWithStrings() {
		String a = "hi";
		String b = a;
		a = "bye";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void changeMe(int x, String str, int[] arr) {
		x = 229886;
		str += str;
		arr[4] = 100; 
	}
}
