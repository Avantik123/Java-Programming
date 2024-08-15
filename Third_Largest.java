import java.util.Scanner;
public class Third_Largest {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the Size of the Array:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    
    System.out.println("Third Largest Element in an Array is:"+arr[n-3]);
}
}


