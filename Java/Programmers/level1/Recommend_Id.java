package level1;

public class Recommend_Id {
	
	public String solution(String new_id) {
        String answer = new_id;
        
        // 1�ܰ�
        answer = answer.toLowerCase();
        
        // 2�ܰ�
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        
        // 3�ܰ�
        answer = answer.replace("..", ".");
        while(answer.contains("..")) {
        	answer = answer.replace("..", ".");
        }
        
        // 4�ܰ�
        if (answer.length() > 0) {
        	if (answer.charAt(0) == '.') {
        		answer = answer.substring(1, answer.length());
        	}
        }
        if (answer.length() > 0) {
            if (answer.charAt(answer.length() - 1) == '.') {
            	answer = answer.substring(0, answer.length() - 1);
            }
        }
        
        // 5�ܰ�
        if (answer.length() == 0) {
        	answer = "a";
        }
        
        // 6�ܰ�
        if (answer.length() > 15) {
        	answer = answer.substring(0, 15);
        }
        if (answer.charAt(answer.length() - 1) == '.') {
        	answer = answer.substring(0, answer.length() - 1);
        }
        
        // 7�ܰ�
        if (answer.length() <= 2) {
        	while (answer.length() != 3) {
        		answer += answer.charAt(answer.length() - 1);
        	}
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		// �ű� ���̵� ��õ
		Recommend_Id id = new Recommend_Id();
		
		String new_id = "=.=";
		
		String answer = id.solution(new_id);
		
		System.out.println(answer);
	}

}
