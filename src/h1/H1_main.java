package h1;

public class H1_main 
{
	
	public static void main (String[] args)
	{
		
	int i, y;
	int [] myArray = {3,2,5,6};
	
	
	
	for(i=0; i<myArray.length/2; i++)
	{
		
		y=myArray[i];
		myArray[i]= myArray[myArray.length-1-i];
		myArray[myArray.length-i-1]=y;
		
		
	}
	
	}	
	
}

