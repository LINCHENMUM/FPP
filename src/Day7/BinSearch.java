package Day7;

public class BinSearch {
	public static void main(String[] args) {
		String str = "abcefhklmnop";
		char c = 'e';
		BinSearch search = new BinSearch();
		boolean result = search.search(str, c);
		System.out.println(result);
	}

	public boolean search(String str, char c) {
		boolean result = false;
		if (str.equals("") || str == null)
			result = false;
		else {
			int len = str.length();
			int m = str.length() / 2;
			char ch = str.charAt(m);
			if (len == 1) {
				if (ch == c)
					result = true;
				else
					result = false;
			} else {

				if (ch == c) {
					result = true;
				} else if (c < ch) {
					if (search(str.substring(0, m), c)) {
						result = true;
					} else
						result = false;
				} else if (c > ch) {
					if (search(str.substring(m, str.length()), c)) {
						result = true;
					} else
						result = false;
				}
			}
		}
		return result;
	}
}
