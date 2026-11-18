import java.util.Scanner;
public class TaskOne{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i  =1; i <= 10; i++){
			System.out.print("Input a number: ");
			int number = input.nextInt();
			sum+=number;
		}
		System.out.println("The sum is "+sum);
		
	}
}
			
		