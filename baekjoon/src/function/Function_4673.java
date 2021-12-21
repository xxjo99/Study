package function;


public class Function_4673 {
	
	static int selfnum(int n) {
		int sum = n;
		
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// ¼¿ÇÁ³Ñ¹ö
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int n = selfnum(i);
			
			if (n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

}
