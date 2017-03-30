package main;



import static common.Hashmap.*;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Question4 {
	
	Scanner scan = new Scanner(System.in);
	
	//create hash maps
	HashMap<String, List<String>> dictionary1 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary2 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary3 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary4 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary5 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary6 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary7 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary8 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary9 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary10 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary11 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary12 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary13 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary14 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary15 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary16 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary17 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary18 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary19 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary20 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary21 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary22 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary23 = new HashMap<String, List<String>>();
	HashMap<String, List<String>> dictionary24 = new HashMap<String, List<String>>();

	
	public void question4(){
		//sort data in text file to hashmap
		sortdictionary();
		
		System.out.print("Input: ");
		String q4 = scan.next();
		List<String> finallist = new ArrayList<String>();
		
		int inputlength = q4.length();
		//get associated value in hash map (sorted according to length of input)
		switch (inputlength){
		 case 1:  
			 finallist = getdictionary1(q4);
			 break;
		 case 2:
			 finallist = getdictionary2(q4);
			 break;
		 case 3:  
			 finallist = getdictionary3(q4);
			 break;
		 case 4:
			 finallist = getdictionary4(q4);
			 break;
		 case 5:  
			 finallist = getdictionary5(q4);
			 break;
		 case 6:
			 finallist = getdictionary6(q4);
			 break;
		 case 7:  
			 finallist = getdictionary7(q4);
			 break;
		 case 8:
			 finallist = getdictionary8(q4);
			 break;
		 case 9:  
			 finallist = getdictionary9(q4);
			 break;
		 case 10:
			 finallist = getdictionary10(q4);
			 break;
		 case 11:  
			 finallist = getdictionary11(q4);
			 break;
		 case 12:
			 finallist = getdictionary12(q4);
			 break;
		 case 13:
			 finallist = getdictionary13(q4);
			 break;
		 case 14:
			 finallist = getdictionary14(q4);
			 break;
		 case 15:
			 finallist = getdictionary15(q4);
			 break;
		 case 16:
			 finallist = getdictionary16(q4);
			 break;
		 case 17:
			 finallist = getdictionary17(q4);
			 break;
		 case 18:
			 finallist = getdictionary18(q4);
			 break;
		 case 19:
			 finallist = getdictionary19(q4);
			 break;
		 case 20:
			 finallist = getdictionary20(q4);
			 break;
		 case 21:
			 finallist = getdictionary21(q4);
			 break;
		 case 22:
			 finallist = getdictionary22(q4);
			 break;
		 case 23:
			 finallist = getdictionary23(q4);
			 break;
		 case 24:
			 finallist = getdictionary24(q4);
			 break;
		 default: break; 		
		 
		}
		
		System.out.print("Output: ");
		System.out.print(finallist);
		System.out.println();
		
	}
	
	public void sortdictionary(){
		//create list for dictionary
		List<String> list = new ArrayList<String>();
		List<String> editlist = new ArrayList<String>();	
	
		//max length of word in dictionary = 24
		//int maxlength = 0;		
		
		
		//read in from text file
		FileInputStream fstream = null;
			
		try {
			fstream = new FileInputStream("words.txt");
		} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
			
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
		//initialize variables
		String strline="";
		String dicline="";
		String linetoint = "";
		int length = 0;
		
		//read till end of file
		try {
			while ((strline = br.readLine())!= null) {
				dicline = strline.toLowerCase();              
			    linetoint = getstrint(dicline);
			    length = linetoint.length();
			
			    //check for max length of a dictionary word
			    //for debugging purpose
			    /*
			    if (length > maxlength){
			    	maxlength = length;
			    	System.out.println(strline);
			    }
			     */  
			    
			    //sort to hashmap according to length
				switch (length) {
							    
					case 1:
						//if key exist
					    if(dictionary1.containsKey(linetoint))
					    {
					        editlist = getdictionary1(linetoint);
					        editlist.add(strline);
					    	dictionary1.put(linetoint,editlist);
					    }
					    else
					    {
					    	list.add(strline);
					    	dictionary1.put(linetoint, list);
					    }
					    break;
					    
				    case 2:
				    	if(dictionary2.containsKey(linetoint))
					    {
					        editlist = getdictionary2(linetoint);
					        editlist.add(strline);
					    	dictionary2.put(linetoint,editlist);
					    }
					    else
					    {
					    	list.add(strline);
					    	dictionary2.put(linetoint, list);
					    }
					    break;
				    
					case 3:
						if(dictionary3.containsKey(linetoint))
						{
							editlist = getdictionary3(linetoint);
							editlist.add(strline);
							dictionary3.put(linetoint,editlist);
						}
						else
						{
							list.add(strline);
							dictionary3.put(linetoint, list);
						}
						break;
						
					case 4:
						if(dictionary4.containsKey(linetoint))
						{
							editlist = getdictionary4(linetoint);
							editlist.add(strline);
							dictionary4.put(linetoint,editlist);
						}
						else
						{
							list.add(strline);
							dictionary4.put(linetoint, list);
						}
						break;
				   
				case 5:
						if(dictionary5.containsKey(linetoint))
						{
							editlist = getdictionary5(linetoint);
							editlist.add(strline);
							dictionary5.put(linetoint,editlist);
						}
						else
						{
							list.add(strline);
							dictionary5.put(linetoint, list);
						}
						break;
						
				case 6:
					if(dictionary6.containsKey(linetoint))
					{
						editlist = getdictionary6(linetoint);
						editlist.add(strline);
						dictionary6.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary6.put(linetoint, list);
					}
					break;	
					
				case 7:
					if(dictionary7.containsKey(linetoint))
					{
						editlist = getdictionary7(linetoint);
						editlist.add(strline);
						dictionary7.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary7.put(linetoint, list);
					}
					break;
					
				case 8:
					if(dictionary8.containsKey(linetoint))
					{
						editlist = getdictionary8(linetoint);
						editlist.add(strline);
						dictionary8.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary8.put(linetoint, list);
					}
					break;
					
				case 9:
					if(dictionary9.containsKey(linetoint))
					{
						editlist = getdictionary9(linetoint);
						editlist.add(strline);
						dictionary9.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary9.put(linetoint, list);
					}
					break;
					
				case 10:
					if(dictionary10.containsKey(linetoint))
					{
						editlist = getdictionary10(linetoint);
						editlist.add(strline);
						dictionary10.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary10.put(linetoint, list);
					}
					break;

				case 11:
					if(dictionary11.containsKey(linetoint))
					{
						editlist = getdictionary11(linetoint);
						editlist.add(strline);
						dictionary11.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary11.put(linetoint, list);
					}
					break;
					
				case 12:
					if(dictionary12.containsKey(linetoint))
					{
						editlist = getdictionary12(linetoint);
						editlist.add(strline);
						dictionary12.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary12.put(linetoint, list);
					}
					break;
				case 13:
					if(dictionary13.containsKey(linetoint))
					{
						editlist = getdictionary13(linetoint);
						editlist.add(strline);
						dictionary13.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary13.put(linetoint, list);
					}
					break;
				case 14:
					if(dictionary14.containsKey(linetoint))
					{
						editlist = getdictionary14(linetoint);
						editlist.add(strline);
						dictionary14.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary14.put(linetoint, list);
					}
					break;
				case 15:
					if(dictionary15.containsKey(linetoint))
					{
						editlist = getdictionary15(linetoint);
						editlist.add(strline);
						dictionary15.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary15.put(linetoint, list);
					}
					break;
				case 16:
					if(dictionary16.containsKey(linetoint))
					{
						editlist = getdictionary16(linetoint);
						editlist.add(strline);
						dictionary16.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary16.put(linetoint, list);
					}
					break;
				case 17:
					if(dictionary17.containsKey(linetoint))
					{
						editlist = getdictionary17(linetoint);
						editlist.add(strline);
						dictionary17.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary17.put(linetoint, list);
					}
					break;
				case 18:
					if(dictionary18.containsKey(linetoint))
					{
						editlist = getdictionary18(linetoint);
						editlist.add(strline);
						dictionary18.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary18.put(linetoint, list);
					}
					break;
				case 19:
					if(dictionary19.containsKey(linetoint))
					{
						editlist = getdictionary19(linetoint);
						editlist.add(strline);
						dictionary19.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary19.put(linetoint, list);
					}
					break;
				case 20:
					if(dictionary20.containsKey(linetoint))
					{
						editlist = getdictionary20(linetoint);
						editlist.add(strline);
						dictionary20.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary20.put(linetoint, list);
					}
					break;
				case 21:
					if(dictionary21.containsKey(linetoint))
					{
						editlist = getdictionary21(linetoint);
						editlist.add(strline);
						dictionary21.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary21.put(linetoint, list);
					}
					break;
				case 22:
					if(dictionary22.containsKey(linetoint))
					{
						editlist = getdictionary22(linetoint);
						editlist.add(strline);
						dictionary22.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary22.put(linetoint, list);
					}
					break;
				case 23:
					if(dictionary23.containsKey(linetoint))
					{
						editlist = getdictionary23(linetoint);
						editlist.add(strline);
						dictionary23.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary23.put(linetoint, list);
					}
					break;
				case 24:
					if(dictionary24.containsKey(linetoint))
					{
						editlist = getdictionary24(linetoint);
						editlist.add(strline);
						dictionary24.put(linetoint,editlist);
					}
					else
					{
						list.add(strline);
						dictionary24.put(linetoint, list);
					}
					break;
				
				default: break;
				
				}
				
				//reset variables
				strline="";
				dicline="";
				list = new ArrayList<String>();
				editlist = new ArrayList<String>();
				  
				}
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            try {
				br.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}			
	}
	
	
	//convert string to integer 
	public String getstrint(String textline){
		//initialize variables
		String temp = "";
		String finalstr = "";
		char[] list;
		int first = 0;
		
		//convert string to charArray
		list = textline.toCharArray();
				
		for (int k = 0;k<list.length;k++){
			for (int j = 1;j<10;j++){
				String val=getinputpair(j);
				String val1 = getinputpair(j+1);
								
				if (list[k] >= val.charAt(first) && list[k]<val1.charAt(first)){
					temp = String.valueOf(j);
				}
			}
			finalstr+=temp;	
		}
		return finalstr;
	}
	
    //return value pair in dictionary
    public List<String> getdictionary1(String intpair) {
        return dictionary1.get(intpair);
    }
    public List<String> getdictionary2(String intpair) {
        return dictionary2.get(intpair);
    }
    public List<String> getdictionary3(String intpair) {
        return dictionary3.get(intpair);
    }
    public List<String> getdictionary4(String intpair) {
        return dictionary4.get(intpair);
    }
    public List<String> getdictionary5(String intpair) {
        return dictionary5.get(intpair);
    }
    public List<String> getdictionary6(String intpair) {
        return dictionary6.get(intpair);
    }
    public List<String> getdictionary7(String intpair) {
        return dictionary7.get(intpair);
    }
    public List<String> getdictionary8(String intpair) {
        return dictionary8.get(intpair);
    }
    public List<String> getdictionary9(String intpair) {
        return dictionary9.get(intpair);
    }
    public List<String> getdictionary10(String intpair) {
        return dictionary10.get(intpair);
    }
    public List<String> getdictionary11(String intpair) {
        return dictionary11.get(intpair);
    }
    public List<String> getdictionary12(String intpair) {
        return dictionary12.get(intpair);
    }
    public List<String> getdictionary13(String intpair) {
        return dictionary13.get(intpair);
    }
    public List<String> getdictionary14(String intpair) {
        return dictionary14.get(intpair);
    }
    public List<String> getdictionary15(String intpair) {
        return dictionary15.get(intpair);
    }
    public List<String> getdictionary16(String intpair) {
        return dictionary16.get(intpair);
    }
    public List<String> getdictionary17(String intpair) {
        return dictionary17.get(intpair);
    }    
    public List<String> getdictionary18(String intpair) {
        return dictionary18.get(intpair);
    }
    public List<String> getdictionary19(String intpair) {
        return dictionary19.get(intpair);
    }
    public List<String> getdictionary20(String intpair) {
        return dictionary20.get(intpair);
    }
    public List<String> getdictionary21(String intpair) {
        return dictionary21.get(intpair);
    }
    public List<String> getdictionary22(String intpair) {
        return dictionary22.get(intpair);
    }
    public List<String> getdictionary23(String intpair) {
        return dictionary23.get(intpair);
    }
    public List<String> getdictionary24(String intpair) {
        return dictionary24.get(intpair);
    }
    
}
