package lambdas;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Lambdas {
	public static List filter(List<String> list,Predicate<String> predicate) {
		List finalList=new ArrayList<>();
		for(String num:list) {
			if(predicate.test(num)) {
				finalList.add(num);
			}
		}
		return finalList;
	}
	public static List<String> geta3(List<String> list,Predicate<String> predicate) {
		List<String> result=new ArrayList<>();
		for(String num:list) {
			if(predicate.test(num)) {
				result.add(num);
			}
		}
		return result;
	}
	
	public static int getavg(List<Integer> avg,int i, Predicate<Integer> predicate) {
		int sum=0,count=0;
		for(Integer num:avg) {
			if(predicate.test(num)) {
				sum+=num;
				count++;
			}
		}
		return sum/count;
		
	}
	public static void main(String[] args) {
		Integer []ar= {2,3,4,5,1,7,8};
		List<Integer> avg=Arrays.asList(ar );
		Predicate<Integer> predicate=PredicateInterface::checknum;
		int average=getavg(avg,avg.size(),predicate);
		System.out.println("Average is:"+average);
		String str[]= {"aaa","ewr","benz","mmm","and","most"};
		Predicate<String> predicate1=PredicateInterface::checka;
		List<String> list=Arrays.asList(str);
		List<String> result=geta3(list,predicate1);
		System.out.println("Strings with startng letter 'a' and has 3 letters:"+result);
		Predicate<String> predicate2=PredicateInterface::palindrome;
		List<String> palindromes=filter(list,predicate2);
		System.out.println("Palindromes:"+palindromes);

} 
}

