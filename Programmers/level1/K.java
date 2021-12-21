package level1;

import java.util.Arrays;

public class K {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
        	
    		int[] cmd = new int[3];
        	for (int j = 0; j < 3; j++) {
        		cmd[j] = commands[i][j];
        	}
        	
        	int[] copy = Arrays.copyOfRange(array, cmd[0] - 1, cmd[1]);
        	Arrays.sort(copy);
        	
        	answer[i] = copy[cmd[2] - 1];
        	
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// K¹øÂ°¼ö
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] arr = solution(array, commands);
		
		for (int i : arr) {
			System.out.println(i);
		}
		

	}

}
