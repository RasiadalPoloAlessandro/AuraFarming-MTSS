package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void testConvertFirstNumber() {
        // Arrange
        int input = 1;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvertThree() {
        // Arrange
        int input = 3;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("III", result);
    }
}
