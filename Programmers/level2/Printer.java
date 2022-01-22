package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
        	queue.add(new int[] { i, priorities[i] });
        }
        
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			boolean able = true;
			
			for (int[] q : queue) {
				if (q[1] > now[1]) {
					able = false;
				}
			}

			if (able) {
				answer++;
				if (now[0] == location) {
					break;
				}
			} else {
				queue.add(now);
			}
		}
        
        
        return answer;
    }

	public static void main(String[] args) {
		// «¡∏∞≈Õ

		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		System.out.println(solution(priorities, location));
		
	}

}
