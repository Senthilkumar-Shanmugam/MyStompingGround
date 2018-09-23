package com.interview.msys;

import java.util.concurrent.TimeUnit;

/**
 * currently nothing to add.just represents a type of element
 * added for extensibility and add any future intrinsic state
 * @author senthilkumarshanmugam
 *
 */
public class StringIndexElement implements Element {

	@Override
	public void printVal(String val) throws InterruptedException {
	   System.out.println(val);	
	   TimeUnit.SECONDS.sleep(60);
	}

}
