package com.practise.design.pattern.creational.prototype.deep;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Item implements Cloneable{
	 private String title;
	    private double price;
	    private String url;
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

}
