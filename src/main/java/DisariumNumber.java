public class DisariumNumber {
  public static String disariumNumber(int number)
  {
    String size = ""+number;
    int count = 0;
    int sum = 0;
    char[] numbers = size.toCharArray();
    for (char c : numbers) {
      count++;
      sum += Math.pow(Integer.parseInt(String.valueOf(c)),count);
    }
    return sum==number?"Disarium !!":"Not !!";
  }
}
