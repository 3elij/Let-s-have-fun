import java.util.Scanner;
public class TaskTwo{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		for(int i  =1; i <= 10; i++){
			System.out.print("Input a number: ");
			double number = input.nextInt();
			sum+=number;
		}
		double average = sum/10;
		System.out.printf("The average is: %.1f", average);
		
	}
}
			
		