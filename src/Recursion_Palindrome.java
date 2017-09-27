
public class Recursion_Palindrome {
	public static boolean palindrome(String str,int l, int r){
		if(l >= r){
			System.out.println("L="+l);
			System.out.println("r="+r);
			return true;
			
		}
		if(str.charAt(l)==str.charAt(r)){
			//System.out.println("L="+l);
			//System.out.println("r="+r);
			return palindrome(str, ++l, --r);
		}else{
			return false;
		}
	}
	
	public static void main(String[] args){
		String str = "aabaa";
		System.out.print(palindrome(str,0,str.length()-1));
	}
}
