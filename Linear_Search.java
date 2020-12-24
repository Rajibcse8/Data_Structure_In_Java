

package mypractice;


/*
..................
******************
*................*
*.....RAJIB......* 
*................* 
******************
..................
*/


import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import static java.lang.Integer.min;
import static java.lang.Integer.max;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.lang.*;


public class DataStructure {
    
    
    public static void  isfound(int [] arr, int val){
           boolean flag=false;        
          for(int i=0;i<arr.length;i++){
              if(arr[i]==val){flag =true; break;}
          }    
         
         System.out.println(flag==true? " Number Found":"Number Not found"); 
    }
    
    
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      
        System.out.print("Enter The total amount of number : ");  
        int n= scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr=new int[n];
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter Those  Number Below:");
        for(int i=0;i<n;i++)arr[i]=scan.nextInt();
        System.out.println("Enter The Number You Search :");
        int val=scan.nextInt();
        
        isfound(arr,val);
        
    }}
