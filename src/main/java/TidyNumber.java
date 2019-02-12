public class TidyNumber {
  public static boolean tidyNumber(int number)
  {
    char[] numbers = ("" + number).toCharArray();
    int count = 0;
    for (int i = 0; i < numbers.length-1 ; i++) {
      if (numbers[i]<=numbers[i+1])
        count++;
    }
    return count==numbers.length-1?true:false; // Do your magic!
  }
}
