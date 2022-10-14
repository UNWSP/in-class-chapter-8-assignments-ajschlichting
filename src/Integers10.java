
public class Integers10 {

	public static void main(String[] args) {

		int [] numberList = {5,10,15,20,25,30};
		
		for(int x: numberList)
		{
			System.out.println(x);
			
		}
		System.out.println(" ");
		
		int value;
		
		for (int x=numberList.length - 1; x >= 0; x--) {
			
			value = numberList[x];
			System.out.println(value);
		}
		
		System.out.println("\n");
		
		int sum = 0;
		int count = 0;
		
		for(int x: numberList)
		{
			sum += x;
			count ++;
		}
		System.out.println("The sum of all numbers in the array is " + sum);
		
		System.out.println("\n");
		
		int average = 0;
		average = sum / count;
		System.out.println("The average of all numbers in the array is " + average);
		
		
		
		
		
	}
	
	
	

}
