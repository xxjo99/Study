package function;

public class Function_4673 {
	
	public static int d(int num) {
		int sum = num;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// 셀프넘버
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if (n < 10001) {
				check[n] = true;
			}
		}
		
        for (int i = 1; i < 10001; i++) {
            if (check[i]==false) {
                System.out.println(i);
            }
        }
        
	}

}
