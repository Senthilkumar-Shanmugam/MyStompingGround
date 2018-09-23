package com.practise.java8.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the flyweight factory that manages creation and caching of flyweight objects
 * @author seshshan
 *
 */
public final  class PlatformFactory {
	private static Map<String,Platform> map = new HashMap();
	
	private PlatformFactory() {
		throw new AssertionError("cannot instantiate class");
	}
	
	
	public static synchronized Platform getPlatFormInstance(String platformType) {
		Platform platform = map.get(platformType);
		
		if(platform==null) {
			switch(platformType) {
				case "C" : platform = new CPlatfrom();
				           break;
				           
				case "JAVA":
					        platform = new JavaPlatform();
					        break;
			}
			map.put(platformType, platform);
		}
		return platform;		
	}

}
