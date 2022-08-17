package examples;

// https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
//
// Importing interface
import java.util.function.Function;

public class FunctionJavaUtil {
	
	// Java Program to Illustrate Functional Interface
	// Via apply() method

		// Main driver method
		public static void main(String args[])
		{
			// Function which takes in a number
			// and returns half of it
			//Function<Integer, Double> half = a -> a / 2.0;
			Function<Double, Double> half = a -> a / 2.0;

			// Applying the function to get the result
			System.out.println(half.apply(50.8));
		}
	


}
