public class AddElement {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int newElement=4;

        int[] newarr=new int[arr.length+1];
        
        for (int i=0;i<arr.length;i++)
        {
            newarr[i]=arr[i];
            
        }
    
    newarr[newarr.length - 1] = newElement;
    System.out.println("New array with added element:");
    for (int i = 0; i < newarr.length; i++) {
        System.out.print(newarr[i] + " ");
}
    }
}
