package problems1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Problems1_2822 {

    public static void main(String[] args) throws IOException {
        // 점수 계산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max1 = -1;
        int max2 = -1;
        int max3 = -1;
        int max4 = -1;
        int max5 = -1;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        
        for (int i = 0; i < 8; i++) {
        	if (arr[i] > max1) {
        		max1 = arr[i];
        		i1 = i;
        	}
        }
        arr[i1] = 0;
        i1++;
        
        for (int i = 0; i < 8; i++) {
        	if (arr[i] > max2) {
        		max2 = arr[i];
        		i2 = i;
        	}
        }
        arr[i2] = 0;
        i2++;
        
        for (int i = 0; i < 8; i++) {
        	if (arr[i] > max3) {
        		max3 = arr[i];
        		i3 = i;
        	}
        }
        arr[i3] = 0;
        i3++;
        
        for (int i = 0; i < 8; i++) {
        	if (arr[i] > max4) {
        		max4 = arr[i];
        		i4 = i;
        	}
        }
        arr[i4] = 0;
        i4++;
        
        for (int i = 0; i < 8; i++) {
        	if (arr[i] > max5) {
        		max5 = arr[i];
        		i5 = i;
        	}
        }
        arr[i5] = 0;
        i5++;
        
        int[] arr2 = {i1, i2, i3, i4, i5};
        Arrays.sort(arr2);
        
        System.out.println(max1 + max2 + max3 + max4 + max5);
        for (int i : arr2) {
        	System.out.print(i + " ");
        }
    }
}
