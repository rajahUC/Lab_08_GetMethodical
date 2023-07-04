import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Here we test all our methods

        /*

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You said your name was: " + name);

        int age = SafeInput.getInt(in, "Enter your age");
        System.out.println("You said your age was: " + age);

        double weight = SafeInput.getDouble(in, "Enter your weight");
        System.out.println("You said your weight was: " + weight);

        int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.println("You said your favorite number was: " + favNum);

        double favTemp = SafeInput.getRangedDouble(in, "Enter your favorite temperature in Celsius", 0.0, 100.0);
        System.out.println("You said your favorite temperature was: " + favTemp);

        if (SafeInput.getYNConfirm(in, "Would you like to keep playing"))
        {
            System.out.println("You confirmed you would like to keep playing.");
        }
        else
        {
            System.out.println("You decided you would not like to keep playing");
        }

        String number = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You said your number was: " + number);

         */

        String msg = "Hello, World";
        SafeInput.prettyHeader(msg);
    }

}