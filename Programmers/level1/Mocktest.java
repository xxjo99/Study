package level1;

import java.util.ArrayList;

public class Mocktest {
	
    public static int[] solution(int[] answers) {
        
        int[] one = {1, 2, 3, 4, 5};
        int onecount = 0; // 맞은 개수
        
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int twocount = 0;
        
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int threecount = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == one[i%5]) {
            	onecount++;
            }
            if(answers[i] == two[i%8]) {
            	twocount++;
            }
            if(answers[i] == three[i%10]) {
                threecount++;
            }
        }
        
        int max = Math.max(Math.max(onecount, twocount), threecount);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == onecount) {
        	list.add(1);
        }
        if(max==twocount) {
        	list.add(2);
        }
        if(max==threecount) {
        	list.add(3);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
        
    }

	public static void main(String[] args) {
		// 모의고사
		int[] answers = {1,3,2,4,2};
		
		int[] a = solution(answers);
		
		for (int k : a) {
			System.out.println(k);
		}

	}

}
