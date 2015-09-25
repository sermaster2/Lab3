public class Lab3a {

    public static void main(String[] args) {

	int helen = 10;
	System.out.println("Paris is running to Helen!");
	System.out.println("Distance between Helen and Paris started at 10 meters!");
	do {
		helen = helen/2;
	    System.out.println("Distance between Helen and Paris is " + helen + " meters!");
	} while (helen > 0);

	System.out.println("It took 4 steps for Paris to reach Helen in java!");

    }
    
}