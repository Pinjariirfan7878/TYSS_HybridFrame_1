package array_programmimg;

public class Second_min {

	public static void main(String[] args) {
		
       int a[]= {10,20,30,40,50,6,70,80,9};
		
		int min=a[0],secmin=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				secmin=min;
				min=a[i];
			}
			else if(secmin>a[i])
			{
				secmin=a[i];
			}
		}
         System.out.println(min);
         System.out.println(secmin);
	
	
	}

	}


