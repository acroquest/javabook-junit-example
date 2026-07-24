package acroquest.java.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzExampleTest {
    @ParameterizedTest
    @ValueSource(ints = {3, 6, 333, 2_147_483_646})
    void _3で割り切れる場合はFizzが返る(int value) {
        String actual = FizzBuzzExample.fizzBuzz(value);
        String expected = "Fizz";
        assertEquals(expected, actual);
    }
}
