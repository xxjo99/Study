package one_dimensional_array;

import java.util.Scanner;

public class ODA_2577 {

	public static void main(String[] args) {
		// 숫자의 개수
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int mul = a*b*c;
		int [] arr = new int[10];
		while (mul>0) {
			arr[mul%10]++;
			mul = mul / 10;
		}
		for (int i = 0; i<=9; i++) {
			System.out.println(arr[i]);
		}
	}

}
