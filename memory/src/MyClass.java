
public class MyClass
{
	public void references()
	{
		int[] myIntArray = new int[4];
		myIntArray[0] = 2;
		myIntArray[1] = 4;
		myIntArray[2] = 6;
		myIntArray[3] = 8;
		
		
		int[] mySecondArray = null;
		
		mySecondArray = myIntArray;
		
		myIntArray = null;
		
	}

}
