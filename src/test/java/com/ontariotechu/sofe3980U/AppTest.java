package com.ontariotechu.sofe3980U;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @DisplayName("Count Character Test Cases")
    @ParameterizedTest(name = "{index} => {0}, {1} = {2}")
    @CsvSource({
        "cc, c, 2", 
        "c, c, 1", 
        "a, c, 0", 
    })
    public void charCountTest(String input, char character, int expected) {
        int result = App.charCount(input, character);
        assertEquals(expected, result);
    }
}
