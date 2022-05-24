package etc;

public class Etc_1430 {

	public static void main(String[] args) {
		
		int a = 3;
		double sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += -1 * (1 / a * Math.pow(3, i));
			} else {
				sum += (1 / a * Math.pow(3, i));
			}
		}
		
		sum++;
		sum = Math.sqrt(12) * sum;
		System.out.println(sum);

	}

}
