package week2.day4.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import week2.day1.exercises.computeSum;
public class testComputeSum {
	
  @Test
  public void testSumofNumbers() {
	  int[] arr1= {1,2,3,4,6};
	  int result=computeSum.computeSumNumbers(arr1);
	  Assert.assertEquals(result, 16);
	 	  
  }
}
