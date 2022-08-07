package greedy;

import java.util.Arrays;

public class Greedy_2160 {
	
    public static int minimumSum(int num) {   	
    	int[] numArr = new int[4];
    	
    	for (int i = 0; i < 4; i++) {
    		numArr[i] = num % 10;
    		num /= 10;
    	}
    	
    	Arrays.sort(numArr);
    	int a = numArr[0] * 10 + numArr[2];
    	int b = numArr[1] * 10 + numArr[3];
    	
    	return  a+b;
        
    }
    
    public static void main(String[] args) {
    	int num = 4009;
    	
    	System.out.println(minimumSum(num));
    }

}
