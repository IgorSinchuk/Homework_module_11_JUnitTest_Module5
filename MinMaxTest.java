import junit.framework.TestCase;
import static org.junit.Assert.*;

public class MinMaxTest extends TestCase {
    private final MinMax minMax = new MinMax();

    public void test() {
        String[]expectedOutput = {"1", "2", "2"};
        String[] methodOutput = {"1", "2" , "3"};
        assertArrayEquals(expectedOutput, methodOutput);

    }
}
