//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Carter Hoversten

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) {
		setWords(sentence);
	    sort();
	}

	public void setWords(String sentence) {
		wordRay = sentence.split(" ");
	}

	public void sort() {
		Arrays.sort(wordRay);
	}
	public String[] getWordRay(){
		return wordRay;
	}
	public String toString(int word) {
		String output = wordRay[word];
		return output + "\n\n";
	}
}