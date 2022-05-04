package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Function_Development {
	
    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }
        
        List<Integer> answer = new ArrayList<>();
        
        while (!queue.isEmpty()){
            int day = queue.poll();
            int cnt = 1;
            
            while(!queue.isEmpty() && day >= queue.peek()){
                cnt++;
                queue.poll();
            }
            answer.add(cnt);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

	public static void main(String[] args) {
		// 기능개발
		int[] progress = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		int[] answer = solution(progress, speeds);
		for (int i : answer) {
			System.out.println(i);
		}
	}

}
