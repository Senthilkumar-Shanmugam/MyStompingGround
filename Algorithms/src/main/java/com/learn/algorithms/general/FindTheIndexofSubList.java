import java.util.Scanner;

package com.learn.algorithms.general;

public class FindTheIndexofSubList {
    public static void main(String args[] ) throws Exception {
         Scanner in = new Scanner(System.in);
         
          System.out.println("Enter the size of list 1");
          int len1 = in.nextInt();
          int list1[] = new int[len1];
          System.out.println("Enter values for list one");
          for(int i=0;i<len1;i++){
              list1[i]=in.nextInt();
          }
          
          System.out.println("Enter values for list2");
          int len2 = in.nextInt();
          int list2[] = new int[len2];
          System.out.println("Enter values for list2");
          for(int i=0;i<len2;i++){
              list2[i]=in.nextInt();
          }
        System.out.println("index of sub list in the main list>>"+find(list1,list2));
    }
    
    //initially start with brute force 
    private static int find(int []list1,int [] list2){
        //first find the position of the fisrt element of sublist in list1
        
        int firstelem = list2[0];
        int pos = -1;//position of 1st elem in list1
        for(int i=0;i<list1.length;i++){
            if(list1[i]==firstelem){
                pos = i;
                break;
            }
        }
         if(pos==-1){
             return -1;
         }   
         //start to compare elemets from the position 2nd elemnt of subarray
            int j=pos+1;
            for(int i=1;i<list2.length;i++){
                if(list2[i]!=list1[j])
                    return -1;
                else
                    j++;
            
                
        }
        return pos;
    }
}