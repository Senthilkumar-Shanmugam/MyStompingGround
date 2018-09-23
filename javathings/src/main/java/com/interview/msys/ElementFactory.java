package com.interview.msys;

import java.util.HashMap;
import java.util.Map;


/**
 * Factory that take care of instantiation and caching of similar type of objects
 * @author senthilkumar shanmugam
 *
 */
public final class ElementFactory {
	private static Map<String,Element> map = new HashMap<String,Element>();

	private ElementFactory() {
		throw new AssertionError("cannot instantiate class");
	}
	
	
	public static synchronized Element getElemantInstance(String elementType) {
		Element element = map.get(elementType);
		
		if(element==null) {
			switch(elementType) {
				case "String" : element = new StringIndexElement();
				                break;
				           
			
			}
			map.put(elementType, element);
		}
		return element;		
	}


}
