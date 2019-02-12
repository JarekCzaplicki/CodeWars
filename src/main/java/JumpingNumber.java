public class JumpingNumber {
  public static String jumpingNumber(int number)
  {

    String liczby =""+number;
    int count = 0;
    char[] chars = liczby.toCharArray();
    for (int i = 0; i < chars.length-1; i++) {
      if (chars[i] - chars[i+1]==1||chars[i] - chars[i+1]==-1)
      {
        count++;
      }
    }
    return count==chars.length-1? "Jumping!!":"Not!!";
  }
}
