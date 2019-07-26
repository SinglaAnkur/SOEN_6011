import org.junit.Test;
import static org.junit.Assert.*;
public class TestComparison
{
    @Test
    public void testComparisonCase_A()
    {
        double d = 123;
        Comparison comp = new Comparison();
        assertEquals(1.3097586593E53, comp.my_comparison(d), 1.0E50);
    }
    @Test
    public void testComparisonCase_B()
    {
        double d = 0;
        Comparison comp = new Comparison();
        assertEquals(0, comp.my_comparison(d), 0);
    }
    @Test
    public void testComparisonCase_C()
    {
        double d = 1000;
        Comparison comp = new Comparison();
        assertEquals(1000, comp.my_comparison(d), 0);
    }
    @Test
    public void testComparisonCase_D()
    {
        double d = -1000;
        Comparison comp = new Comparison();
        assertEquals(-1000, comp.my_comparison(d), 0);
    }
    @Test
    public void testComparisonCase_E()
    {
        double d = -123;
        Comparison comp = new Comparison();
        assertEquals(-1.3097586593E53, comp.my_comparison(d), 1.0E50);
    }
    @Test
    public void testComparisonCase_F()
    {
        double d = 12;
        Comparison comp = new Comparison();
        assertEquals(81377.3957064, comp.my_comparison(d), 0.0000005);
    }
}
