package com.algorithms.sorting;

public class InsertionSort {
	
	public static void main(String []args) {
	 int [] inp = {4,-31,0,99,83,1};
	
	  int i=1,j=0;
	  while(i < inp.length) {
		  j = i-1;
	      int tmp = inp[i];

		  while(j>=0 && tmp < inp[j]) {
	        inp[j+1]=inp[j];
	        j--;
		  }
		  
	      inp[j+1]=tmp;
		  i++;
	  }
	  for(int e:inp)
			 System.out.print(" "+e);
		}
	}
	 
