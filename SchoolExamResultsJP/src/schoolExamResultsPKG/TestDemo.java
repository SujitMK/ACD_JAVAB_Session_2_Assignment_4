package schoolExamResultsPKG;

public class TestDemo {
	
	public TestDemo(int marksInput)                                          // Constructor with an argument
	{
		if (marksInput == 0)                                              // Checking the input values
		{
			System.out.println("You Have Entered Zero");
		}
		
		if (marksInput > 0)
		{
			System.out.println("You Have Entered Positive Value");
		}
		
		else 
		{
			System.out.println("You Have Entered Negative Value");
		}
		
		char ascii = (char)marksInput;                                                  // Getting the ASCII for the input marks
		System.out.println("The ASCII Value Of The Number You Entered Is: "+ ascii);
	}
}
