////////////////////////////////////////////////////////////////////
// FRANCESCO FURIN 2138008
// ALESSANDRO RASIA DAL POLO 2145590
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import java.util.HashMap;
import java.util.Map;
public class RomanPrinter {
    private static final Map<Character, String[]> RomanAlphabet = new HashMap<>();
    static {
        RomanAlphabet.put('I', new String[]{
                " _____ ", "|_   _|", "  | |  ",
                "  | |  ", " _| |_ ", "|_____|"
        });
        RomanAlphabet.put('V', new String[]{
                "__      __", "\\ \\    / /", " \\ \\  / / ",
                "  \\ \\/ /  ", "   \\  /   ", "    \\/    "
        });
        RomanAlphabet.put('X', new String[]{
                "__   __", "\\ \\ / /", " \\ V / ",
                "  > <  ", " / . \\ ", "/_/ \\_\\"
        });
        RomanAlphabet.put('L', new String[]{
                " _      ", "| |     ", "| |     ", "| |     ", "| |____ ", "|______|"
        });
        RomanAlphabet.put('C', new String[]{
                "  _____ ", " / ____|", "| |     ",
                "| |     ", "| |____ ", " \\_____|"
        });
    }
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber) {
        if(romanNumber == null){ return null;}
        StringBuilder result = new StringBuilder();
        int fontHeight = 6;
        for (int i = 0; i < fontHeight; i++) {
            StringBuilder asciiRow = new StringBuilder();
            for (char c : romanNumber.toCharArray()) {
                asciiRow.append(RomanAlphabet.get(c)[i]);
                asciiRow.append(" ");
            }
            result.append(asciiRow);
            if (i < fontHeight - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
