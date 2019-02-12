import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
    public static String toRoman(int number){
        Map<Integer, String> mapOfNumbers = new LinkedHashMap<Integer, String>();
        mapOfNumbers.put(1000, "M");
        mapOfNumbers.put(900, "CM");
        mapOfNumbers.put(500, "D");
        mapOfNumbers.put(400, "CD");
        mapOfNumbers.put(100, "C");
        mapOfNumbers.put(90,  "XC");
        mapOfNumbers.put(50,  "L");
        mapOfNumbers.put(40,  "XL");
        mapOfNumbers.put(10,  "X");
        mapOfNumbers.put(9,   "IX");
        mapOfNumbers.put(5,   "V");
        mapOfNumbers.put(4,   "IV");
        mapOfNumbers.put(1,   "I");

        StringBuilder resString = new StringBuilder();

        for (Integer key : mapOfNumbers.keySet()) {
            while (key <= number){
                resString.append(mapOfNumbers.get(key));
                number = number - key;
            }
        }

        return resString.toString();
    }

    public static int fromRoman(String roman){
        int number = 0;
        return number;
    }
}
