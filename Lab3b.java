import java.util.Scanner;

import java.io.IOException;

public class Lab3b {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number of bottles of root beer on wall > ");
	int bottles;

	if (sc.hasNextInt()) {}
	else {
		System.out.println("You typed something other than an integer!");
		String somethingElse = sc.next();
		System.exit(0);
		}	

	bottles = sc.nextInt();

		if (bottles <= 0 || bottles > 99) {
		    System.out.println("Number must be > 0 and < 100 !");
		}

		else {

			for (int a = 1; a <= bottles; a++) {
				for (int b = bottles; b >= a; b--) {
					if (b >= a)
					System.out.print("R");
				}
			System.out.println();
			}
		System.out.println("NO MORE BOTTLES OF ROOT BEER ON THE WALL!");
			 
		}

	}

}