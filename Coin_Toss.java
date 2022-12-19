package Lec_17;
import java.util.*;
public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CoinT(n,"");

	}
public static void CoinT(int n, String path)
{
	if(n==0)
	{
		System.out.println(path);
		return;
	}
	CoinT(n-1,path+"H");
	CoinT(n-1,path+"T");
}
}
