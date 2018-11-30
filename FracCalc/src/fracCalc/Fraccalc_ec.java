package fracCalc;

import java.util.Arrays;

import java.util.Scanner;

public class Fraccalc_ec {
	 public static void main(String[] args) {
	        // TODO: Read the input from the user and call produceAnswer with an equation
	    	Scanner console = new Scanner(System.in);
	    	boolean done = false;
	    	System.out.println("Enter a fraction expression");
	    	while(done == false) {
	    		String input = console.nextLine();
	    		System.out.println(produceAnswer(input));
	    		System.out.println("If you want to quit, type \"quit\". If you want to continue, enter new fraction expression.");
	    		if(input.equals("quit")) {
	    			done = true;
	    		}
	    	}
	    	console.close();
	    }
	    
	    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	    // This function takes a String 'input' and produces the result
	    //
	    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	    //      e.g. input ==> "1/2 + 3/4"
	    //        
	    // The function should return the result of the fraction after it has been calculated
	    //      e.g. return ==> "1_1/4"
	   
	    public static String produceAnswer(String input) { 
	        // TODO: Implement this function to produce the solution to the input
	    	String [] expression = input.split(" "); //splits into operands and operator
	    	String next="";
	    	int count = 0; 
	    	while(count < ((expression.length-1)/2)+1) {
	    		String operand1 = expression[0];  //assigns first operand to variable 
	    		String operator = expression[1];  //assigns operator to variable
	    		String operand2 = expression[2];  //assigns second operand to variable
	    		int [] op1 = makeImproperFrac(operand1);  //turns first operand into improper fraction
	    		int [] op2 = makeImproperFrac(operand2);  //turns second operand into improper fraction
	    		int [] operand = {op1[0], op1[1], op2[0], op2[1]}; //puts both numerators and both denominators into single array
	    		if(operator.equals("+")) { 		//add
	    			next = addFrac(operand); 
	    			System.out.println(next);
	    		} else if(operator.equals("-")) { 	//subtract by turning making operand negative and adding
	    			operand[2] *= -1;
	    			next = addFrac(operand);
	    		} else if(operator.equals("*")) {	//multiply
	    			next = multiplyFrac(operand);
	    		} else { 					    //divide by swapping numerator and denominator of second operand and multiplying 
	    			if(operand[2] < 0) {
	    				operand[2] *= -1;
	    				operand[3] *= -1;
	    			}
	    			int temp = operand[3];		
	    			operand[3] = operand[2];
	    			operand[2] = temp;
	    			next = multiplyFrac(operand);
	    		}
	    		for(int i = count + 3; i < expression.length; i++) {
	    			next += " "+expression[i]+"";
	    		}
	    		input = next;
	    		count++;
	    		expression = input.split(" "); //splits into operands and operator
	    		System.out.println(next);
	    	}
	    	return next;
	    }

	    // TODO: Fill in the space below with any helper methods that you think you will need
	    
	    public static int[] makeImproperFrac(String operand) {
	    	String [] parts = operand.split("_"); //split into whole number and fraction 
	    	String wholeNum = parts[0]; 	//set wholeNum equal to the part before underscore
	    	boolean testNeg = false;
	    	if(wholeNum.contains("-")) { //checks if wholeNum contains a negative sign 
	    		testNeg = true;
	    	}
	    	String numerator = "0"; 	//set default numerator to 0 to account for input with only whole number part
			String denominator = "1"; 	//set default denominator to 1 to account for input with only whole number part
	    	if(parts.length!=1) {	 //checks if it was split into whole number and fraction 
	    		String fraction = parts[1];
	    		String [] fracParts = fraction.split("/"); //split fraction into numerator and denominator 
	    		numerator = fracParts[0];
	    		denominator = fracParts[1];
	    	} else { 	//case for only whole number or only fraction part
	    		String fraction = parts[0];
	    		String [] fracParts = fraction.split("/"); //split into numerator and denominator if it is a fraction
	    			if(fracParts.length!=1) { 	//checks if it was split into numerator and denominator or if it is only whole number
	    				numerator = fracParts[0];
	    				denominator = fracParts[1];
	    				wholeNum = "0";
	    			}
	    	}
	    	int num = Math.abs(Integer.parseInt(numerator)); //turn Strings into absolute value of int variables 
	    	int denom = Math.abs(Integer.parseInt(denominator));
	    	int wholenum = Math.abs(Integer.parseInt(wholeNum));
	    	num = wholenum * denom + num;
	    	if(testNeg == true) { //if wholeNum contained a negative sign multiply numerator by -1
	    		num *= -1;
	    	}
	    	int [] op = {num, denom}; //stores operand as numerator and denominator in array 
	    	return op;
	    }

	    public static String addFrac (int [] operand) { //method for adding and subtracting
	    	int numerator = (operand[0] * operand[3]) + (operand[2] * operand[1]);
	    	int denominator = operand[1] * operand[3];
	    	int [] fraction = reduceFrac(numerator, denominator);
	    	numerator = fraction[0];
	    	denominator = fraction[1];
	    	if(denominator == 1 || numerator == 0) {
	    		return numerator + "";
	    	}
	    	if(Math.abs(numerator)/Math.abs(denominator) >= 1) {
	    		int wholeNum = numerator/denominator;
	    		numerator -= (wholeNum * denominator);
	    		return wholeNum + "_" + Math.abs(numerator) + "/" + Math.abs(denominator);
	    	} else {
	    		return numerator + "/" + denominator;
	    	}
	    }

	    
	    public static String multiplyFrac (int [] operand) { //method of multiplying and dividing
	    	int numerator = operand[0] * operand[2];
	    	int denominator = operand[1] * operand[3];
	    	int [] fraction = reduceFrac(numerator, denominator);
	    	numerator = fraction[0];
	    	denominator = fraction[1];
	    	if(denominator == 1 || numerator == 0) {
	    		return numerator + "";
	    	}
	    	if(Math.abs(numerator)/Math.abs(denominator) >= 1) {
	    		int wholeNum = numerator/denominator;
	    		numerator -= (wholeNum * denominator);
	    		return wholeNum + "_" + Math.abs(numerator) + "/" + Math.abs(denominator);
	    	} else {
	    		return numerator + "/" + denominator;
	    	}
	    }

	    //determines whether or not one integer is evenly divisible by another
	    public static boolean isDivisibleBy (int dividend, int divisor) {
	    	if (divisor == 0) {
	    		throw new IllegalArgumentException("Cannot divide by zero");
	    	} 
	    	if (dividend % divisor == 0) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }

	    //finds greatest common factor of two integers
	    public static int gcf (int numerator, int denominator) {
	    	int answer = 1;
	    	numerator = Math.abs(numerator);
	    	denominator = Math.abs(denominator);
	    	for (int i = numerator; i >= 1; i--) {
	    		if(isDivisibleBy(numerator, i) == true && (isDivisibleBy(denominator, i)) == true) {
	    			answer = i;
	    			i = 0;
	    		}
	    	}
	    	return answer;
	    }
	    
	    //reduces fractions to lowest form
	    public static int [] reduceFrac (int numerator, int denominator) {
	    	int reduce = Math.abs(gcf(numerator, denominator));
	    	numerator /= reduce;
	    	denominator /= reduce;
	    	int [] fraction = {numerator, denominator};
	    	return fraction;
	    }
	}

		


