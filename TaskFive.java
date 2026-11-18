import java.util.Scanner;
public class TaskFive{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		for(int i  =1; i <= 10; i++){
			System.out.print("Input a number: ");
			double number = input.nextInt();
			if (number%2 == 0){
				sum+=number;
			}
		}
		
		
		System.out.printf("The sum of even numbers is: %.1f", sum);
		
	}
}
			
		