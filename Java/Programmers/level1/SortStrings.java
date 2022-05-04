package level1;

import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {
	
    public static String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
        	list.add(strings[i].charAt(n) + strings[i]);
        }
        
        String[] answer = new String[list.size()];
        
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		// 문자열 내 마음대로 정렬하기
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		String[] answer = solution(strings, n);
		for (String i : answer) {
			System.out.println(i);
		}
	}

}
