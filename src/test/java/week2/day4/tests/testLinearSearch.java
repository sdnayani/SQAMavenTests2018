package week2.day4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import week2.day1.exercises.LinearSearch;

public class testLinearSearch {

	@Test(testName="testing lenier search")
	public void testLenierSearchMethod() {
		int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 34;
       int foundMe= LinearSearch.linearSeach(arr1,searchKey);
       //MyLinearSearch.
       Assert.assertEquals(foundMe, 6);
       
       //Assert.assertEquals("hello", "hello");
	}
}
