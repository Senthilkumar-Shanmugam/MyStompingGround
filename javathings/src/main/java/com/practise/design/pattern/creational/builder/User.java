package com.practise.design.pattern.creational.builder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class User {
	private final String firstName;     //required
    private final String lastName;      //required
    private final int age;              //optional
    private final String phone;         //optional
    private final String address;       //optional

    
    //there is no constructor .. construction logic is hidden from its represntation
    //abstracted moved away to builder
    private User(UserBuilder builder){
    	 this.firstName = builder.firstName;
         this.lastName = builder.lastName;
         this.age = builder.age;
         this.phone = builder.phone;
         this.address = builder.address;
    }
    
    public static class UserBuilder{
    	private final String firstName;     //required
        private final String lastName;      //required
        private int age;              //optional
        private String phone;         //optional
        private String address;       //optional
        
        public UserBuilder(String firstname,String lastname){
        	this.firstName=firstname;
        	this.lastName=lastname;
        }
        
        public User build(){
        	User user = new User(this);
        	validateUserObject(user);
        	return user;
        }
        
        public UserBuilder age(int age){
        	this.age=age;
        	return this;
        }
        public UserBuilder phone(String phone){
        	this.phone=phone;
        	return this;
        }
        public UserBuilder address(String address){
        	this.address=address;
        	return this;
        }
        private void validateUserObject(User user){
        	
        }
    }
}
