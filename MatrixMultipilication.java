import java.util.Scanner;
public class MatrixMultipilication {
    
    //reading matrix
    public void readMatrix(int [][]a,int row,int col){
        Scanner sc= new Scanner(System.in);
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print("["+i+"]["+j+"] : ");
                a[i][j]=sc.nextInt();
            }
        }
    }

    //printing matrix
    public void printMatrix(int [][]a,int row,int col){
        int i,j;
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }


    //Matrix multiplication calculation
    public void multiplication(int [][]a,int [][]b,int [][]c,int row1,int col2,int col1){
        int i,j,k;
        for(i=0;i<row1;i++){
            for(j=0;j<col2;j++){
                for(k=0;k<col1;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            int row1,row2,col1,col2; 
            System.out.println("enter the no of rows and cols of 1st matrix : ");
            row1=sc.nextInt();
            col1=sc.nextInt();
            System.out.println("enter the no of rows and cols of 2nd matrix : ");
            row2=sc.nextInt();
            col2=sc.nextInt();
            if(col1!=row2){
                System.out.println("Sorry!! Multiplication not possible");
            }
            else{
                System.out.println("enter the elements of 1st matrix : ");
                MatrixMultipilication Matrix=new MatrixMultipilication();
                int [][] a= new int[row1][col1];
                int [][] b= new int[row2][col2];
                int [][] c= new int[row1][col2];
                Matrix.readMatrix(a, row1, col1);
                System.out.println("the 1st matrix is :\n");
                Matrix.printMatrix(a, row1, col1);
                System.out.println("enter the elements of 2nd matrix : ");
                Matrix.readMatrix(b, row2, col2);
                System.out.println("the 2nd matrix is :\n");
                Matrix.printMatrix(b, row2, col2);
                System.out.println("Matrix after multiplication is : ");
                Matrix.multiplication(a,b,c, row1, col2, col1);
                Matrix.printMatrix(c, row1, col2);
            }
        }

    }
}
