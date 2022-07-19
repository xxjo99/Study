package string;

public class String_14 {

	public static String longestCommonPrefix(String[] strs) {
		String prefix = "";

		if (strs.length == 0) {
			return prefix;
		}

		prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			String s = strs[i];
			while (s.indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}

		return prefix;

	}

	public static void main(String[] args) {
		// Is Subsequence
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}

}
