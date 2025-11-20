package h3;

public class H3_main 
{
	
	public static void main (String[] args)
	{
	int i,j, input;

	int [][] einheiten = {{50000, 20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	
	input = 27633;
	
			for(j=0; j<2; j++)
				{
					for(i=0; i<15; i++)
						{
							System.out.print(einheiten[j][i]);
							System.out.print(" ");
		
						}
					System.out.println(" ");
				}
	
	for(i=0; i<15; i++)
	{
		while(einheiten[0][i]<=input)
		{
			input-=einheiten[0][i];
			einheiten[1][i]+=1;
		}
	}
	
	
	for(j=0; j<2; j++)
	{
		for(i=0; i<15; i++)
			{
				System.out.print(einheiten[j][i]);
				System.out.print(" ");

			}
		System.out.println(" ");
	}
	
	
	
}
}


//obere array reihe durchgehen: solange betrag> akt el. ziehe akt. el vom betrag ab und addiere 1 beim unteren, wenn nicht gehe weiter
