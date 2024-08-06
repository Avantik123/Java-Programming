import java.util.Scanner;
public class MultiplicationMatrix {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("Enter the elements of array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }  

    }

    System.out.println("Enter the elements of 2 array");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            b[i][j]=sc.nextInt();
    }

    }
    System.out.println("Multiplication of matrices are:");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
            c[i][j]=a[i][k]+b[k][j];
            }
}

    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
    System.out.println(c[i][j]+" ");
}
    }
}
}
