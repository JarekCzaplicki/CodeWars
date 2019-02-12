import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisariumNumberTest {
  @Test
  public void Disarium_Or_NOT()
  {
    assertEquals("Disarium !!", DisariumNumber.disariumNumber(89));
    assertEquals("Not !!", DisariumNumber.disariumNumber(564));
    assertEquals("Not !!", DisariumNumber.disariumNumber(1024));
  }
  @Test
  public void Larger_Numbers()
  {
    assertEquals("Not !!", DisariumNumber.disariumNumber(64599));
    assertEquals("Not !!", DisariumNumber.disariumNumber(136586));
    assertEquals("Not !!", DisariumNumber.disariumNumber(1048576));
  }

}