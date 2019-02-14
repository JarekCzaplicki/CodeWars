public class EnglishBeggarsv2 {
  //wersja z CodeWars
  public static int[] beggars(int[] values, int n) {
    int[] result;

    if (n < 1) {//return empty array
      result = new int[0];
    } else {
      result = new int[n];
      for (int i = 0; i < values.length; i++) {

        // add value to currently queued element
        //jesli chcemy wybierać co n-ty element to musimy uzyskac wynik modulo z bieżacej pozycji w tabeli względem ilości przesunieć.
        result[i % n] += values[i];
      }
    }

    return result;
  }
}
