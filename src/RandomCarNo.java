import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomCarNo {

    /**
     * Write a program to print random & unique car digit number
     * ● Take input from user for number of unique car number to generate
     * ● Take format of card number to be MH{Random4digits}: MH3459
     * ● Make sure number generated are not duplicate
     **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of unique car to be generated");
        int No = sc.nextInt();
        int Arr[] = new int[No];
        Random rno = new Random();
        for (int i =0; i <No; i++)
        {
            Arr[i] = rno.nextInt((9999 - 1000) + 1000);
            int Temp = Arr[i];
            for (int j = 0; j < i; j++)
            {
                if (Arr[j] == Temp)
                {
                    System.out.println(" The Number generated is Duplicate");
                }
            }
            System.out.println("The Unique car number generated  is MH" + Temp);
        }
        }

        }

