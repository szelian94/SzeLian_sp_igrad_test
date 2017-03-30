package main;


import java.util.Scanner;


import static common.Hashmap.*;

public class Question1 {
	
	
	Scanner scan = new Scanner(System.in);
	
	public void question1(){
		//initialize variable
		int count = 0;
		int total = 0;
		int b = 0;
		
		char[] list;
		System.out.print("Input: ");
		String q1 = scan.next();
				
		list = q1.toCharArray();
		
		for (int k = 0;k<list.length;k++){
			for (int j = 1;j<10;j++){
				String val=getinputpair(j);
				String val1 = getinputpair(j+1);
				
				//compare first letter of value pair with input to find out the key pair
				if (list[k] >= val.charAt(b) && list[k]<val1.charAt(b)){
					//count no of key press for each key
					for (int i = 0; i<val.length();i++){
						if (list[k]!= val.charAt(i))
							count++;
						else{
							count++;
							total+=count;							
												
						}	
					}
				
				}
			
			}
			count=0;
			
		}
		System.out.print("Output = ");
		System.out.print(total);
		System.out.println();
		
	}

}
