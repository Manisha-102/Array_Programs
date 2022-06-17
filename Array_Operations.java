package myPack;

import java.util.Scanner;
public class Array_Operations {
    int size,i,j,max,min,temp;
    public int[] acceptIn(){
        Scanner sc=new Scanner(System.in);

        //taking input from user
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        int[] num=new int[size];//create array
        System.out.println("size of array are:-"+size);

        //enter the element of arry
        System.out.println("\nEnter the element of array");
        for (i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        //print the element of array
        System.out.println("\nElement of array are:-");
        for (i=0;i<size;i++){
            System.out.println(num[i]+"\t");
        }
        return num;

    }
    public void Max_no(){
        int arr[]=acceptIn();
        max=arr[0];//assign the value of max arr[0]

        //find the max element in an array
        for (i=1;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum no is:-"+max);
    }
    public void Min_no(){
        int arr[]=acceptIn();
        min=arr[0];//assign the value of max element arr[0]

        //find the min elements  in an array
        for (i=1;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum element is:-"+min);
    }
    public void ascending_ord(){
        int arr[]=acceptIn();

        //sort the array in ascending order
        for (i=0;i<size;i++){
            for (j=1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n no of ascending order are");
        //print the element in ascending order
        for (i=0;i<size;i++){
            System.out.println(arr[i]+"\t");
        }
    }
    public void descending_ord(){
      int arr[]=acceptIn();

      //sort the array in descending order
      for (i=0;i<size;i++){
          for (j=1;j<size;j++){
              if(arr[i]<arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
      System.out.println("\n no od descending order are");

      //print the element in descending order
      for (i=0;i<size;i++){
          System.out.println(arr[i]+"\t");
      }
    }
}
