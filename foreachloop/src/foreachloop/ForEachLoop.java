package foreachloop;

public class ForEachLoop {
	
    public static void main(String[] args) {
    	
        int[] numbers = {18, 23, 54, 70, 56, 8, 34, 26, 6};

        int max = Integer.MIN_VALUE; 
       
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The maximum number in the array is: " + max);
    }

}
