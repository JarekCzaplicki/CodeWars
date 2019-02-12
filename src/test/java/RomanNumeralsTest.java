import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
//   private RomanNumerals RomanNumerals = new RomanNumerals();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("M", RomanNumerals.toRoman(1000));
        assertEquals("CMXCIX", RomanNumerals.toRoman(999));
        assertEquals("IV", RomanNumerals.toRoman(4));
        assertEquals("I", RomanNumerals.toRoman(1));
        assertEquals("MCMXCI", RomanNumerals.toRoman(1991));
        assertEquals("MMVI", RomanNumerals.toRoman(2006));
        assertEquals("MMXX", RomanNumerals.toRoman(2020));
    }

    @Test
    public void shouldConvertFromRoman() {
        assertEquals("21", RomanNumerals.fromRoman("XXI"));
        assertEquals("1", RomanNumerals.fromRoman("I"));
        assertEquals("3", RomanNumerals.fromRoman("III"));
        assertEquals("4", RomanNumerals.fromRoman("IV"));
        assertEquals("2007", RomanNumerals.fromRoman("MMVII"));
        assertEquals("1669", RomanNumerals.fromRoman("MDCLXIX"));
    }

}

