package week2.day1.exercises;

import java.util.Arrays;

public class removeDuplicatesWithOutUsingAPI {
	
	public static int[] removeArrayWithDuplicates(int[] numberWithDuplicates) {


        System.out.println(Arrays.toString(numberWithDuplicates));
        int[] result= new int[numberWithDuplicates.length];
        Arrays.sort(numberWithDuplicates);

        int prev=numberWithDuplicates[0];

        result[0]=prev;

        for(int i=1; i<numberWithDuplicates.length; i++) {

                int ch=numberWithDuplicates[i];
                if(prev!=ch) {

                        result[i]=numberWithDuplicates[i];
                }
                prev=ch;

        }
        return result;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] duplicates=new int[] {1, 1, 2, 2, 3, 4, 5};
		removeDuplicatesWithOutUsingAPI removeDuplicates= new removeDuplicatesWithOutUsingAPI();
		int[] result=removeDuplicates.removeArrayWithDuplicates(duplicates);
		System.out.println(Arrays.toString(result));
	}

}
