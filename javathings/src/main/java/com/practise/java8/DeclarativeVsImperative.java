package com.practise.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a demo of declative vs Imperative stype programming approach
 * @author seshshan
 *
 */
public class DeclarativeVsImperative {

	public static void main(String[] args) {

		//First, Imperative style
		
		int numbers[] = {1,2,3,4,5};
		
		//with imperative style we tell how do we do what we want to do
		List<Integer> result= new ArrayList<Integer>();
		
		for(int i:numbers)
			if(i%2 !=0)
				result.add(i);
		
		//with declative style we descive what we want, but not necessarily how to get it
	}

}
