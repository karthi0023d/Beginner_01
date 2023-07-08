class Conversion{
  public void Integral{
    String s="a23d345g";
    String str="";
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)>='0' && s.charAt(i)<='9'){
        str=str+s.charAt(i);
      }
    }
    System.out.println(Integer.parseInt(str));
  }
}
      
