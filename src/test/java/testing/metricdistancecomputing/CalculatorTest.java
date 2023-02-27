package testing.metricdistancecomputing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void beforeAll(){
        calculator = new Calculator();
        System.out.println("Message before all tests");
    }

    @BeforeEach
    void before() {
        System.out.println("Message before each tests");
    }

    @AfterEach
    void after() {
        System.out.println("Finished message after each test");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Finished message after all tests");
    }

    @Test
    void addTesting() {
        int sumResult = Calculator.calculateTest(10, 15,'+');
        assertEquals(25, sumResult);
    }

    @Test
    void subtractTesting() {
        int sumResult = Calculator.calculateTest(10, 15,'-');
        assertEquals(-5, sumResult);
        assertNotEquals(0, sumResult);
    }

    @ParameterizedTest
    @CsvSource({"5,15,+,20", "0,5,+,5", "10,10,+,20"})
    void testAddingParametrized(String first, String second, String op, String result) {
        int add = Calculator.calculateTest(Integer.parseInt(first), Integer.parseInt(second), op.charAt(0));
        assertEquals(Integer.parseInt(result), add);
    }

    //Throws ParameterResolutionException
    /*@ParameterizedTest
    @CsvFileSource(resources = "/csv_file_data.csv",numLinesToSkip = 0)
    void testSubtractParametrized(String first, String second, String op, String result) {
        int sub = Calculator.calculateTest(Integer.parseInt(first), Integer.parseInt(second), op.charAt(0));
        assertEquals(Integer.parseInt(result), sub);
    }*/
}