package array_programmimg;

public class Secand_high {

	public static void main(String[] args) {
		
         int a[]= {1000,60,40,800,14,054,64,958,1};
		
		int max=a[0],secmax=a[0];
		
		for(int i =0;i<a.length;i++)
		{
			if(max<a[i])
			{
				secmax=max;
				max=a[i];
			}
			else if (secmax<a[i])
			{
				secmax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		

	}

}
