
import org.junit.Test;
import static org.junit.Assert.*;
public class TestMyFuncs
{
    @Test
    public void testStrLengthFun()
    {
        Validator vad = new Validator();
        assertEquals(2, vad.strLen("12"));
    }

    @Test
    public void testExponentialFun()
    {
        Validator vad = new Validator();
        assertEquals(148.41310786,vad.exponential(20,5),1.0);
    }
}
