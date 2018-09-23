package com.practise.java8.patterns.structural.flyweight;

public class FlyWeightClient {

	public static void main(String[] args) {
         Code code = new Code();
         code.setCode("C code");
         
         Platform platform = PlatformFactory.getPlatFormInstance("C");
         platform.execute(code);
         
         code = new Code();
         code.setCode("C code printf");
         
         platform = PlatformFactory.getPlatFormInstance("C");
         platform.execute(code);
         
         code = new Code();
         code.setCode("java code");
         
         platform = PlatformFactory.getPlatFormInstance("JAVA");
         platform.execute(code);
         
        		 
	}

}
