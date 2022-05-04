package d2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D2_1926 {

	public static void main(String[] args) throws IOException {
		// 간단한 369게임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			int count = 0;
			
			if(i<10) {
				if(i%3 == 0) {
					System.out.print("- ");			
				} else {
					System.out.print(i + " ");
				}
			} else {
				String a = Integer.toString(i);
				String[] num = a.split("");
				
				for(int k=0; k < num.length; k++) {
					if(num[k].contains("3") || num[k].contains("6") || num[k].contains("9")) {
						count++;
					}
				}
				
				if(count == 0) {
					System.out.print(i + " ");
				} else {
					for(int z=0; z<count; z++) {
						if(count == 1) {
							System.out.print("-");
						} else {
							System.out.print("-");
						}
					}
					System.out.print(" ");
				}
			}
			
		}
		
	}

}
