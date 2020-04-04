import java.util.*;

class Main {
  public static void main(String[] args) {

    //User Input//
    System.out.println("\n____________________________");
    Scanner input = new Scanner(System.in);
    System.out.println("Please Enter Your Name: ");
    String name = input.nextLine();

    //Passing information to Player Class//
    Sport player = new Sport(name);

    //Two choices - average and stats//
    System.out.println("\nAlright..." + player.getName() + "!"+ "\nChoose: \n1. Calculate Average Of X Games \n2. Stats");
    int choice = input.nextInt();
    if(choice == 1) {
      //Calling average method//
      player.average();
    }

    else if(choice == 2) {
      //Printing out players statistics//
      int[] speeds = {1,50,1000};
      int[] acc = {17,68,99};
      int[] score = {194,186,300};
      String[] players = {"Evan Huang","Jack Turuy","Joshua Hans"};
      Scanner userInput = new Scanner(System.in);
      System.out.println("\nEnter the player's name: ");
      String p = userInput.nextLine();
      for(int i = 0 ; i < players.length;i++) {
        if(p.equals(players[i])) {
          System.out.println("\n" + players[i]);
          player.speed(players[i], speeds);
          System.out.println("His highest game was " + player.highestScore(score[i]));
          System.out.println("He bowled " + player.newGames(5) + " games");
          player.Accuracy(acc[i]);
        }
      } 
    }
  }
}