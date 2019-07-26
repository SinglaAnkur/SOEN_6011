class MyFuncs
{
    public static int strLen(String s)
    {
        int len = 0;
        int i = 0;
        s=s+'\0';
        while(s.charAt(i) != '\0') {
            len++;
            i++;
        }
        return len;
    }
    /*calculates sum of first n terms in taylor series expansion*/
    public static double exponential(int n, double x)
    {
        double sum = 1;
        for (int i = n - 1; i > 0; --i )
        {
            sum = 1 + x * sum / i;
        }
        //System.out.println("n="+n);
        //System.out.println("sum=" + sum);
        return sum;

    }
}