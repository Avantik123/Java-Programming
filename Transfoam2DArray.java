public class Transform2DArray 
{
    public static int[][] transpose(int arr[][])
    {
        int arr2[][] = new int[arr.length][arr.length];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr2[j][i] = arr[i][j];
                //System.out.println(j+","+i + "=" + arr2[j][i] + "-" + arr[i][j]);
            }
        }
        return arr2;
    }
    public static int[][] printMatrix(int [][] arr)
    {
        for(int[] row : arr)
        {
            for(int i : row)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int transposed[][] = transpose(arr);

        System.out.println("Original matrix:");
        printMatrix(arr);

        System.out.println("Transposed matrix:");
        printMatrix(transposed);
    }
}
