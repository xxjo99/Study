package level1;

import java.util.Arrays;

public class SortString {

	public static String solution(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);

		char[] arr2 = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[arr.length - i - 1];
		}
		String answer = new String(arr2);

		return answer;
	}

	public static void main(String[] args) {
		// 문자열 내림차순으로 배치하기
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

}
