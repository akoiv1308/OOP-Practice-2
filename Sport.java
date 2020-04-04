import java.util.*;

public class Sport {

  //Fields//
  private String name;
  private int numberOfgames = 0;

  //Constructor//
  public Sport(String name) {
    this.name = name;
  }
  //Instance Variables// 
  public String getName() {
    return name;
  }

  public void average() {
    Scanner gamesInput = new Scanner(System.in);
    System.out.println("\nNumber Of Games: ");
    int games = gamesInput.nextInt();
    System.out.println("\nEnter Game Results(Scores): ");
    ArrayList<Integer> scores = new ArrayList<Integer>();
    for(int i = 0; i < games; i++) {
      scores.add(gamesInput.nextInt());
    }
    double sum = 0;
    for (int i : scores) {
      sum += i;
    }
    double average = sum / scores.size();
    System.out.println(getName() + ", your average is " + average);
  }

  public int newGames(int number) {
    numberOfgames += number;
    return numberOfgames;
  }

  public void speed(String bowler, int[] speed) {
    if(bowler.equals("Joshua Hans")) {
      System.out.println("Speed: "+ speed[2]);
    }
    else if(bowler.equals("Jack Turuy")) {
      System.out.println("Speed: "+ speed[1]);
    }
    else {
      System.out.println("Speed: "+ speed[0]);
    }
  }

  public int highestScore(int num) {
    return num;
  }

  public void Accuracy(int accuracy) {
    System.out.println("Accuracy: " + accuracy);
  }
  
}