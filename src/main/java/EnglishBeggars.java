import java.util.Arrays;
//moja wersja rozwiazania po wielu godzinach .
public class EnglishBeggars {
  public static int[] beggars(int[] values, int n) {
    int count = 0;
    int [] wynik = new int[n];
//    String  valuesStr = new String(Arrays.toString(values).replaceAll(" ","").replace("[", "").replace("]",""));
    String [] valuesStrArray = new String[values.length];
    for (int i = 0; i < values.length; i++) {
      valuesStrArray[i] = String.valueOf(values[i]);
    }
    System.out.println(Arrays.toString(valuesStrArray));
    for (String s : valuesStrArray) {
      System.out.println(s);
    }

//{444, 849, 100, 3, 514, 8, 260, 29, 72, 2, 22, 696, 71, 3, 98, 781, 11, 3, 7, 9, 86, 10};
    while (count < n){
      for (int i = 0; i < valuesStrArray.length; i++) {
        while (i + count < valuesStrArray.length){
          wynik[count] += Integer.parseInt(valuesStrArray[i + count]);
          i = i + n;
        }
      }count++;
    }
    return wynik;
  }
}
