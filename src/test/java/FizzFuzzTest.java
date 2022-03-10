import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzFuzzTest {

    @Test
    public void shouldProcessSingleNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertEquals( "1", fizzBuzz.process(1));
        assertEquals("2" , fizzBuzz.process(2));
        assertEquals("Fizz", fizzBuzz.process(3));
        assertEquals("4", fizzBuzz.process( 4));
        assertEquals("Buzz", fizzBuzz.process(5));
        assertEquals("Fizz", fizzBuzz.process(6));
        assertEquals("Buzz", fizzBuzz.process(10));
        assertEquals("FizzBuzz", fizzBuzz.process(15));
        assertEquals("19", fizzBuzz.process(19));
        assertEquals("Buzz", fizzBuzz.process(20));
        assertEquals("FizzBuzz", fizzBuzz.process(30));
    }
}
