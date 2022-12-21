package Lec_17;
import java.util.*;
public class Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Print(str,"");

	}
public static void Print(String str, String path)
{
	if(str.isEmpty())
	{
		System.out.println(path);
		return;
	}
	char ch=str.charAt(0);
	String val=Option(ch);
	String rem=str.substring(1);
	for(int i=0;i<val.length();i++)
	{
		Print(rem,path+val.charAt(i));
	}
}
public static String Option(char ch)
{
	if(ch=='2')
		return "abc";
	else if(ch=='3')
		return "def";
	else if(ch=='4')
		return "ghi";
	else if(ch=='5')
		return "jkl";
	else if(ch=='6')
		return "mno";
	else if(ch=='7')
		return "pqrs";
	else if(ch=='8')
		return "tuv";
	else
		return "wxyz";
}
}
