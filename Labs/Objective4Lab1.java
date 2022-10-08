import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);


    String fname = "userInput.nextLine()";
    String lname = "userInput.nextLine()";
    String favoriteAnimal = "userInputinput.nextLine()";
    String favoriteFood = "userInputinput.nextLine()";
    String favoriteSong = "userInput.nextLine()";


    System.out.println("Press Enter To Continue");
    String userInput = keyboard.nextLine();

    System.out.println("What is your first name?");
fname = keyboard.nextLine();
System.out.println("Hello "+fname+"!");

    System.out.println("What is your last name?");
lname = keyboard.nextLine();
System.out.println("Your Last Name Is: " + lname);

    System.out.println("What is your favorite animal?");
favoriteAnimal = keyboard.nextLine();
System.out.println("Your Spirit Animal is The Majestic "+favoriteAnimal);

    System.out.println("What is your favorite food?");
favoriteFood = keyboard.nextLine();
System.out.println(favoriteFood+" Is Or Are NumNumS!!");

    System.out.println("What is your favorite song?");
favoriteSong = keyboard.nextLine();
System.out.println(favoriteSong+" Slaps Hella HardT!!!!");


  }
}
