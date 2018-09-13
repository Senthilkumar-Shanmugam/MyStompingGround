package com.practise.design.pattern.creational.builder;

public class BuilderPatternClient {

	public static void main(String[] args) {
        User u1 = new User.UserBuilder("Senthil", "kumar").age(12).phone("safdsaf")
        		      .address("zsfsafsa").build();
        
        
        User u2 = new User.UserBuilder("test", "last").build();
        
	}

}
