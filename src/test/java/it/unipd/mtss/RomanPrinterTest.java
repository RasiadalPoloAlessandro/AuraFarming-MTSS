////////////////////////////////////////////////////////////////////
// FRANCESCO FURIN 2138008
// ALESSANDRO RASIA DAL POLO 2145590
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class RomanPrinterTest {
    //Assuming IntegerToRoman works as intended, we only need to test for atomic symbols as we
    //have to print single characters in a string
    @Test
    public void testPrintZero(){
        // Arrange
        int input = 0;
        String expected = null;
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected,result);
    }
    @Test
    public void testPrintLetterI(){
        // Arrange
        int input = 1;
        String expected = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|";
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintLetterV(){
        // Arrange
        int input = 5;
        String expected = "__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    ";
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintVI(){ //we test for limit case
        // Arrange
        int input = 6;
        String expected ="__      __  _____  \n\\ \\    / / |_   _| \n \\ \\  / /    | |   \n  \\ \\/ /     | |   \n   \\  /     _| |_  \n    \\/     |_____| ";
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintLetterX(){ //symbol is also limit case
        // Arrange
        int input = 10;
        String expected = "__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\";
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintXX(){ //As we have no new symbols, we test for limit case;
        // Arrange
        int input = 20;
        String expected = "__   __ __   __ \n\\ \\ / / \\ \\ / / \n \\ V /   \\ V /  \n  > <     > <   \n / . \\   / . \\  \n/_/ \\_\\ /_/ \\_\\ ";
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintL(){ //symbol is also limit case
        // Arrange
        int input = 50;
        String expected = " _       \n| |      \n| |      \n| |      \n| |____  \n|______| ";
        // Act
        String result = RomanPrinter.print(input);
        // Assert
        assertEquals(expected, result);
    }
}
