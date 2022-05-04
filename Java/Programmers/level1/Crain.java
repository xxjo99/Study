package level1;

import java.util.Stack;

public class Crain {
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> doll = new Stack<>();
        
        for (int i = 0; i < moves.length; i++) {
        	int n = moves[i] - 1;
        	for (int j = 0; j < board.length; j++) {
        		
        		if(board[j][moves[i]-1] != 0) {
        			
            		if (doll.isEmpty()) {
            			doll.push(board[j][n]);
            		} else {
            			
            			if (doll.peek() == board[j][n]) {
            				doll.pop();
            				answer += 2;
            			} else {
            				doll.push(board[j][n]);
            			}
                		
            		}
            		
            		board[j][n] = 0;
            		break;
        		}
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		// 크레인 인형뽑기
		int[][] board = {{0,0,0,0,0}
						,{0,0,1,0,3}
						,{0,2,5,0,1}
						,{4,2,4,4,2}
						,{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(board, moves));
						
						
		}


}
