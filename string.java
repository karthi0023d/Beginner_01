import java.util.*;
class Demo{
	public static void main(String[] args){
		String s="CDWSF";
		char[] ch=s.toCharArray();
		for(char c:ch){
			System.out.print(c);
		}
		System.out.println();
		Arrays.sort(ch);
		String s=String.valueOf(ch);
		System.out.println(s);
	}
}

