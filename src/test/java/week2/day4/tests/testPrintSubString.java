package week2.day4.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import week2.day2.examples.printSubString;
public class testPrintSubString {
	
	@Test
	   public void testPrintSubStr() {
		
	      //String str = "TestNG is working fine";
	      //Assert.assertEquals("TestNG is working fine",str);
		String subStr=printSubString.getSubStr("helloworld", 3,7);
		Assert.assertEquals(subStr, "lowo");
	      
	   }
}
