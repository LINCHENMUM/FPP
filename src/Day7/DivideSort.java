package Day7;

public class DivideSort {
	public static void main(String[] args) {
		String input = "zwxuabfkafutbbbb";
		DivideSort divideSort = new DivideSort();
		System.out.println(divideSort.divideSort(input));
	}

	public String divideSort(String str) {
		if (str.length() == 0 || str.length() == 1)
			return str;
		else {
			int len = str.length();
			int mid = len / 2;
			String sleft = str.substring(0, mid);
			System.out.println("divide sleft="+sleft);
			String sright = str.substring(mid, len);
			System.out.println("divide sright="+sright);
			return merge(divideSort(sleft), divideSort(sright));
		}
	}

	public String merge(String a, String b) {
		//System.out.println("left="+a);
		//System.out.println("right="+b);
		char[] arrayCharA = a.toCharArray();
		char[] arrayCharB = b.toCharArray();
		int lenA = arrayCharA.length;
		int lenB = arrayCharB.length;
		int i = 0;
		int j = 0;
		int k = 0;
		char[] resultChar = new char[lenA + lenB];
			while (i < lenA && j < lenB) {
				if (arrayCharA[i] < arrayCharB[j]) {
					resultChar[k] = arrayCharA[i];
					i++;
					k++;
				} else {
					resultChar[k] = arrayCharB[j];
					j++;
					k++;
				}
			} 
			if (i < lenA) 
				System.arraycopy(arrayCharA, i, resultChar, k, lenA - i);
			else if (j < lenB) 
				System.arraycopy(arrayCharB, j, resultChar, k, lenB - j);
				
		String result=String.valueOf(resultChar);
		//System.out.println("merge result="+result);
		return result;
	}
}
