package basics;

public class Lab1 {
	
	public static void main(String[] args)  {
		
		//Write the function that takes a value and returns the sum 1 to n 
	System.out.println(sum(4));

	
	System.out.println("facturial " + fact(5));	
	
	int[] numbers = {5, -2, 0, 234, -438, 63};
	System.out.println("Min:  " + findMin(numbers));
	System.out.println("Max:  " + findMax(numbers));
	System.out.println("Avg:  " + findAvg(numbers));
	}	
	
	public static int findAvg(int[] arr) {
		int sum = 0; 
		for (int n=0; n < arr.length; n++) {
		   sum = sum + arr[n];
	}
	System.out.println("Sum: " + sum);
	return sum/arr.length;
}	
	public static int findMin (int[] arr)  {
		int min = arr[0];
		for (int i=0; i < arr.length; i++) {
			if(arr[i] <min) {
				min = arr[i];
				
			}
		}
		return min; 
	}
		
		public static int findMax (int[] arr)  {
			int max = arr[0];
			for (int i=0; i < arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
					
				}
			}
			return max;
		
		
	}
	public static int sum (int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + "+" + i);
			sum = sum + i;
			System.out.println(" = " + sum);
			
		}
		return sum;
	}	
	
	public static int fact(int n) {
		if (n == 0)  {
			return 1;
		}
		System.out.println(n);
		return fact(n-1)*n;
	}
		
}


