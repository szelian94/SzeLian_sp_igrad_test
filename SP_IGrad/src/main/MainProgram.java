package main;

import java.util.Scanner;

public class MainProgram {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//initialize variable
		int choice = 0;
		
		//Display
		System.out.println("Select Choice: ");
		System.out.println("================ ");
		System.out.println("1. Question 1 ");
		System.out.println("2. Question 2 ");
		System.out.println("3. Question 3 ");
		System.out.println("4. Question 4 ");
		System.out.println("5. Exit ");
		System.out.println("================ ");
		
		
		//choice selection
		while(true){
			System.out.print("Input choice : ");
			choice = scan.nextInt();
			if (choice == 5){
				break;
			}
			switch (choice){
				case 1:  
					Question1 q1 = new Question1();
					q1.question1();
					break;
				case 2:
					Question2 q2 = new Question2();
					q2.question2();
					break;
				case 3:  
					Question3 q3 = new Question3();
					q3.question3();
					break;
				case 4:
					Question4 q4 = new Question4();
					q4.question4();
					break;
				
				default: break; 		
		 
			}
		}
	}
}
