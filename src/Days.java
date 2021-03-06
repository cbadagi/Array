import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Days
{

    public static void main(String[] args)
    {
        /**Day of the Week
         1. Make array that holds texual value of days like “Monday, Tuesday etc
         2. Let use input corresponding day
         3. Program should output String that represent day and you can assume week start Monday
         Example: User input 1: Output: Monday**/

        HashMap<Integer, String> hm
                = new HashMap<Integer, String>();

        hm.put(1, "Monday");
        hm.put(2, "Tuesday");
        hm.put(3, "Wednesday");
        hm.put(4, "Thrusday");
        hm.put(5, "Firday");
        hm.put(6, "Saturday");
        hm.put(7, "Sunday");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the corresponding day");
        int no = sc.nextInt();
        for (Map.Entry<Integer, String> e : hm.entrySet())
        {
            if (e.getKey() == no)
            {
                System.out.println(e.getKey() + " :" + e.getValue());
                break;
            }
        }
        sc.close();
    }
}
