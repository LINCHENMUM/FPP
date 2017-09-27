package Day7;

public class MinSort {
	public static void main(String[] args) {
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}

	public String sort(String s) {
		if (s == "" || s == null) {
			return "";
		} else {
			int len = s.length();
			if (len == 1)
				return s;
			else {
				char temp;
				char[] charString = s.toCharArray();
				int min = getMinPosition(s);
				temp = s.charAt(min);
				charString[min] = s.charAt(0);
				charString[0] = s.charAt(temp);
				String newString = s.substring(1, len - 1);
				return temp + sort(newString);
			}
		}

	}
	public String getMinIndex(String a, String b){
		if (a.compareTo(b)>=0)
			return b;
	}
	public int getMinPosition(String s){
		if (s == "" || s == null) {
			return 0;
		} else {
			int len = s.length();
			if (len == 1)
				return 1;
			else {
				
			}
		}
	}
	

}
