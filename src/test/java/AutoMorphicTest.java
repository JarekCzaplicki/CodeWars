import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoMorphicTest {
    @Test
    public void One_Digit_Number()
    {
        assertEquals("Automorphic", AutoMorphic.autoMorphic(1));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(3));
        assertEquals("Automorphic", AutoMorphic.autoMorphic(6));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(9));
    }
    @Test
    public void Two_Digit_Number()
    {
        assertEquals("Automorphic", AutoMorphic.autoMorphic(25));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(13));
        assertEquals("Automorphic", AutoMorphic.autoMorphic(76));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(95));
    }
    @Test
    public void Larger_Number()
    {
        assertEquals("Automorphic", AutoMorphic.autoMorphic(625));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(225));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(425));
        assertEquals("Not!!",       AutoMorphic.autoMorphic(399));
    }

}