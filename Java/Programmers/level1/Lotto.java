package level1;

public class Lotto {
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int count = 0; // 최저
        int zerocount = 0; // 최고
        
        for (int i = 0; i < lottos.length; i++) {
        	if (lottos[i] == 0) {
        		zerocount++;
        	}
        	
        	for (int j = 0; j < win_nums.length; j++) {
        		if (lottos[i] == win_nums[j]) {
        			count++;
        		}
        	}
        	
        }
        
        zerocount += count;
        
        answer[0] = rank(zerocount);
        answer[1] = rank(count);
        
        return answer;
    }
	
	public static int rank(int n) {
		switch(n) {
			case 6 :
				return 1;
			case 5 :
				return 2;
			case 4 : 
				return 3;
			case 3 :
				return 4;
			case 2 :
				return 5;
			default :
				return 6;
		}
	}

	public static void main(String[] args) {
		// 로또의 최고 순위와 최저 순위
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		int[] i = solution(lottos, win_nums);
		System.out.println(i[0] + " " + i[1]);
		

	}

}
