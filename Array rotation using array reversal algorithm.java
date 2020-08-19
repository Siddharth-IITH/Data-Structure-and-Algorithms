/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;


/**
 *
 * @author siddharthgupta
 */
public class RoatateByArrayReversal {
    
    
    static int[] reverse(int[] arr){
        int i =0;
        int[] arr2=new int[arr.length];
        
        while (i <arr.length){
            arr2[arr.length-i-1]=arr[i];
            i++;
            
        }
        
        return arr2;
    }
    
    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int d=4;
        int n=7;
        int[] A=Arrays.copyOfRange(arr, 0, d);
        int[] B=Arrays.copyOfRange(arr, d, n);
        A=reverse(A);
        B=reverse(B);
        for (int i =0;i<arr.length;i++){
            if (i<A.length){
                arr[i]=A[i];
            }
            else{
                arr[i]=B[i-A.length];
            }
        }
        arr=reverse(arr);
        for (int ele:arr)
        System.out.println(ele);
    }
    
}
