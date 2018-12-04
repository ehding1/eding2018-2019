package fracCalc;

import java.util.Scanner;

public class FracCalc {
	 public static void main(String[] args) {
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
	   
	    public static String produceAnswer(String input) { 
	    	if(input.contains("/0")) { //accounts for dividing by zero
	    		return "Cannot divide by zero.";
	    	}
	    	String [] expression = input.split(" "); //splits into operands and operator
	    	int length = expression.length;
	    	String next="";
	    	int count = 0; 
	    	while(count < (length-1)) {
	    		String operand1 = expression[0];  //assigns first operand to variable 
	    		String operator = expression[1];  //assigns operator to variable
	    		if(!(operator.equals("+") || operator.equals("*") || operator.equals("/") || operator.equals("-"))) {
	    			return "Input is in an invalid format.";
	    		}
	    		String operand2 = expression[2];  //assigns second operand to variable
	    	
	    		
	    		for(int i = 0; i < operand1.length(); i++) {
	    			if(!(operand1.charAt(i) == ('0') || operand1.charAt(i) == ('1') || operand1.charAt(i) == ('2') || operand1.charAt(i) == ('3') || operand1.charAt(i) == ('4') || operand1.charAt(i) == ('5') || operand1.charAt(i) == ('6') || operand1.charAt(i) == ('7') || operand1.charAt(i) == ('8') || operand1.charAt(i) == ('9') || operand1.charAt(i) == ('_') || operand1.charAt(i) == ('/'))) {
	    				return "Input is in an invalid format.";	
	    			}
	    		}
	    		for(int i = 0; i < operand1.length(); i++) {
	    			if(!(operand2.charAt(i) == ('0') || operand2.charAt(i) == ('1') || operand2.charAt(i) == ('2') || operand2.charAt(i) == ('3') || operand2.charAt(i) == ('4') || operand2.charAt(i) == ('5') || operand2.charAt(i) == ('6') || operand2.charAt(i) == ('7') || operand2.charAt(i) == ('8') || operand2.charAt(i) == ('9') || operand2.charAt(i) == ('_') || operand2.charAt(i) == ('/'))) {
	    				return "Input is in an invalid format.";	
	    			}
	    		}
	    		
	    		
	    		int [] op1 = makeImproperFrac(operand1);  //turns first operand into improper fraction
	    		int [] op2 = makeImproperFrac(operand2);  //turns second operand into improper fraction
	    		int [] operand = {op1[0], op1[1], op2[0], op2[1]}; //puts both numerators and both denominators into single array
	    		if(operator.equals("+")) { 		//add
	    			next = addFrac(operand); 
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
	    		for(int i = 3; i < expression.length; i++) {
	    				next += " " + expression[i];
	    		}
	    		count += 2;
	    		expression = next.split(" "); //splits into operands and operator
	    	}
	    	return next;
	    }
	    
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
	    	if(testNeg) { //if wholeNum contained a negative sign multiply numerator by -1
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
	    
	    public static boolean isDivisibleBy (int dividend, int divisor) {  //determines whether or not one integer is evenly divisible by another
	    	if (divisor == 0) {
	    		throw new IllegalArgumentException("Cannot divide by zero");
	    	} 
	    	if (dividend % divisor == 0) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
	 
	    public static int gcf (int numerator, int denominator) {    //finds greatest common factor of two integers
	    	int answer = 1;
	    	numerator = Math.abs(numerator);
	    	denominator = Math.abs(denominator);
	    	for (int i = numerator; i >= 1; i--) {
	    		if(isDivisibleBy(numerator, i) && (isDivisibleBy(denominator, i))) {
	    			answer = i;
	    			i = 0;
	    		}
	    	}
	    	return answer;
	    }

	    public static int [] reduceFrac (int numerator, int denominator) { 	    //reduces fractions to lowest form
	    	int reduce = Math.abs(gcf(numerator, denominator));
	    	numerator /= reduce;
	    	denominator /= reduce;
	    	int [] fraction = {numerator, denominator};
	    	return fraction;
	    }
	}

		


