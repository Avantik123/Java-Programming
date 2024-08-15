// Find K-Largest and K-Smallest element in an array
import java.util.Scanner;
public class Array_Practice {
    public static void main(String[] args) {
        
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
          max=arr[i];
        }
    }
        System.out.println("Smallest element of array"+min);
        System.out.println("Largest element of array is:"+max);

        }
    }
    
    
    
           