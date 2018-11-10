import java.util.Arrays;

public class ArraysLab3 {
	
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr3[i]=arr1[i]+arr2[i];
		}
	return arr3;
	}
	
	public static int[] append(int[] arr, int num) {
		 int[] arrLonger = new int[arr.length+1];
		 for(int i=0; i<arr.length; i++) {
			 arrLonger[i]=arr[i];
		 }
		 arrLonger[arr.length]=num;
		 return arrLonger;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] arrShorter = new int[arr.length-2];
		for(int i=0; i<idx; i++) {
			arrShorter[i]=arr[i];
		}
		for(int i=idx+1; i<arr.length-1; i++) {
			arrShorter[i-1]=arr[i];
		}
		return arrShorter;
	}
	
	public static int sumEven(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		int last=arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=last;
	}
	
	public static void main (String[] args) {
		int[] a1={5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2={7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr=sum(a1, a2);
		int appendNum=200;
		int[] appendArr=append(a1, appendNum);
		int removeIdx=5;
		int[] removeArr=remove(a2, removeIdx);
		int sumOfEvens=sumEven(appendArr);
		rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
}
