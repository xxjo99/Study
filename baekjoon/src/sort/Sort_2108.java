package sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class Sort_2108 {

	public static void main(String[] args) throws IOException {
		// ≈Î∞Ë«–
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int[] arr = new int[n];
		int[] check = new int[8001];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			check[arr[i]+4000]++;
		}
		
		// ªÍº˙∆Ú±’
		System.out.println((int) Math.round((double) sum / n));
		
		// ¡ﬂæ”∞™
		Arrays.sort(arr);
		System.out.println(arr[n/2]);
		
		// √÷∫Û∞™
		int max = 0;
		ArrayList<Integer> list = new ArrayList<>(); 
		for (int i = 0; i < 8001; i++) {
			if (check[max] < check[i]) {
				max = i;
				list.clear();
			} else if (check[i] != 0 && check[i] == check[max]) {
				list.add(i-4000);
			}
		}
		
        if(list.size()!=0) {
            System.out.println(list.get(0));
        } else {
            System.out.println(max-4000);
        }
        
    	// π¸¿ß
    	System.out.println(arr[n-1] - arr[0]);
	}

}
