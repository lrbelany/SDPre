import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {

int selection; 

    System.out.println("_____Menu_____");
    System.out.println("1: Say Wassup!");
    System.out.println("2: List My Favorite Foods!!");
    System.out.println("3: Exit");
    System.out.print("Please enter your selection: ");

Scanner scanner = new Scanner(System.in);

    selection = scanner.nextInt();

while(selection !=3) {

if (selection == 1) {
System.out.println("Hello! You Beautiful individual!!!");
}

else if (selection == 2) {
System.out.println(" You like Pizza, Lasagna, aaaand Suuuushiiii!!!!");
}

else {
  System.out.println("Checking for bugs are we? hmmmmmmmmmm!?");
}

   System.out.println("_____Menu_____");
   System.out.println("1: Say Wassup!");
   System.out.println("2: List My Favorite Foods!!");
   System.out.println("3: Exit");
   System.out.println("Please enter your selection ");

   selection = scanner.nextInt();

    }
  System.out.println("One Love! Peace out!!");
scanner.close();
  }
}
