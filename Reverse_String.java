package Lec_17;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello SS!!";
		//Print1(str.length()-1,str);
		String ans=Print2(str.length()-1,str);
		System.out.println(ans);

	}
public static void Print1(int idx, String str)
{
	if(idx<0)
		return;
	System.out.print(str.charAt(idx));
	Print1(idx-1,str);
}
public static String Print2(int idx,String str)
{
	if(idx<0)
		return new String();
	String snew=Print2(idx-1,str);
	return str.charAt(idx)+snew;
	
}
}
