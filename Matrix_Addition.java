import java.io.*;
import java.util.Scanner;
class Matrix_Addition
{
public static void main(String[] args)
{
Scanner mat=new Scanner(System.in);
int[][] A={{1,2,3,}, {4,5,6,},{7,8,9}};
int[][] B={{1,2,3,}, {4,5,6,},{7,8,9}};
int[][] C=new int[3][3];
//insertion Matrix A
System.out.println("Enter Matrix A");
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
A[i][j]=mat.nextInt();
//insertion Matrix B
System.out.println("Enter Matrix B");
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
B[i][j]=mat.nextInt();
//addition
for(int i=0;i<3;i++)
for(int j=0;j<3;j++)
C[i][j]=A[i][j]+B[i][j];
//display
for(int i=0;i<3;i++)
{
System.out.println();
for(int j=0;j<3;j++)
System.out.print(C[i][j] + " ");
}
}
}
