package level1;

import java.util.Arrays;

public class DescendingSort {

	public static long solution(long n) {
		String num = String.valueOf(n);
		String ans = "";
		
		char[] arr = new char[num.length()];
		for (int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i);
		}
		
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--) {
			ans += arr[i];
		}
		
		long answer = Long.parseLong(ans);
		return answer;
	}

	public static void main(String[] args) {
		// 정수 내림차순으로 배치하기
		long n = 118372;
		System.out.println(solution(n));

	}

}
