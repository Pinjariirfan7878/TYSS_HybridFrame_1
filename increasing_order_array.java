package array_programmimg;

public class increasing_order_array {

	public static void main(String[] args) {
		
		 int a[]= {10,20,3,40,50,6,70,80,9};
		 
		 for(int i=0;i<a.length;i++)
		 {
			 int temp;
			 for(int j=0;j<a.length-1;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					 temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
		 }
          for(int k=0;k<a.length;k++)
          {
        	  System.out.print(a[k]+" ");
          }
	}

}
