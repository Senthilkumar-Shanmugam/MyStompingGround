package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class StaticMethodReferenceExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
		
		// using find numbers App1. using annoymous class
		findNumbers(list, new BiPredicate<Integer, Integer>() {
			@Override
			public boolean test(Integer n1, Integer n2) {
				n1 = n1+22;
				return StaticMethodReferenceExample.isMoreThanFifty(n1, n2);
			}
		});
		
		// Appr2 : using lambda
		findNumbers(list, (n1,n2) -> StaticMethodReferenceExample.isMoreThanFifty(n1, n2));
		
		//App 3: using method Reference
		findNumbers(list, StaticMethodReferenceExample::isMoreThanFifty);

	}

	public static boolean isMoreThanFifty(int n1, int n2) {
		return (n1 + n2) > 50;
	}

	public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
		List<Integer> newList = new ArrayList<>();
		for (Integer i : l) {
			if (p.test(i, i + 10)) {
				newList.add(i);
			}
		}
		return newList;
	}

}
