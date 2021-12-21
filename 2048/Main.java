package J2048;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Move mv = new Move();
		mv.display();
		
		System.out.println("1 : 위  2: 아래  3: 왼쪽  4: 오른쪽  그외 : 종료" );
		while (true) {
		int n = Integer.parseInt(br.readLine());
		
		if (n == 1) {
			mv.up();
		} else if (n == 2) {
			mv.down();
		} else if (n == 3) {
			mv.left();
		} else if (n == 4) {
			mv.right();
		} else {
			System.out.println("종료");
			break;
		}
		
		}
		
	}

}
