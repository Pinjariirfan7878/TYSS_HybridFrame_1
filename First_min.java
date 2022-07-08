package array_programmimg;

public class First_min {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,50,6,70,80,90};
		
		int min=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
  System.out.println(min);
	}

}
