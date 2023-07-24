import java.util.Scanner;

public class parts {

	static void partsStock(){
		Scanner sc = new Scanner(System.in);
		int n;

		int[] num = new int[5];

		System.out.println("Enter how many numbers you would like to enter in the array >>> ");
		n= sc.nextInt();

		int sum = n+1;



		try{
			System.out.println("Enter your "+sum+" numbers >>> ");

			for(int i =0; i<=n; i++ ){
				num[i] =  sc.nextInt();
			}

		}
		catch (Exception e){
			System.out.println("Too many numbers to store in a small space, down size");


		}
	}
}
