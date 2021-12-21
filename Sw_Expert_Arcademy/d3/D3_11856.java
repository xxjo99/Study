package d3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class D3_11856 {

	public static void main(String[] args) throws IOException {
		// ¹Ý¹Ý
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			String s = br.readLine();
			char[] arr = s.toCharArray();
			
            int count = 0;
             
            int[] alp = new int[26];
            
            for(int j=0; j < arr.length; j++) {
                alp[arr[i]-65]++;
            }
             
            String result = "Yes";
            for (int j = 0; j < alp.length; j++) {
                if(alp[i] != 0) {
                    count++;
                    if(alp[i] != 2) {
                        result = "No";
                        break;
                    }
                }
            }
             
            if(count != 2)
                result = "No";
             
            System.out.printf("#%d %s \n", i, result);
		}
	}

}
