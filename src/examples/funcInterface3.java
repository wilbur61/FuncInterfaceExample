package examples;

    // https://www.geeksforgeeks.org/functional-interfaces-java/

	// Java program to demonstrate lambda expressions to
	// implement a user defined functional interface.

    // Single Abstract Method (SAM) types or interfaces

    // The major benefit of java 8 functional interfaces is that we 
    // can use lambda expressions to instantiate them and avoid 
    // using bulky anonymous class implementation. see the 1st example

	@FunctionalInterface
	interface Square {
		int calculate(int x);
	}

	public class funcInterface3 {
		
		public static void main(String args[])
		{
			int a = 5;

			// lambda expression to define the calculate method
			Square s = (int x) -> x * x;

			// parameter passed and return type must be
			// same as defined in the prototype
			int ans = s.calculate(a);
			System.out.println(ans);
		}
	

}
