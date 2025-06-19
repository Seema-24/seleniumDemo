package coding.java;

public class Argument {
	    public static void main(String[] args) {
	        // Check if arguments are passed
	        if (args.length > 0) {
	            // Access command-line arguments
	            System.out.println("First argument: " + args[0]);
	            System.out.println("Second argument: " + args[1]);
	        } else {
	            System.out.println("No command-line arguments passed.");
	        }
	    }
}
