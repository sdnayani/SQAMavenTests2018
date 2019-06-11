package week2.day4.tests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class NewTest {
	
	@Test
	   public void testAdd() {
		
	      String str = "TestNG is working fine";
	      Assert.assertEquals("TestNG is working fine",str);
	      
	   }
}
