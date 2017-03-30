package main;

import java.util.ArrayList;
import java.util.Scanner;

import static common.Hashmap.*;

public class Question3 {
	Scanner scan = new Scanner(System.in);
	
	public void question3(){
		System.out.print("Input: ");
		String q3 = scan.next();
		
		ArrayList<String> list = letterCombinations(q3);
		
		System.out.print("Output: ");
		System.out.print(list);
		System.out.println();
	}
}
