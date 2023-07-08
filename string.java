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

		String str="DCSAE";
		char[] chr=str.toCharArray();
		char temp;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(chr[i] > chr[j]){
					temp=chr[i];
					chr[i]=chr[j];
					chr[j]=temp;
				}
			}
			System.out.print(chr[i]);
		}
	}
}

