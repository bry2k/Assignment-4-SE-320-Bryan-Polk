import java.util.TreeSet;
import java.io.*;
import java.util.Scanner;
public class QuestionTwoTextAscending 
{
	//QuestionTwoTextAscending.java makes use of QuestionTwoComparator.java as a comparator object
	//QuestionTwoComparator.java organizes the elements in ascending order.
	public static void main(String[] args)
	{
		Scanner fileReader;
		//input.txt is the assumed file name, and is included in the project folder outside of the source folder.
		File inputFile = new File("input.txt");
		try 
		{
			fileReader = new Scanner(inputFile);
			TreeSet<String> wordSet = new TreeSet<String>(new QuestionTwoComparator());
			while(fileReader.hasNext())
			{
				wordSet.add(fileReader.next());
			}
			fileReader.close();
			System.out.println(wordSet);
		}
		catch(FileNotFoundException ex)
		{
			//Exit because no file was found at the expected location.
			System.exit(1);
		}
	}
}