import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 1, num2 = 7, num3 = 5;
int resultr = (num1 + num2 + num3);

    double dub1 = 1.1, dub2 = 2.2, dub3 = 3.3;
double resultd = (dub1 + dub2 + dub3);

System.out.println("Please enter the first whole number you would like to add");
keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add");
    keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add");
    keyboard.nextInt();

    System.out.println("Please enter the first demimal number you would like to add");
    keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add");
    keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add");
    keyboard.nextDouble();

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + resultr);
    keyboard.nextLine();

    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + resultd);
  }
}
