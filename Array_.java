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
		}
		if(b==true)
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");
    }
}
