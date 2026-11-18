import java.util.Scanner;
public class TaskSix{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int evenNumberCounter = 0;
		double sum = 0;
		for(int i  =1; i <= 10; i++){
			System.out.print("Input a number: ");
			double number = input.nextInt();
			if (number%2 == 0){
				sum+=number;
				evenNumberCounter++;
			}
		}
		double average = sum/evenNumberCounter;
		System.out.printf("The average of even numbers is: %.2f", average);
		
		
	}
}
			
		