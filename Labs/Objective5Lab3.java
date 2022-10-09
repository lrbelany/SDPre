import java.util.Scanner;

public class Objective5Lab3 {

  public static void main(String[] args) {
int userNum;
      Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    userNum = scanner.nextInt();


if( userNum > 0 ) {
System.out.println( userNum + " Is a positive number!");
}
else if ( userNum <= 0 ) {
System.out.println("You got me messed up! Why did you pick Zero!?!?!?");

}
scanner.close();
  }
}
