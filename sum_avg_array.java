package array_programmimg;

public class sum_avg_array {

	public static void main(String[] args) {
		 int a[]= {10,20,30,40,50,6,70,80,9};
		 int sum=0;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 
		 System.out.println("Sum of array is "+sum);
		 float avg=(float)sum/a.length;
		 System.out.println("avg of array is "+avg);
		 
	}

}
