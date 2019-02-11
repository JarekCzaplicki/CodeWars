public class TotalPoints {
    public static int points(String[] games) {
        int totalPoints = 0;
        for (String game : games) {
            int x = Integer.parseInt(game.split(":")[0]);
            int y = Integer.parseInt(game.split(":")[1]);
            if (x > y) totalPoints += 3;
            if (x == y) totalPoints += 1;
        }


//    for (int i = 0; i < games.length; i++) {
//      String tmp = games[i];
//      String strarray[] = new String[2];
//      strarray = tmp.split(":");
//      int firstNumber = Integer.parseInt(strarray[0]);
//      int secondNumber = Integer.parseInt(strarray[1]);
//      System.out.println("Pierwsza liczba: " + strarray[0] + " ,Druga liczba: " + strarray[1]);
//      if (firstNumber > secondNumber) totalPoints += 3;
//      if (firstNumber < secondNumber) totalPoints += 0;
//      if (firstNumber == secondNumber) totalPoints += 1;
//      }

        return totalPoints;
    }
}