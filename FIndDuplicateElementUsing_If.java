package JavaDemoprogramTissa;

public class FIndDuplicateElementUsing_If {

	public static void main(String[] args) {

        int[] array = { 2, 1, 5, 4, 2, 3, 1 };
        isDuplicate(array);
 
        array = new int[] { 2, 1, 3, 0 };
        isDuplicate(array);
    }
 
    private static void isDuplicate(int[] numbers) {
         
        for (int index = 0; index < numbers.length; index++) {
            int absIndex = Math.abs(numbers[index]);
             
            if (numbers[absIndex] < 0) {
                // We have already seen this number
                System.out.println("1. Duplicate number exist in array at index : " + index);
                return;
 
            } else { // We are seeing this number for first time
                numbers[absIndex] = -numbers[absIndex];
            }
        }
        System.out.println("2. No duplicate element exists in an array");
        return;

	}

}
