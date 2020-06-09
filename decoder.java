import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class decoder {

	public static void main(String[] args) 
	{
		Logger.getGlobal().setLevel(Level.INFO);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a codon: ");
		String codon = in.next().toUpperCase();
		char first = codon.charAt(0);
		char second = codon.charAt(1);
		char third = codon.charAt(2);
		
		if(first=='U') 
		{
			if (second=='U') 
			{
				if(third=='U'||third=='C')
					System.out.print("Phe");
				else
					System.out.print("Leu");
			}
			else if (second =='C')
				System.out.print("Ser");
			else if (second == 'A')
			{
				if(third == 'U'||third == 'C')
					System.out.print("Tyr");
				else
					System.out.print("Stop");
			}
			
			else // if second letter is G
			{
				if(third == 'U'|| third == 'C')
					System.out.print("Cys");
				else if(third == 'G')
					System.out.print("Trp");
				else
					System.out.print("Stop");
			}
		}
		
		else if (first == 'C') 
		{
			if(second=='U')
				System.out.print("Leu");
			else if(second=='C')
				System.out.print("Pro");
			else if(second == 'A') 
			{
				if (third == 'U'||third=='C')
					System.out.print("His");
				else
					System.out.print("Gln");
			}
			else
				System.out.print("Arg");
		}
		
		else if (first =='A') 
		{
			if(second=='U') 
			{
				if (third=='U'||third=='C'||third=='A')
					System.out.print("Ile");
				else
					System.out.print("Met");
			}
			else if (second == 'C')
				System.out.print("Thr");
			else if(second == 'A') 
			{
				if (third=='U'||third=='C')
					System.out.print("Asn");
				else
					System.out.print("Lys");
			}
			
			else {
				if(third=='U'||third=='C')
					System.out.print("Ser");
				else
					System.out.print("Arg");
			}
			
		}
		else 
		{
			if(second=='U')
				System.out.print("Val");
			else if(second=='C')
				System.out.print("Ala");
			else if(second =='A') 
			{
				if(third=='U'||third=='C')
					System.out.print("Asp");
				else
					System.out.print("Glu");
				
			}
			else
				System.out.print("Gly");
		}
		
		System.out.print("\n"+"Thank you for using this program");
		
		
		
		
	        }
	        
	       
	}
		
	

