class Arraysort {
public static void main(String[] args) {
    int temp, i,j;
    int arr[]={5,2,7,9,1};
    for(i=0;i<arr.length;i++){
        for(j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){

                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
    }
}
    for(i=0;i<arr.length;i++){
    System.out.println(arr[i]);
    }
}    
}

