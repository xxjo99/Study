package array;

public class Array_941 {

    public static boolean validMountainArray(int[] arr) {
        boolean result = true;
        boolean check = false;
        
        if (arr.length == 1) {
        	result = false;
        } else {
            for (int i = 1; i < arr.length; i++) {
            	
            	if (check == false) {
            		if (arr[i - 1] == arr[i] || arr[i - 1] > arr[i]) {
            			result = false;
            			break;
            		}
            	} else {
            		if (arr[i - 1] == arr[i] || arr[i-1] < arr[i]) {
            			result = false;
            			break;
            		}
            	}
            	
            	if (check == false && i != arr.length-1) {
            		if (arr[i] > arr[i+1]) {
            			check = true;
            		}
            	}
            	
            	
            }
        }
        
        if (check == false) {
        	result = false;
        }
        
        return result;
    }

	public static void main(String[] args) {
		// Valid Mountain Array
		int[] arr = { 0,1,2,3,4,5,6,7,8,9 };
		System.out.println(validMountainArray(arr));
	}

}
