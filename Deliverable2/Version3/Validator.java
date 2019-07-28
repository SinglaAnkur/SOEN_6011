
public class Validator extends MyFuncs
{
    public static Boolean isNotNullFun(String s)
    {
        int len = MyFuncs.strLen(s);
        if (s == null || MyFuncs.strLen(s) == 0)
        {
            System.out.println("The  input cannot be empty");
            return false;
        }
        else
        {
            return true;
        }
    }
    public static Boolean isNotAlphaFun(String s)
    {
        int len = MyFuncs.strLen(s);
        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                System.out.println("The input should be numeric only. It cannot contain any alphabet.");
                return false;
            }
        }
        return true;
    }
    public static Boolean doesNotContainSpaceFun(String s)
    {
        int len = MyFuncs.strLen(s);
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            if (c == ' ')
            {
                System.out.println("The input contains spaces");
                return false;
            }
        }
        return true;
    }
    public static Boolean doesNotContainSpecialCharFun(String s)
    {
        int len = MyFuncs.strLen(s);
        String specialCharacters="!#$%&'()*+,/:;<=>?@[]^_`\\{|}";
        for (int i = 0; i < MyFuncs.strLen(specialCharacters); i++)
        {
            for (int j  = 0; j < len; j++)
            {
                if (s.charAt(j) == specialCharacters.charAt(i))
                {
                    System.out.println("The input contains special character " + s.charAt(j));
                    return false;
                }
            }
        }
        return true;
    }
    public static Boolean myValidator(String s)
    {
        if (!(Validator.isNotAlphaFun(s)))
        {
            return false;
        }
        else if (!(Validator.doesNotContainSpaceFun(s)))
        {
            return false;
        }
        else if (!(Validator.isNotNullFun(s)))
        {
            return false;
        }
        else if (!(Validator.doesNotContainSpecialCharFun(s)))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
