import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price = 0.0;
        double totalPrice = 0.0;
        boolean continueYN = false;

        do
        {
            price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalPrice += price;

            continueYN = SafeInput.getYNConfirm(in, "If you would like to quit, select Y. Otherwise, if you have more items, select N");
        }while (!continueYN);

        System.out.printf("Your total is: %5.2f", totalPrice);
    }
}
