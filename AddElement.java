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
        
    // Print the new array using a for loop
    System.out.println("New array with added element:");
    for (int i = 0; i < newarr.length; i++) {
        System.out.print(newarr[i] + " ");
}
    }
}
/*public class AddElementToArray {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3};
        
        // Element to be added
        int newElement = 4;
        
        // Create a new array with one extra space
        int[] newArray = new int[originalArray.length + 1];
        
        // Copy elements from the original array to the new array using a for loop
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        
        // Add the new element to the end of the new array
        newArray[newArray.length - 1] = newElement;
        
        // Print the new array using a for loop
        System.out.println("New array with added element:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}*/
