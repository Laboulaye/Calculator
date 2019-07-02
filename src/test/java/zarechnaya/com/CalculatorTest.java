package zarechnaya.com;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before CalculatorTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Agter CalculatorTest.class");
    }

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception{
        assertEquals(10, calculator.getSum(7, 3));
    }

    @Test
    public void testGetMinus() throws Exception{
        assertEquals(18, calculator.getMinus(22, 4));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(3, calculator.getDivide(15, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(2, 0);
    }

    @Test
    public void testGetMultiply() throws Exception{
    }

    @Ignore("Message fot ignored test")
    @Test
    public void getIgnoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        while(true);
    }
}