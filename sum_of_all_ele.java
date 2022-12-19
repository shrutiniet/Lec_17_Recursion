package Lec_17;

public class sum_of_all_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40};
		int ans=Add(0,arr);
		System.out.println(ans);

	}
public static int Add(int idx, int[]arr)
{
	if(idx==arr.length)
		return 0;
	return arr[idx]+Add(idx+1,arr);
	
}
}
