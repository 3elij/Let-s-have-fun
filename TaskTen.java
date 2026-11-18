import java.util.Scanner;
public class TaskTen{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		
		double sum = 0;
		int validNumberCounter = 0;
		for(int i =1; i <= 10; i++){
			System.out.print("Input a number between 1 and 100: ");
			double number = input.nextInt();
			if(number < 100 && number > 0){
				sum+=number;
				validNumberCounter++;
				
			}
		}
		double average = sum/validNumberCounter;
		System.out.printf("The average of the valid numbers is : %.1f", average);
	}
}
				
			
			
				
		