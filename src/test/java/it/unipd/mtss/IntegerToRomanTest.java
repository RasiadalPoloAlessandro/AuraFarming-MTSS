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

    @Test
    public void testConvertSix() {
        // Arrange
        int input = 6;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("VI", result);
    }

    @Test
    public void testConvertTen() {
        // Arrange
        int input = 10;

        // Act
        String result = IntegerToRoman.convert(input);

        // Assert
        assertEquals("X", result);
    }

    @Test
    public void testConvertTwenty(){
        //Arrange
        int input = 20;

        //act
        String result = IntegerToRoman.convert(input);

        //assert
        assertEquals("XX", result);
    }

    @Test
    public void testConvertFifty(){

        //Arrange
        int input = 50;

        //act
        String result = IntegerToRoman.convert(input);

        //assert
        assertEquals("L", result);
    }

}
