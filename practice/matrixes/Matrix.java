package practice.matrixes;
/*

Write a program for addition of two matrices
Write a program for subtraction of two matrices

Write a program to find out sum of diagonal element of a matrix




*/

public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {2, 5, 7}, {4, 5, 0}};
        int[][] b = {{1, 1, 1}, {2, 2, 0}, {4, 0, 7}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        addsub(a, b);
        transpose(a);

    }

    private static void addsub(int[][] a, int[][] b) {
        int[][] c = new int[3][3];
        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                s[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Addition of two matrices is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
        System.out.println("----------------------");
        System.out.println("Subtraction of two matrices is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + s[i][j]);
            }
            System.out.println();
        }

        int sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j  || ((i+j)==(3-1)) ) sum+= a[i][j];
            }
        }
        sum=0;
        for(int i=0;i<3;i++){
            sum+=a[i][i];
            sum+=a[i][3-(i+1)];
        }

        System.out.println("----------------------");
        System.out.println("Summation of DIAGONAL of two matrices is: "+sum);

    }

    private static void transpose(int[][] a){
        int[][] ans= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ans[i][j]=a[j][i];
            }
        }
        System.out.println("----------------------");
        System.out.println("Transpose of Matrix is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+ans[i][j]);;
            }
            System.out.println();
        }
    }
}
