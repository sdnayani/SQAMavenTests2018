package week3.day3.examples;

public class regExExample {
	
	public static void main(String[] args){
		String s= "I lost my: Wallet";
		if(s.matches("I lost my:?\\s*\\w+")){
			System.out.println(" The line matches " +s);
		}
		
		String s2="I lost my: keys";
		if(s2.matches("I lost my:? (wallet|car|cell phone|marbles)")){
			System.out.println(" The line matches " +s2);
		}
		
	}

}
