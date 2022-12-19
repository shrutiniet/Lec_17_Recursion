package Lec_17;

public class Sequence_with_ascii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABC";
		Sequence(str,"");

	}
public static void Sequence(String str, String path)
{
	if(str.length()==0)
	{
		System.out.println(path);
		return;
	}
	char ch=str.charAt(0);
	String remaining=str.substring(1);
	Sequence(remaining,path+ch);
	Sequence(remaining,path);
	Sequence(remaining,path+(int)(ch));
}
}
