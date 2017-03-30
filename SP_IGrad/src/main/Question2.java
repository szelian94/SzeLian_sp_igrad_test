package main;

import static common.Hashmap.*;

import java.util.Scanner;

public class Question2 {
	
	Scanner scan = new Scanner(System.in);
	
	public void question2(){
		//initialize variable
		String temp = "";
		String finalstr = "";
		int b = 0;
		
		char[] list;
		System.out.print("Input: ");
		String q2 = scan.next();
		
		//convert to char array
		list = q2.toCharArray();
				
		for (int k = 0;k<list.length;k++){
			for (int j = 1;j<10;j++){
				String val=getinputpair(j);
				String val1 = getinputpair(j+1);
				
				//compare first letter of value pair with input to find out the key pair
				if (list[k] >= val.charAt(b) && list[k]<val1.charAt(b)){
					//get the key pair
					temp = String.valueOf(j);
				
				}
			
			}
			finalstr+=temp;
			
		}
		System.out.print("Output = " + finalstr);
		System.out.println();
		
		
	}
	
	

}
