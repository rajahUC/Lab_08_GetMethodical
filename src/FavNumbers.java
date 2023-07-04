import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0.0;

        favInt = SafeInput.getInt(in, "Enter your favorite integer value number");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double value number");

        System.out.println("You said your favorite integer was " + favInt + " and your favorite double was " + favDouble);
    }
}
