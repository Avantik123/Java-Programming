class Avg {
public static void main(String[] args) {
   double sum=0;
    int arr[]={10,20,30,40,50};
    int n=arr.length;
    for (int i=0; i<arr.length; i++){
        sum=sum+arr[i];
    }
    System.out.println("Average="+(sum/n));

}
}
