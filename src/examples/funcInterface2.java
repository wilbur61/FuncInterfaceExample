package examples;

public class funcInterface2 {

	// https://www.digitalocean.com/community/tutorials/java-8-functional-interfaces
	
	// Java program to demonstrate Implementation of
	// functional interface using lambda expressions
	
	// Let’s try to understand what is happening in the lambda expression below.

    // Runnable is a functional interface, that’s why we can use a lambda expression 
	// to create it’s instance.
    // Since run() method takes no argument, our lambda expression also has no argument.
    // Just like if-else blocks, we can avoid curly braces ({}) since we have a 
	// single statement in the method body. For multiple statements, we would have 
	// to use curly braces like any other methods.


		public static void main(String args[])
		{
			Runnable r1 = () -> System.out.println("My Runnable");
			r1.run();		
		}

}