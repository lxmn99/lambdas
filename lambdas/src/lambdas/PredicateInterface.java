package lambdas;
import java.util.*;

public class PredicateInterface {
	
	static boolean checknum(Integer num) {
		return true;
	}
	static boolean checka(String num) {
		if(num.charAt(0)=='a') {
			if(num.length()==3) {
				return true;
			}
			
		}
		return false;
	}
	static boolean palindrome(String str) {
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
			return true;
		else
			return false;
		
	}

}
