import java.util.Scanner;

 public class Objective9Lab3 {
   public static void main(String[] args) {
int selection;
Scanner scanner = new Scanner(System.in);
printMenu();
selection = scanner.nextInt();
while(selection !=3 ){
  if (selection == 1) {
         System.out.println("Wassup Big Dawg!!!");
         printMenu();
         selection = scanner.nextInt();
       }
else if (selection == 2) {
  System.out.println("you know we wants the Ribeye,The Lobster, and the Scrimp and Grits!! That Surf and Turf! Feel me!?");
  printMenu();
  selection = scanner.nextInt();
}


else{
  System.out.println("Bug check!");
  printMenu();
  selection = scanner.nextInt();
}
}
System.out.println("Aight Fam! One!");
scanner.close();
}
     public static void printMenu() {

       System.out.println("_____Menu_____");
       System.out.println("1: Say Hello");
       System.out.println("2: List My favorite foods");
       System.out.println("3: Exit");
       System.out.print("Pick one my Guy!");

}

}
