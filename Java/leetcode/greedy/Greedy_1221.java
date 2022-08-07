package greedy;

public class Greedy_1221 {

	public int balancedStringSplit(String s) {
		int balance_count = 0;
		int l_cnt = 0;
		int r_cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('L' == s.charAt(i)) {
				l_cnt++;
			} else {
				r_cnt++;
			}
			if ((l_cnt + r_cnt) != 0 && (l_cnt - r_cnt) == 0) {
				balance_count++;
				l_cnt = 0;
				r_cnt = 0;
			}
		}
		return balance_count;
	}

}
