import java.util.Scanner;

public class Reggie
{
    static String menu = "O - Open\tS - Save\tV - View\tQ - Quit";
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String SSN = "";
        String UCStudentM = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        UCStudentM = SafeInput.getRegExString(in, "Enter your UC Student M", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, menu, "^[OoSsVvQq]$");

        System.out.println("\nYou said your SSN was: " + SSN);
        System.out.println("You said your UC Student M was: " + UCStudentM);
        System.out.println("You said your menu Choice was: " + menuChoice);

    }

}
