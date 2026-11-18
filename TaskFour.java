import java.util.Scanner;
public class TaskFour{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		for(int i  =1; i <= 10; i++){
			System.out.print("Input a number: ");
			double number = input.nextInt();
			if (i%2 == 0){
				sum+=number;
			}
		}
		double average = sum/10;
		
		System.out.printf("The sum of even indexes is: %.0f", sum);
		
	}
}
			
		