import org.junit.Test;
import static org.junit.Assert.*;
public class TestValidator
{
    @Test
    public void testNullFun()
    {
        String s = "123";
        Validator vad = new Validator();
        assertEquals(true, vad.isNotNullFun(s));
    }
    @Test
    public void testAlphaFunCase_A()
    {
        String s = "123";
        Validator vad = new Validator();
        assertEquals(true, vad.isNotAlphaFun(s));
    }
    @Test
    public void testAlphaFunCase_B()
    {
        String s = "12a";
        Validator vad = new Validator();
        assertEquals(false, vad.isNotAlphaFun(s));
    }
    @Test
    public void testSpaceFunCase_A()
    {
        String s = "123";
        Validator vad = new Validator();
        assertEquals(true, vad.doesNotContainSpaceFun(s));
    }
    @Test
    public void testSpaceFunCase_B()
    {
        String s = "12 3";
        Validator vad = new Validator();
        assertEquals(false, vad.doesNotContainSpaceFun(s));
    }
    @Test
    public void testSpecialCharFunCase_A()
    {
        String s = "123";
        Validator vad = new Validator();
        assertEquals(true, vad.doesNotContainSpecialCharFun(s));
    }
    @Test
    public void testSpecialCharFunCase_B()
    {
        String s = "1#523";
        Validator vad = new Validator();
        assertEquals(false, vad.doesNotContainSpecialCharFun(s));
    }
    @Test
    public void testMyValidatorFunCase_A()
    {
        String s = "123";
        Validator vad = new Validator();
        assertEquals(true, vad.myValidator(s));
    }
    @Test
    public void testMyValidatorFunCase_B()
    {
        String s = "123a";
        Validator vad = new Validator();
        assertEquals(false, vad.myValidator(s));
    }
}
