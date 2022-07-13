package math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Math_2775 {

	public static void main(String[] args) throws IOException {
		// �γ�ȸ���� ���׾�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[][] apart = new int[15][15];
		
		for (int i = 0; i < 15; i++) {
			apart[i][1] = 1;
			apart[0][i] = i;
		}
		
		for(int k = 1 ; k < 15 ; k++) {
			for( int n = 2 ; n < 15 ; n++) {
				apart[k][n] = apart[k][n-1] + apart[k-1][n];
			}
		}
		
		for (int test = 0; test < t; test++) {
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());
			
			System.out.println(apart[floor][room]);
		}
		
	}

}
