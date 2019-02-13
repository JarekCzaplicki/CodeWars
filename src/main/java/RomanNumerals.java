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
        String ix = "IX";
        String iv = "IV";
        Map<String, Integer> mapOfRomans = new LinkedHashMap<String, Integer>();
        mapOfRomans.put("M", 1000);
        mapOfRomans.put("CM", 900);
        mapOfRomans.put("D",  500);
        mapOfRomans.put("CD", 400);
        mapOfRomans.put("C",  100);
        mapOfRomans.put("XC", 90);
        mapOfRomans.put("L",  50);
        mapOfRomans.put("XL", 40);
        mapOfRomans.put("X",  10);
        mapOfRomans.put("IX", 9);
        mapOfRomans.put("V",  5);
        mapOfRomans.put("IV", 4);
        mapOfRomans.put("I",  1);
//"MDCLXIX" - 1669
        StringBuilder rom = new StringBuilder(roman);
//        System.out.println(rom.);
        for (String s : mapOfRomans.keySet()) {
            while (rom.toString().contains(s)&& rom.length()>2){
                    number += mapOfRomans.get(s);
//                System.out.println("W ciagu: " + rom + " znajduje się: " + s);
                    String substring = rom.substring(s.length(), rom.length());
                    rom.replace(0, roman.length(), substring);
//                System.out.println("Substring: " + substring + "ma długość: " + substring.length());
//                System.out.println("Zmienna rom: "+ rom.toString()+ "ma długość: " + rom.length());
                }

            while (rom.toString().contains(s)&& rom.length()<=2){
                if (mapOfRomans.get(s)<10 && rom.length()==2){
                    if (rom.toString().equals(ix)){
                        number +=9;
                        String substring = "";
                        rom.replace(0, roman.length(), substring);

                    }else if (rom.toString().equals(iv)){
                        number +=4;
                        String substring = "";
                        rom.replace(0, roman.length(), substring);
                    }else {
                        number += mapOfRomans.get(s);
                        String substring = rom.substring(s.length(), rom.length());
                        rom.replace(0, roman.length(), substring);
                    }
                }
            }
        }


        return number;
    }

    public static void main(String[] args) {
//        assertEquals("21", RomanNumerals.fromRoman("XXI"));
//        assertEquals("1", RomanNumerals.fromRoman("I"));
//        assertEquals("3", RomanNumerals.fromRoman("III"));
//        assertEquals("4", RomanNumerals.fromRoman("IV"));
//        assertEquals("2007", RomanNumerals.fromRoman("MMVII"));
//        assertEquals("1669", RomanNumerals.fromRoman("MDCLXIX"));
        System.out.println(fromRoman("I"));

    }
}
