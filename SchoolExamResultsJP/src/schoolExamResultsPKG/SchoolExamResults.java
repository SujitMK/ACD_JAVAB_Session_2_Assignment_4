package schoolExamResultsPKG;

import java.util.Scanner;

public class SchoolExamResults {

	public static void main(String[] args) {
		
		//Taking dynamic inputs from User
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println();
		
		System.out.println("Enter The Marks Obtained For Mathematics");
		int mathMarks = input.nextInt();
		TestDemo td = new TestDemo(mathMarks);
		
		System.out.println();
		System.out.println("Enter The Marks Obtained For Physics");
		int phyMarks = input.nextInt();
		td = new TestDemo(phyMarks);
		
		System.out.println();
		System.out.println("Enter The Marks Obtained For Chemestry");
		int cheMarks = input.nextInt();
		td = new TestDemo(cheMarks);
		
		int avg = (mathMarks + phyMarks + cheMarks) / 3;
		
		System.out.println();
		
		if (avg > 70)
		{
			System.out.println("Average marks obtained by the candidate is   : " + avg);
			System.out.println("The Grade obtained by the candidate is       : A");
		}
		
		else if (avg >= 60 & avg <= 70)
		{
			System.out.println("Average marks obtained by the candidate is   : " + avg);
			System.out.println("The Grade obtained by the candidate is       : B");
		}
		
		else
		{
			System.out.println("Average marks obtained by the candidate is   : " + avg);
			System.out.println("The Grade obtained by the candidate is       : C");
		}
		
		input.close();

	}

}
