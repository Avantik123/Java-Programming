public class Arraytest {
    public static void main(String[] args) {

        // 1. Sort the elements of the array 
    /*
        int[] arr=new int[] {3,7,2,9,5,18,4,6};

        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            int temp=0;
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
     System.out.println(arr[i]);
    }
    */


    //2. Third largest element in the array

    int[] arr=new int[] {3,7,2,9,5,18,4,6};

    for(int i=0;i<arr.length-1;i++){
       // for(int j=i+1;j<arr.length-1;j++){
        for(int j=0;j<arr.length-1;j++){
if(arr[i]>arr[j]){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
        }

    }
System.out.println(arr[2]);
}
}
