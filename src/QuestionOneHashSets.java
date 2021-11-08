import java.util.LinkedHashSet;
public class QuestionOneHashSets 
{
	@SuppressWarnings("unchecked")	//Clearly casting a cloned object to its original type as shown in the file. Warnings unnecessary.
	public static void main(String[] args)
	{
		LinkedHashSet<String> setOne = new LinkedHashSet<String>();
		LinkedHashSet<String> setTwo = new LinkedHashSet<String>();
		
		setOne.add("George");
		setOne.add("Jim");
		setOne.add("John");
		setOne.add("Blake");
		setOne.add("Kevin");
		setOne.add("Michael");
		
		setTwo.add("George");
		setTwo.add("Katie");
		setTwo.add("Kevin");
		setTwo.add("Michelle");
		setTwo.add("Ryan");
		
		//Union: The union of unionSetOne and unionSetTwo stored in unionSetOne.
		LinkedHashSet<String> unionSetOne = (LinkedHashSet<String>)setOne.clone();
		LinkedHashSet<String> unionSetTwo = (LinkedHashSet<String>)setTwo.clone();
		unionSetOne.addAll(unionSetTwo);
		
		//Difference: The difference of differenceSetOne and differenceSetTwo stored in differenceSetOne. 
		//differenceSetTwo does not necessarily retain original values.
		LinkedHashSet<String> differenceSetOne = (LinkedHashSet<String>)setOne.clone();
		LinkedHashSet<String> differenceSetTwo = (LinkedHashSet<String>)setTwo.clone();
		LinkedHashSet<String> holdingSet = (LinkedHashSet<String>)setOne.clone();		//temporary set to retain initial values of setOne
		differenceSetOne.addAll(differenceSetTwo);
		differenceSetTwo.retainAll(holdingSet);
		for(String name : differenceSetTwo)
		{
			differenceSetOne.remove(name);
		}

		//Intersection:	The intersection of intersectionSetOne and intersectionSetTwo stored in intersectionSetOne.
		LinkedHashSet<String> intersectionSetOne = (LinkedHashSet<String>)setOne.clone();
		LinkedHashSet<String> intersectionSetTwo = (LinkedHashSet<String>)setTwo.clone();
		intersectionSetOne.retainAll(intersectionSetTwo);
	}
}
