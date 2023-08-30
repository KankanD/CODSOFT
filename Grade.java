import java.util.*;
public class Grade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of subjects:");
        int n = sc.nextInt();

        //Marks in each subject
        int marks[] = new int[n];              

        System.out.print("Enter the marks obtained (out of 100): ");

        for(int i = 0; i < n; i++)
        {
            marks[i] = sc.nextInt();
        }

        int total = 0;

        for(int i = 0; i < n; i++)
        {
            total = total + marks[i];
        }

        //Average percentage calculated after getting the total
        float avg = (float)total / n;

        System.out.println(" ");
        System.out.println("----------Student Details----------");
        System.out.println(" ");
        System.out.println("Total marks: " + total);
        System.out.println("Average Percentage: " + avg);

        if (avg >= 90 && avg <= 100)
        System.out.println("Grade: O");
        
        else if(avg >=80 && avg < 90)
        System.out.println("Grade: E");

        else if(avg >= 70 && avg <80)
        System.out.println("Grade: A");

        else if(avg >= 60 && avg < 70)
        System.out.println("Grade: B");

        else if(avg >= 50 && avg < 60)
        System.out.println("Grade: C");

        else if(avg >= 40 && avg < 50)
        System.out.println("Grade: D");

        else
        System.out.println("Grade: F");

        sc.close();
    }
}