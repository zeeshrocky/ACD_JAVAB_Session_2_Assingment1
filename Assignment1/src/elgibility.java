import java.util.Scanner;

public class elgibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Age: ");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		
		if(x<18){
			System.out.println("You are not Eligible to cast your Vote");
		}
		else{
			System.out.println("You are Eligible to cast your Vote");
		}
	}
}
