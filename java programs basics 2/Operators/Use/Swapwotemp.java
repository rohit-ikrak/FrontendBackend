import java.util.Scanner;
class Swapwotemp{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double first = sc.nextInt();
		System.out.println("Enter the Second number: ");
		double second = sc.nextInt();
		
		first = first + second;
		second = first - second;
		first = first - second;

		System.out.println("\t\t\t\tAfter Swapping \n\nFirst number is: " + first + " and Second number is: " + second);
		
	}
}
