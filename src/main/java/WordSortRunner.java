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
		ws.finalPrint();
		System.out.println("");
		WordSort ws2 = new WordSort("a zebra friendly acrobatics 435 TONER PRinTeR");
		ws2.finalPrint();
		System.out.println("");
		WordSort ws3 = new WordSort("b x 4 r s y $");
		ws3.finalPrint();
		System.out.println("");
		WordSort ws4 = new WordSort("123 ABC abc 034 dog cat sally sue bob 2a2");
		ws4.finalPrint();
		//add test cases to test your WordSort Class
	}
}