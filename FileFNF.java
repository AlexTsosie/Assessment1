//For FNF File part of option 2
package Project1;

import java.io.File;

public class FileFNF {
	public static void main (String[] args) {
	
		{
			File file = new File ("C:\\Users\\atsos\\Desktop\\Books that need to be deleted from list");//this is for putting in a book list of book titles
			
					
		if(file.delete())
        {
        	System.out.println("File deleted !!");
        }
		
		else
		{
			System.out.println("FNF");
		}
		}
	}
}
	


	
