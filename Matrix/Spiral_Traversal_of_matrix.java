package Matrix;
import java.util.Scanner;

public class Spiral_Traversal_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows followed by columns seprated by a space : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("The number of rows are : " + row + " and the number of columns are : " + col);

        int[][] arr = new int[row][col];

        System.out.println("Enter the values by rows with spaces between them : ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is : ");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


//        Code to write the spiral matrix traversal.
        StringBuilder sb = new StringBuilder();
        int rowStart = 0 , rowEnd = arr.length-1;
        int colStart = 0 , colEnd = arr[0].length-1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart;i<=colEnd;i++) {
                sb.append(arr[rowStart][i]);
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++) {
                sb.append(arr[i][colEnd]);
            }
            colEnd--;
            if(rowStart <= rowEnd) {
                for(int j=colEnd;j>=colStart;j--) {
                    sb.append(arr[rowEnd][j]);
                }
            }
            rowEnd--;
            if(colStart <= colEnd) {
                for(int j=rowEnd;j>=rowStart;j--) {
                    sb.append(arr[j][colStart]);
                }
            }
            colStart++;
        }

        System.out.println("The spiral matrix of the above inputted matrix will be : " +sb.toString());
    }
}