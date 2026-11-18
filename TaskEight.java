import java.util.Scanner;
public class TaskEight{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int sum = 0;
		while(counter <= 10){
			System.out.print("Input a number between 1 and 100: ");
			int number = input.nextInt();
			if(number > 100 || number < 0){
				System.out.println("Invalid input");
			}
			else{
				sum+=number;
				counter++;
			}
		}
		System.out.printf("The sum of the numbers is : %d", sum);
	}
}
				
			
			
				
		