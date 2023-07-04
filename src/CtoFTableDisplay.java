import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.printf("Celsius\t|\tFahrenheit\n");

        for(double cTemp = -100; cTemp <= 100; cTemp += 1)
        {
            System.out.printf("%6.2f\t|\t%6.2f\n",cTemp, CtoF(cTemp));
        }
    }

    public static double CtoF(double Celsius)
    {
        return Celsius * 9.0/5 + 32;
    }
}
