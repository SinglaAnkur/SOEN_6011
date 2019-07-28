import java.util.Scanner;

public class SinhCalculator extends Validator
{
    public static void main(String args[])
    {
        System.out.println("This is a Sinh(x) calculator");
        System.out.println("Please enter the value of x:");
        System.out.println("Note: The value of x must lie between -700 to 700");
        Scanner sc = new Scanner(System.in);
        double x;
        String s = sc.nextLine();
        Validator v = new Validator();
        Boolean b = v.myValidator(s);
        if(b)
        {
            try
            {
                x = Double.parseDouble(s);
                System.out.print(Comparison.my_comparison(x));
            }
            catch (NumberFormatException e)
            {
                System.out.print("Input is not a valid  number");
            }
        }
        else
        {
            System.out.print("Please run the program again and enter a valid input");
        }
    }
}

