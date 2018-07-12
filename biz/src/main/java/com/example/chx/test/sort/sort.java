package com.example.chx.test.sort;

import java.util.Arrays;

/**
 * @author: mzq
 * @date: 2018/7/3
 * @description :排序
 * @version: 2.0
 */
public class sort {
    public static void main(String[] args) {
        int[] arr=new int[]{6,9,4,3,2,7,5,10,8,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void quickSort(int arr[],int low,int high){
        int l=low;
        int h=high;
        int povit=arr[low];
        while(l<h) {
            while(l<h&&arr[h]>=povit)
            h--;
            if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                l++;
            }
            while(l<h&&arr[l]<=povit)
                l++;
            if(l<h){
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
            }
        }
        if(l>low)
            quickSort(arr,low,l-1);
        if(h<high)
            quickSort(arr,l+1,high);
    }
    //冒泡排序
    private static void maopaoSort(int[] array){
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------");
        for(int j=0;j<array.length-1;j++){
            for(int i=0;i<array.length-j-1;i++){
                if(array[i]>=array[i+1]){
                    int temp=array[i+1];
                    array[i+1]=array[i];
                    array[i]=temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
