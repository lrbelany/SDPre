import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {

    double num,remainder;

        System.out.println("Please enter a number");
            Scanner scan = new Scanner(System.in);

num = scan.nextDouble();


remainder = num % 2;
if( remainder == 0 ) {
   System.out.println(num+" is an even number!!!");
}
else {
     System.out.println(num+"is an odd number and the remainder is lonely and sad :(....)");
}
scan.close();
  }
}
