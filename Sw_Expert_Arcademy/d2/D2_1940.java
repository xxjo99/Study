package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D2_1940 {

	public static void main(String[] args) throws IOException {
		// °¡¶ù! RCÄ«!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());
			int speed = 0;
			int distance = 0;
			
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int command = Integer.parseInt(st.nextToken());
				
				if (command != 0) {
					int a = Integer.parseInt(st.nextToken());
					if (command == 1) {
						speed += a;
						distance += speed;
					} else {
						speed -= a;
						if (speed < 0) {
							speed = 0;
						}
						distance += speed;
					}
				} else {
					distance += speed;
				}
				
			}

			System.out.println("#" + test + " " + distance);

		}
		
	}

}
