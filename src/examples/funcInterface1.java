package examples;

// https://www.geeksforgeeks.org/functional-interfaces-java/

// Java program to demonstrate functional interface ( Old way )

class funcInterface1 {
	public static void main(String args[])
	{
		// create anonymous inner class object
		new Thread(new Runnable() {
			@Override public void run()
			{
				System.out.println("New thread created");
			}
		}).start();
	}
}
