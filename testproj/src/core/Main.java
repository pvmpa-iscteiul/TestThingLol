package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<TestClass> subjects = new ArrayList<TestClass>();
		Scanner keyboard_in = new Scanner(System.in);
		System.out.println("I AM COMMITTED!!!!!!! AHHHH");
		while (true){
			System.out.print("Give me a command blyat:\n 1. Create a new subject\n 2. List all subjects\n 3. Remove a subject\n 4. Import from file\n 5. Export to file\n 6. Exit\n Command: ");
			int input = keyboard_in.nextInt();
			boolean exit = false;
			
			switch(input){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				exit = true;
				break;
			}
			
			if (exit == true){
				keyboard_in.close();
				System.out.println("Shutting down!");
				break;
			}
		}
	}

}
