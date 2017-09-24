package schoolExamResultsPKG;

public class TestDemo {
	
	public TestDemo(int marksInput)
	{
		if (marksInput == 0)
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
		
		char ascii = (char)marksInput;
		System.out.println("The ASCII Value Of The Number You Entered Is: "+ ascii);
	}
}