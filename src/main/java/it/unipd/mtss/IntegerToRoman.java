////////////////////////////////////////////////////////////////////
// FRANCESCO FURIN 2138008
// ALESSANDRO RASIA DAL POLO 2145590
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

    private static final LinkedHashMap<Integer, String> ROMAN_NUMBERS = new LinkedHashMap<>();
    static {
        ROMAN_NUMBERS.put(10, "X");
        ROMAN_NUMBERS.put(9, "IX");
        ROMAN_NUMBERS.put(5, "V");
        ROMAN_NUMBERS.put(4, "IV");
        ROMAN_NUMBERS.put(1, "I");
    }

    private static final int NUMERO_MASSIMO_RAPPRESENTABILE = 20;

    public static String convert(int number){
        if(number < 1 || number > NUMERO_MASSIMO_RAPPRESENTABILE){
            return null;
        }

        StringBuilder string = new StringBuilder();
        for(Map.Entry<Integer, String> v : ROMAN_NUMBERS.entrySet()){
            int valore = v.getKey();
            String simbolo = v.getValue();

            while(number >= valore){
                string.append(simbolo);
                number -= valore;
            }
        }
        return  string.toString();
    }
}
