public class SpecialNumber {
  public static String specialNumber(int number)
  {
    String numbersString = ""+number;
    char[] chars = numbersString.toCharArray();
    int count = 0;
    for (char aChar : chars) {
      if (Integer.parseInt(String.valueOf(aChar)) <= 5)count ++;
    }
    return chars.length == count?"Special!!":"NOT!!";
  }
}
