import java.util.*;
import java.math.BigDecimal;
public class Multi {

    public static void multiply(){
        System.out.print("MULTI v1.65\n\nPlease choose the range of values you want to multiply the number by.\nThe values have to be positive and whole numbers.\n\n");
        mainfunction();
    }
    public static void mainfunction(){
        CakeCLM CLM=new CakeCLM();
        boolean always = true;
        boolean valuenotinputted = false;
        double nbr = 1;
        double mul = 1;
        int min = 2;
        int max = 5;
        int n = 1;
        double finalval = 0;
        Scanner minscanner = new Scanner(System.in);
        Scanner maxscanner = new Scanner(System.in);
        try {
            System.out.print("Min. value: ");
            min = minscanner.nextInt();
            System.out.print("\nMax. value: ");
            max = maxscanner.nextInt();
        } catch (Exception e) {
            System.out.println("The inputted value is not a positive whole number or is out of integer limit. Please input a number larger than 0 with no decimal places.");
            tryagain();
        }


        System.out.print("MULTI v1.65\n\nPlease choose the range of values you want to multiply the number by.\nThe values have to be positive and whole numbers.\n\n");
        System.out.print("Multiplying until infinity by " + min + " to " + max + "\n");
        while (always = true){
            nbr = nbr*mul;
            mul = Math.floor(Math.random()*(max-min+1)+min);
            if (Double.isInfinite(nbr)) {
                n = n-1;
                System.out.println("Value out of Double limits! Returning to CLM.\nCreated " + n + " multiplications with a final value of " + finalval + "\n");
                CLM.CLM();
                break;
            } else {
                System.out.print(n + ". " + new BigDecimal(nbr).toPlainString() + " (Will be multiplied by " + mul + ")\n");
                n ++;
                finalval = nbr;
            }

        }

    }
    public static void tryagain(){
        mainfunction();
    }
}
