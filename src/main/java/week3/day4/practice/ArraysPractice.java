package week3.day4.practice;

import java.util.Arrays;

public class ArraysPractice {
    public static int countDistinctElements(int[] arr) {
    	Arrays.sort(arr);
    	System.out.println(" After Sorting "+Arrays.toString(arr));
    
    	int res=0;
    	for(int i=0; i<arr.length; i++) {
    		
    	while(i<arr.length-1 && arr[i]==arr[i+1] ) {
    		i++;
    		
    		   
    	}
    	//System.out.println(" The i in for"+i);
    	 res++;
		//break;
    	  
    	}
    	
    	
    	
    	return res;
    }
    
    public static char getMaximumOccurencesCharacterOfString(String str) {
    	final int ASCII_SIZE=256;
    	int[] count= new int[ASCII_SIZE];
    	for(int i=0; i<str.length(); i++) {
    		int a= (int)str.charAt(i);
    		
    		count[a]+=1;
    		
    	}
    	int max=-1;
    	char result =' ';
    	
    	for(int i=0; i<str.length(); i++) {
    		int ch=str.charAt(i);
    		if(count[ch]>max) {
    			max=count[ch];
    			
    			result=str.charAt(i);
    		
    		}
    	}
    	
		return result;
    	
    }
    
  
    	
    public static String reverserWordsInSentence(String sentence){
    		//StringBuilder sb= new StringBuilder();
    		String s="";
    		if((sentence!=null)&&(!sentence.isEmpty())){
    			//Hello World
    			//Hello -0
    			//World-1
    			String[] words= sentence.split("//s+");	
    			//System.out.println(" the String " +words[0]);
    		     for(int i=0; i<words.length; i++){
    		    	// System.out.println(" the String " +words[i]);
    		    	 //int len=words.length;
    		    	 //words[len-1-i])
    		    	 //sb.append(words[words.length-1-i]).append(" ");
    		    	 s=s+words[words.length-1-i]+" ";
    		    	 /*for (int i = str.length - 1; i >= 0; i--) {
    		    		   finalStr += str[i] + " ";
    		    		  }*/
    		    	 
    		     }
    		     
    		}
    		return s.trim();	
    	}

    	
    
    public static void main(String[] args) {
    	//int[] arr= {6, 10, 5, 4, 9, 120, 4, 6, 10}; 
    	//int res=ArraysPractice.countDistinctElements(arr);
    	char ch=getMaximumOccurencesCharacterOfString("Geeks");
    	System.out.println(ch);
    }
}
