public class EnglishBeggars {
//  int[] test = {1, 2, 3, 4, 5};
//  int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
  public static int[] beggars(int[] values, int n) {
    int count = 0;
    int [] wynik = new int[n];
    while (count < n){
      for (int i = 0; i < values.length - 1;) {
        wynik[count] += values[i+count];
        i= i+n;
      }count++;
    }
    return wynik;
  }
}
