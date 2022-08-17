package examples;

// https://www.geeksforgeeks.org/function-interface-in-java-with-examples/
//
//Importing interface
import java.util.function.Function;

//Java Program to illustrate andThen() method

//Main class
public class FunctionJavaUtil2 {

	// main driver method
	public static void main(String args[])
	{
		// Function which takes in a number and
		// returns half of it
		Function<Integer, Double> half = a -> a / 2.0;

		// Now treble the output of half function
		half = half.andThen(a -> 3 * a);

		// Applying the function to get the result
		// and printing on console
		System.out.println(half.apply(10));
	}
}
