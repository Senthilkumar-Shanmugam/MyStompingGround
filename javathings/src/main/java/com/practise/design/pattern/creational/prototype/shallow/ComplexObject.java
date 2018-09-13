package com.practise.design.pattern.creational.prototype.shallow;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ComplexObject implements Cloneable {
	private Integer id;
    private String name;
    private Record record;
    
    
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
