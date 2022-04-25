// Java Program to read an Array of n elements and implement //
//BINARY SEARCH using Array class methods//

import java.util.Arrays;
import java.util.*;
public class binarySearch {
      public static void main(String[] args) {
        int n,key,res;
        Boolean r;
        System.out.println("Enter number of Array Elements");
        Scanner inp=new Scanner(System.in);
        n=inp.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements");
      for(int i=0;i<n;i++)
          arr[i]=inp.nextInt();
      System.out.println("Array Elements Entered are");
      for(int i=0;i<n;i++) 
      System.out.println("arr[i]");
      System.out.println("Perform Binary Search");
      Arrays.sort(arr);
      System.out.println("Sorted Array");
      for(int i=0;i<n;i++)
      System.out.println("arr[i]");
      System.out.println("Enter the element to be searched");
      key=inp.nextInt();
      res=Arrays.binarySearch(arr,key);
      if(res>=0 && res<=n-1)
          System.out.println(key+"found at index ="+res);
      else
          System.out.println(key+"not found");
      
         int a[]={33,3,4,5};
         int b[]={33,3,4,5};
         System.out.println("Array A");
         for (int x:a)
             System.out.println(x);
         System.out.println("Array B");
         for (int x:b)
             System.out.println(x);
         r=Arrays.equals(a,b);
         if(r==true)
             System.out.println("Arrays A and B are Equal");
         else
             System.out.println("Arrays A and B are not Equal");
    }

   }
        
