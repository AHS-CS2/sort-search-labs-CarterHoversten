//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		//You will need to use Math.random()
		int[] array = new int[size];
		for(int i = 0; i< size; i++){
			int insert = (int)(Math.random()*10);
			if(insert != 0){
				array[i] = insert;
			}
			else{
				array[i] = 1;
			}
			 
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		int storeAdd = 0;
		int store = 0;
		for(int i = 0; i< array.length;i++){
			if(array[i] == 7){
				store = array[storeAdd];
				array[storeAdd] = array[i];
				array[i] = store;
				storeAdd++;
			}
		}

	}
}