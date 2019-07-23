public class Comparison
{
    public static double my_comparison(double x)
    {
        double value_positive_ex = 0;
        double value_negative_ex = 0;
        double output = 0;
        double abs_x = x;
        if(x == 0)
        {
            return 0;
        }
        else if (x > 700 || x < -700)
        {
            System.out.print("The value of x exceeds the limit: ");
            return x;
        }
        else if (x < 0)
        {
            abs_x = x * (-1);
        }
        if ((abs_x > 0 && abs_x <= 15))
        {
            for(int n = 2; n <= 1000; n++)
            {
                value_positive_ex = Validator.exponential(n, abs_x);
                value_negative_ex = Validator.exponential(n, -abs_x);
            }
            output = (value_positive_ex-value_negative_ex)/2;

        }
        else if (abs_x > 15 && abs_x <= 700)
        {
            for(int n = 2; n <= 1000; n++)
            {
                value_positive_ex = Validator.exponential(n, abs_x);
            }
            System.out.println("e^x= "+ value_positive_ex);
            System.out.println(value_positive_ex/2);
            output = value_positive_ex/2;
        }
        if (x < 0)
        {
            return output*(-1);
        }
        return output;
    }
}
