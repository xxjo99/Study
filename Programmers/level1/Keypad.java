package level1;

public class Keypad {
	
    public static String solution(int[] numbers, String hand) {
    	StringBuilder sb = new StringBuilder();
		int left=10;
		int right=12;
		int leftlength;
		int rightlength;
		
		for(int n : numbers) {
			leftlength = 0; 
			rightlength = 0;
			if(n == 1 || n == 4 || n == 7) {
				sb.append("L");
				left = n;
			} else if(n == 3 || n == 6 || n == 9) {
				sb.append("R");
				right = n;
			} else {
				
				if(n==0) {
					n += 11;
				}
				
				leftlength = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
				rightlength = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
				
				if(leftlength == rightlength) {
					if(hand.equals("right")) {
						sb.append("R");
						right = n;
					} else {
						sb.append("L");
						left = n;
					}
				} else if(leftlength > rightlength) {
					sb.append("R");
					right = n;
				} else {
					sb.append("L");
					left = n;
				}
			}
		}	
		return sb.toString();
    }

	public static void main(String[] args) {
		// 키패드 누르기
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		System.out.println(solution(numbers, hand));

	}

}
