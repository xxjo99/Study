package level1;

public class Dart {

	public static int solution(String dartResult) {
		int answer = 0;

		int n = 0;
		int index = 0;
		int nowInt = 0;
		int[] score = new int[3];

		for (int i = 0; i < dartResult.length(); i++) {
			char c = dartResult.charAt(i);

			if (Character.isDigit(c)) {
				n = 0;
				if (c == '1' && dartResult.charAt(i + 1) == '0') {
					n = 10;
					i++;
				} else {
					n = Character.getNumericValue(c);
				}

				nowInt++;
			} else {
				switch (c) {
				case 'S':
					score[index++] = (int) Math.pow(n, 1);
					break;

				case 'D':
					score[index++] = (int) Math.pow(n, 2);
					break;

				case 'T':
					score[index++] = (int) Math.pow(n, 3);
					break;

				case '*':
					index = index - 2 < 0 ? 0 : index - 2;
					while (index < nowInt) {
						score[index++] *= 2;
					}
					n = 0;
					break;

				case '#':
					score[index - 1] *= -1;
					n = 0;
					break;
				}
			}
		}
		
		for (int i : score) {
			answer += i;
		}

		return answer;
	}

	public static void main(String[] args) {
		// 다트 게임
		String dartResult = "1S2D*3T";
		System.out.println(solution(dartResult));

	}

}
