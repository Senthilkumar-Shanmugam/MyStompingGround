package com.learn.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutationUsingRecusion {

	public static void main(String[] args) {
		String s = "abcd";
		List<String> perms = new ArrayList<String>();
		permute(s, perms);
		Collections.sort(perms);
		System.out.println(perms);
	}

	private static void permute(String s, List<String> list) {
		if (s.length() == 0) {
		} else if (s.length() == 1) {
			list.add(s);
		} else if (s.length() == 2) {
			list.add(s);
			list.add(new StringBuffer(s).reverse().toString());
		} else {
			char last = s.charAt(s.length() - 1);
			permute(s.substring(0, s.length() - 1), list);
			insertLast(list, last);
		}

	}

	// insert last char at every possible position.
	private static void insertLast(List<String> list, char last) {
		List<String> newList = new ArrayList<String>();

		for (int i = 0; i <= list.get(0).length(); i++) {
			for (String ss : list) {
				newList.add(new StringBuffer(ss).insert(i, last).toString());
			}
		}
		list.clear();
		list.addAll(newList);
	}

}
