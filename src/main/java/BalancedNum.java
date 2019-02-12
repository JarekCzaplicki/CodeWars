public class BalancedNum {
  public static String balancedNum(long number)
  {
    int count = 0;
    long leftSum =0, rightSum =0;
    long tmpNumber = number;
    System.out.println("Liczba: " + number);
    while (tmpNumber>0)
    {
      tmpNumber = tmpNumber / 10;
      count++;
    }
    long [] tablicaLiczb = new long[count];
    for (int i = 0; i < count ; i++) {
      tablicaLiczb[i] = (number % 10);
      number = number / 10;
    }
    if (count%2 == 0){
      System.out.println("Parzysta");
      for (int i = 0; i < (count/2)-1 ; i++) {
        leftSum = leftSum + tablicaLiczb[i];
      }
      for (int i = count-1; i >= (count/2)+1 ; i--) {
        rightSum = rightSum + tablicaLiczb[i];
      }
      if (leftSum==rightSum) return "Balanced";
      else return "Not Balanced";
    }
    else {
      for (int i = 0; i < (count/2) ; i++) {
        leftSum = tablicaLiczb[i];
      }
      for (int i = count-1; i >= (count/2)+1 ; i--) {
        rightSum = tablicaLiczb[i];
      }
      if (leftSum==rightSum) return "Balanced";
      else return "Not Balanced";
    }
  }
}
