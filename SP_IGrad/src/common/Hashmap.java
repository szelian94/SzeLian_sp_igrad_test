package common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	public static Map<Integer, String> inputPair = new HashMap<Integer, String>();
 
	 //refer to ascii table   
    static final HashMap<Integer,String> map = new HashMap<Integer,String>(){{
    	inputPair.put(1,":;<");
    	inputPair.put(2,"abc");
  	   	inputPair.put(3,"def");
  	   	inputPair.put(4,"ghi");
  	   	inputPair.put(5,"jkl");
  	   	inputPair.put(6,"mno");
  	   	inputPair.put(7,"pqrs");
  	   	inputPair.put(8,"tuv");
  	   	inputPair.put(9,"wxyz");
  	   	inputPair.put(10,"{|}~");
    }} ;
    
    //return value pair
    public static String getinputpair(int intpair) {
        return inputPair.get(intpair);
    }
	
    
    public static ArrayList<String> letterCombinations(String digits) {
        char[] cs = new char[digits.length()];
        
        ArrayList<String> res = new ArrayList<String>();
        appendDigits(digits, 0, cs, res);
        return res;
    }
    
    private static void appendDigits(String digits, int i, char[] cs, ArrayList<String> res){
        if(i == digits.length()){
            res.add(new String(cs));
            return;
        }
        //ascii table 0=48
        //remove offset from ascii table
        int k = digits.charAt(i)-48;
        
        //retrieve key value pair
        String letters = inputPair.get(k);
        for(int j = 0; j < letters.length(); j++){
            cs[i] = letters.charAt(j);
            //recursive call
            appendDigits(digits, i + 1, cs, res);
        }
    }
	
}
