package level2;

import java.util.Stack;

public class StockPrice {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
        	while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
        		answer[stack.peek()] = i - stack.peek();
                stack.pop(); // 답을 구했기 때문에 stack에서 제거한다
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
        	answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }

	public static void main(String[] args) {
		// 주식 가격
		int[] numbers = { 1, 2, 3, 2, 3 };
		System.out.println(solution(numbers));
	}

}
