import java.util.Scanner;
public class TaskNine{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i =1; i <= 10; i++){
			System.out.print("Input a number between 1 and 100: ");
			int number = input.nextInt();
			if(number < 100 && number > 0){
				sum+=number;
				
			}
		}
		System.out.printf("The sum of the valid numbers is : %d", sum);
	}
}
				
			
			
				
		