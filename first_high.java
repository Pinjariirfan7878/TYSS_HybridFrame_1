package array_programmimg;

public class first_high {

	public static void main(String[] args) {
		
		int a[]= {10,60,40,800,14,054,64,958,1};
		
		int max=a[0];
		
		for(int i =0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}
	

}
