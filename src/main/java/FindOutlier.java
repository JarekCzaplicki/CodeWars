public class FindOutlier {
  static int find(int[] integers) {
    int oddNumber = 0, evenNumber = 0, countEven = 0;
    for (int integer : integers) {
      if((integer%2)==0) {
        evenNumber = integer;
        countEven++;
      }  else {
        oddNumber = integer;
      }
    }
    return 1<countEven ? oddNumber:evenNumber;
  }
  }
