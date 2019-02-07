package com.learn;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findBiggestPthPower1(n));
    }
    
    
    private static int findBiggestPthPower(int number){
        int bigP = 1;
        int time=1;
        //start from 2
        for(int i=2;i*i<=number;i++){
          for(int j=1;Math.pow(i,j)<=number;j++)  
          {
              if(Math.pow(i,j)==number && j > bigP)
              {
                  bigP=j;
              }
          }
        }
        return bigP;
    }
    
    private static int findBiggestPthPower1(int number){
        int bigP = 1;
        int time=1;
        //start from 2
        for(int i=2;i*i<=number;i++){
          for(int j=1;Math.pow(i,j)<=number;j++)  
          {
              if(Math.pow(i,j)==number && j > bigP)
              {
                  bigP=j;
              }
          }
        }
        return bigP;
    }
}