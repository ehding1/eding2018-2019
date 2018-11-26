package fracCalc;

import java.util.Arrays;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner console = new Scanner(System.in);
    	boolean done = false;
    	while(done == false) {
    		System.out.println("Enter a fraction expression");
    		String input = console.nextLine();
    		System.out.println(produceAnswer(input));
    		System.out.println("If you want to quit, type \"quit\". If you want to continue, enter new fraction expression.");
    		if(console.next().equals("quit")) {
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
    	String operand1 = expression[0]; 
    	String operator = expression[1]; 
    	String operand2 = expression[2]; 
    	int [] op1 = makeImproperFrac(operand1);
    	int [] op2 = makeImproperFrac(operand2);
    	int [] operand = {op1[0], op1[1], op2[0], op2[1]}; //puts both numerators and both denominators into array
    	if(operator.equals("+")) { 		//add
    		return addFrac(operand);
    	} if(operator.equals("-")) { 	//subtract
    		operand[2] *= -1;
    		return addFrac(operand);
    	} if(operator.equals("*")) {	 //multiply
    		return multiplyFrac(operand);
    	} else { 	//divide
    		int temp = op2[1];
    		op2[1] = op2[0];
    		op2[0] = temp;
    		return multiplyFrac(operand);
    	}
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
    public static int[] makeImproperFrac(String operand) {
    	String [] parts = operand.split("_"); //split into whole number and fraction 
    	String wholeNum = parts[0]; 	//set wholeNum equal to the part before underscore
    	boolean testNeg = false;
    	if(wholeNum.indexOf("-") != -1) { //checks if wholeNum contains a negative sign 
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
    	int num = Math.abs(Integer.parseInt(numerator)); //turn Strings into int variables 
    	int denom = Math.abs(Integer.parseInt(denominator));
    	int wholenum = Math.abs(Integer.parseInt(wholeNum));
    	num = wholenum * denom + num;
    	if(testNeg == true) { //if wholeNUm contained a negative sign multiply numerator by -1
    		num *= -1;
    	}
    	int [] op = {num, denom};
    	return op;
    }

    public static String addFrac (int [] operand) {
    	int numerator = (operand[0] * operand[3]) + (operand[2] * operand[1]);
    	int denominator = operand[1] * operand[3];
    	return numerator+"/"+denominator;
    }
    
    public static String multiplyFrac (int [] operand) {
    	int numerator = operand[0] * operand[2];
    	int denominator = operand[1] * operand[3];
    	return numerator+"/"+denominator;
    }
}

    
