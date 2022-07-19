package dynamicProgramming;

public class DP_70 {
	static Integer[] arr = new Integer[46];
	
	public static int dp(int n) {
		arr[1] = 1;
		arr[2] = 2;
		
		if (arr[n] == null) {
			arr[n] = dp(n - 1) + dp(n - 2); 
		}
		
		return arr[n];
		
	}
	
    public static int climbStairs(int n) {
        return dp(n);
    }

	public static void main(String[] args) {
		// Climbing Stairs
		int n = 5;
		System.out.println(climbStairs(n));

	}

}
