import java.util.Scanner;

public class SinhCalculator
{
    public static void main(String args[])
    {
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
                System.out.print("Input is not a valid number");
            }
        }
        else
        {
            System.out.print("Please run the program again and enter a valid input");
        }
    }
}

