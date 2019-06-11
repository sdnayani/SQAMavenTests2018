package week3.day4.exercises;

import java.util.ArrayList;

public class checkValidUserNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regEx="^[a-zA-Z]\\w{8,30}";
		
         String s="Samantha_21";
         ArrayList<String> Names= new ArrayList<String>();
         Names.add("Julia");
         Names.add("Samantha_21");
         Names.add("Samantha?10_2A");
         for(String name:Names){
        	 
        	 if(name.matches(name)){
         	    System.out.println(" The Name" +name+ "Match success");
          }
        	 else {
        		 System.out.println(" The Name" +name+ "Match Fail");
         }
         

	}

	}
}
