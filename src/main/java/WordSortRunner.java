//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carter Hoversten

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort ws = new WordSort("abc ABC 12321 fred alexander");
		for(int i =0; i< ws.getWordRay().length; i++){
			System.out.print("word " + i + " :: " + ws.toString(i));
		}
		System.out.println("");
		WordSort ws2 = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		for(int i =0; i< ws2.getWordRay().length; i++){
			System.out.print("word " + i + " :: " + ws2.toString(i));
		}
		System.out.println("");
		WordSort ws3 = new WordSort("b x 4 r s y $");
		for(int i =0; i< ws3.getWordRay().length; i++){
			System.out.print("word " + i + " :: " + ws3.toString(i));
		}
		System.out.println("");
		WordSort ws4 = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		for(int i =0; i< ws4.getWordRay().length; i++){
			System.out.print("word " + i + " :: " + ws4.toString(i));
		}
		//add test cases to test your WordSort Class
	}
}