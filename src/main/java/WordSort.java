//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carter Hoversten

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	   sort();
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}
	public String[] getWordRay(){
		return wordRay;
	}
	public void finalPrint()
	{
		for(int i =0; i< getWordRay().length; i++){
			System.out.println("word " + i + " :: " + wordRay[i]);
			
		}
	}
}