package week2.day1.exercises;

public class computeSum {

	public static void main(String[] args) {
		int[] numbers={2,3,4,5};
		int sum = 0;

        
        sum=computeSumNumbers(numbers);
        System.out.println(sum);
        }
		
		
		
		
	
	
   public static int computeSumNumbers(int[] total) {
	            int sum = 0;

	            for (int i : total) {    // ( int i ;)
	
	                sum = sum + i;
	            }

	                return sum;
	            }


}
