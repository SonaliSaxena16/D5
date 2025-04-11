package practiceWithVaibhavSir;

public class RotateLastEleOfArrFromRight {

	    public static void main(String[] args) {
	        int[] array = {0, 1, 2, 3, 4};

	        int lastElement = array[array.length - 1];
	        
	        System.out.println("LE " + lastElement);

	        for (int i = array.length - 1; i > 0; i--) {
	            array[i] = array[i - 1];
	        }

	        array[0] = lastElement;

	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	}