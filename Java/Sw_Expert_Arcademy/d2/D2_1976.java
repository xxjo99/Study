package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1976 {

	public static void main(String[] args) throws IOException {
		// ½Ã°¢ µ¡¼À
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			 int[] arr = new int[4];
			 
			 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			 for (int i = 0; i < 4; i++) {
				 arr[i] = Integer.parseInt(st.nextToken());
			 }
			 
			 int hour = arr[0] + arr[2];
			 int min = arr[1] + arr[3];
			 
			 if (min > 59) {
				 if (min == 60) {
					 min = 0;
					 hour++;
				 } else {
					 min -= 60;
					 hour++;
				 }
			 }
			 
			 if (hour > 12) {
				 hour -= 12;
			 }
			 
			 System.out.println("#" + test + " " + hour + " " + min);
			 
		}
		
	}

}
