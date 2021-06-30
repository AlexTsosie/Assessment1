//Second option part 1 on adding a file to the directory list
package Project1;
import java.io.FileInputStream;
import java.io.IOException;


public class SortFilePart2{

	public static void main (String args[]) throws IOException {
	
			FileInputStream fin= new FileInputStream ("C:\\Users\\atsos\\Desktop\\Project1\\ScienceFiciontList.txt");
			System.out.println(fin.getChannel());
			System.out.println("Number of bytes read:" + fin.available());
	}
}
			
		