//package ArrayAssignment.java;

public class Missingelement {
    public static void main(String[] args) {
        int arr[]={11, 12, 13, 15, 16,17};
        int arr1=arr.length+1;
        int totalsum=arr1*(arr1+1)/2;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println("Missing Element is: "+(totalsum-sum));
      }      
    }
    
