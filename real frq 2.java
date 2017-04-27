import java.util.*;

public class Sentence
{
	private String sentance;
	
	public List<Integer> getBlankPositions()
	{
		List<Integer> blanks = new ArrayList<Integer>();
		for(int i = 0; i < sentance.length(); i++)
		{
			if(sentance.substring(i, i+1).equals(" "))
			{
				blanks.add(i);
			}
		}
		return blanks;
	}
	
	public int countWords()
	{
		int count = getBlankPositions().size();
		return count+1;
	}
	
	public String[] getWords()
	{
		List<INteger> posList = getBlankPositions();
		int numWords = countWords();
		String[] wordArr = new String[numWords];
		for(int i = 0; i < numWords; i++)
		{
			if(int i == 0)
			{
				if(posList.size() != 0)
				{
					wordArr[i] = sentance.substring(0, posList.get(0));
				}
				else
				{
					wordArr[i] = sentance;
				}
			}
			else if()
		}
	}
	
}