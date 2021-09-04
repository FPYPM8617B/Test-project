package sumdigit;

import java.util.Scanner;

public class sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		while(number>0)
		{
			//find last digit of the number
			digit=number%10;
			//add last digit of the variable sum
			sum=sum+digit;
			//remove last digit of the number
			number=number/10;
		}
		System.out.println("Sum Of Digit"+sum);

	}

}
