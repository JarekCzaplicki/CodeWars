public class FindOutlier {
  static int find(int[] integers) {
    int oddNumber = 0;
    int evenNumber = 0;
    int countOdd = 0;
    int countEven = 0;
    for (int integer : integers) {
      if((integer%2)==0) {
        evenNumber = integer;
        countEven++;
      }  else {
        oddNumber = integer;
        countOdd++;
      }
    }
    return countOdd<countEven ? oddNumber:evenNumber;
  }
  }
