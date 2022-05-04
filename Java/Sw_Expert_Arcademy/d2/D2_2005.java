package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_2005 {
	
	static int binomial (int n) {
		if (n == 0 || n==1) {
			return 1;
		} else {
			return n * binomial(n-1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int a = 1; a <= t; a++) {
        	int k = Integer.parseInt(br.readLine());
        	System.out.println("#" + a);
     		for(int i=0; i<k; i++){
     			for(int j=0; j<=i; j++){
     				System.out.print(binomial(i) / (binomial(i - j) * binomial(j)) + " ");
     			}
     			System.out.println();
     		}
        }
	}

}
