package h2;

public class H2_main 
{
	public static void main (String[] args)
	{
		int n,i, digits;
		int [] a= {0,0,0,0,0,0,0,0,0};
		n=946;
		
		
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
			
		}

		System.out.println("");
		
		String nummer = String.valueOf(n);
		
		char[]ziffer = nummer.toCharArray();
		
		for(i=0; i<ziffer.length;i++)
		{
			//System.out.println(ziffer[i]);
			a[(a.length-1)-(ziffer.length-1)+i]=Character.getNumericValue(ziffer[i]);
		}
		
		
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
			
		}
		
		
		
		
		
		
	}

}
