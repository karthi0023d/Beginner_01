import java.util.*;
class Methods{
	static String s="Welcome to java";
	public static String m1(){
		return s;
	}
	public static String m2(){
		String str="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)== 'a'|s.charAt(i)=='e'|s.charAt(i)=='o'|s.charAt(i)=='i'|s.charAt(i)=='u'){
				continue;
			}else{
				str=str+s.charAt(i);
			}
		}
		return str;
	}
		
	public static void main(String[] args){
		String s1=m1();
		System.out.println(s1);
		String s2=m2();
		//System.out.println(s2); - Wlcm t jv
		System.out.println(m2()); // - Wlcm t jv
	}
}
