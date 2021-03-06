import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Grades
{

    public static void main(String[]args)
    {
        /**
         * Write a program that allows user to enter number of grades(out off 100) and provide them with theier average, highest & lowest score
         * Example: Number of grades : 4 User enters: 50, 78, 69,55 Average : 63
         * Highest: 78
         * Lowest : 50**/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of grades to calculate");
        int grades=sc.nextInt();
        ArrayList<Integer> arrli = new ArrayList<Integer>(grades);
        System.out.println("Enter the marks one after another");
        for (int i=0;i<grades;i++)
        {
            int marks=sc.nextInt();
            arrli.add(marks);
        }

        //calaculatio
        double sum=0;
        for (double d:arrli)
        {
            sum+=d;
        }
        System.out.println("Avegare marks :"+(sum/grades));
        System.out.println("Highest marks is :"+Collections.max(arrli));
        System.out.println("Lowest Marks is :"+Collections.min(arrli));

    }
}
