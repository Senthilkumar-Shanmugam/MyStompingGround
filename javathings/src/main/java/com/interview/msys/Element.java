package com.interview.msys;

/**
 * Flyweight interface.
 * currently does not have any intrinsic state.
 * value of flyweight impl will be extrinsic contextual info
 * @author senthilkumarshanmugam
 *
 */
public interface Element {
	public void printVal(String val) throws InterruptedException;//extrinsic value is passed as contextual data

}
