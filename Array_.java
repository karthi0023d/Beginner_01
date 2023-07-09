import java.util.*;
class test{
	public static void main(String[] args){

		boolean b=false;
        	String s1="care";
		String s2="race";
		if(s1.length()==s2.length()){
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			b=Arrays.equals(c1,c2);
			if(b==true)
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");

		int[] i={1,3,5,6,8};
		for(int j:i){
			System.out.print(j+"\t");
		}
		
		String [] s={"D","A","B","C"};
		Arrays.sort(s);
		for(String str:s){
			System.out.print(str);
			System.out.print("\t");
		}
		
		String[] str={"A","B","D","C"};
		for(String s:str){
			System.out.print(s+"\t");
		}
	}
	public void string_reverse(){
		String name="ihtrak";
		String temp="";
		char[] c=name.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]>c[j]){
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		//print the reversed string
		System.out.println("\t"+name);
}
