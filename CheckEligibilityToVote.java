package session2.assignment1;

import java.util.Scanner;

public class CheckEligibilityToVote {

	public static void main(String[] args) {
		/*int age=Integer.parseInt(args[0]);//java.lang.Integer
		System.out.println("Your age is :"+args[0]);*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		System.out.println(name+", Your age is :"+age);
		if(age>=18)
			System.out.println("Congratulations:-) You are eligible to vote "); 
		else
			System.out.println("Sorry:-( You can't vote");
		
	}

}
