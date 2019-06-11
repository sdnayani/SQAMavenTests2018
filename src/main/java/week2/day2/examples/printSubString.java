package week2.day2.examples;

public class printSubString {
	public static void main(String args[]) {
		
	String s="HelloWorldJava";
	System.out.println(getSubStr(s,2,5));
	}
	 public static String getSubStr(String s, int start,int end) {
	      return s.substring(start, end);
	   }
}
