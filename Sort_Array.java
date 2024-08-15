import java.util.Scanner;
public class Sort_Array {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the Size of the Array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(i=0; i<n-1; i++){
        for(j=i+1; j<n;j++){
            if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
        }
        System.out.println("Sorted Array:");
        for(i=0; i<n; i++){
        System.out.println(arr[i]);
}
}
}

