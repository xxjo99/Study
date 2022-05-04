package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class D3_12368 {

	public static void main(String[] args) throws IOException {
		// 24½Ã°£
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = a + b;
			
            if(result >= 24) {
                while(result >= 24) {
                	result = result - 24;
                }
            } else {
            	result = a+b;
            }
            
            System.out.print("#" + i + " ");
            System.out.println(result);
		}
	}

}
