package math1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Math_1011 {

	public static void main(String[] args) throws IOException {
		// Fly me to the Alpha Centauri
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 0; test < t; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double x = Double.valueOf(st.nextToken());
			double y = Double.valueOf(st.nextToken());
			
			System.out.println(move(x, y));
		}
		
	}
	
	public static int move(double x, double y) {
		double distance = y - x;
		double max = Math.round(Math.sqrt(distance));
		
		if (distance > Math.pow(max, 2)) {
			return (int)max * 2;
		} else {
			return (int)max * 2 - 1;
		}
	}

}
