package com.learn.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutationUsingRecusion {

	public static void main(String[] args) {
      String s = "abc";
      List<String> perms = new ArrayList<String>();
      System.out.println(permute(s, perms));
	}

	private static List<String> permute(String s,List<String> list) {
       if(s.length() == 0) {
    	   return Collections.EMPTY_LIST;
        }else if(s.length()==1) {
    	   list.add(s);
    	   return list;
       }else if(s.length()==2) {
    	   list.add(s);
    	   list.add(new StringBuffer(s).reverse().toString());
    	   return list;
       }else {
    	   char last = s.charAt(s.length()-1);
    	   permute(s.substring(0, s.length()-1),list);
    	   return insertLast(list,last);
       }
    	   
	}

	//insert last char at every possible position.
	private static List<String> insertLast(List<String> list, char last) {
		List<String> newList = new ArrayList<String>();
		
		for(int i=0;i<=list.size();i++) {
			for(String ss:list) {
				newList.add(new StringBuffer(ss).insert(i,last).toString());
			}
		}
		
		return newList;
	}

}
