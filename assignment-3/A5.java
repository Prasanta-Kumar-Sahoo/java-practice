
/*Write a program to find summation, subtraction and multiplication of two 3X4 matrices?
 */
import java.util.Scanner;

public class A5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a [][]= new int [3][4];
        int b [][]= new int [3][4];
        int sum [][]= new int [3][4];
        int sub [][]= new int [3][4];
        int mul [][]= new int [3][4];
        System.out.println("Enter element to first matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element to second matrix : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
                sub[i][j]=a[i][j]-b[i][j];
                for(int k=0;k<4;k++)
                {
                    mul[i][j]+=a[i][k]*b[k][j]; 
                }
            }
        }
        System.out.println("Summation of two Martix is ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(" "+sum[i][j]);
            }
            System.out.println();
        }
        System.out.println("Subtraction of two Martix is ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(" "+sub[i][j]);
            }
            System.out.println();
        }
        System.out.println("Multiplication of two Martix is ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(" "+sub[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}